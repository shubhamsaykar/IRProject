package com.pwc.anemoi.vendor.roleController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pwc.anemoi.vendor.roles.exceptions.RolesException;
import com.pwc.anemoi.vendor.roles.model.Roles;
import com.pwc.anemoi.vendor.roles.service.RolesService;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Patch;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/role")
public class RoleController {

	Logger logger = LoggerFactory.getLogger(RoleController.class);

	@Inject
	private RolesService rolesService;

//	this method creat the role 
	@Post("/createRole")
	public HttpResponse<Roles> createRoles(@Body Roles roles) throws RolesException {
		logger.info("inside the role creating controller");
		logger.debug("new role is creating");
		Roles response = rolesService.createRoles(roles);
		return HttpResponse.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(response);
	}

//	this method is used to update the role 
	@Patch("/updateRoles/{roleId}")
	public HttpResponse<Roles> editRoles(@Body Roles roles, @PathVariable Integer roleId) throws RolesException {
		logger.info("inside the role edit controller");
		logger.debug("new role is updating");
		Roles UpdatedRole = rolesService.editRoles(roles, roleId);
		return HttpResponse.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(UpdatedRole);
	}

	@Get("/{roleId}")
	public HttpResponse<Roles> getSingleRole(@PathVariable Integer roleId) throws RolesException {
		logger.info("inside the get role controller");
		logger.debug("get a single roll");
		Roles singleRoleById = rolesService.getSingleRoleById(roleId);
		return HttpResponse.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(singleRoleById);

	}

	@Get("/list")
	public HttpResponse<List<Roles>> getAllRoles() {
		logger.info("inside the role listing controller");
		logger.debug(" role are listed");
		List<Roles> allRolls = rolesService.getAllRolls();
		return HttpResponse.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(allRolls);

	}

	@Get("/{keywords}")
	public HttpResponse<List<Roles>> serachByValue(@PathVariable("keywords") String keywords) {
		logger.info("inside the role searching controller");
		logger.debug("new role is searching");
		List<Roles> result = rolesService.searchBykeyword(keywords);
		return HttpResponse.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON).body(result);
	}

	@Delete("/{roleId}")
	public HttpResponse<String> deleteById(@PathVariable Integer roleId) throws RolesException {
		logger.info("inside the role deleting controller");
		logger.debug("new role is deleted");
		rolesService.deleteSingleRoleById(roleId);
		return HttpResponse.status(HttpStatus.OK).contentType(MediaType.APPLICATION_JSON)
				.body("Role Deleted Successfully.");

	}

}
