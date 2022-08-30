package com.pwc.anemoi.vendor.roles.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pwc.anemoi.vendor.roles.exceptions.RolesException;
import com.pwc.anemoi.vendor.roles.model.Roles;
import com.pwc.anemoi.vendor.roles.repo.RoleRepository;
import com.pwc.anemoi.vendor.roles.service.RolesService;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class RolesServiceImpl implements RolesService {

	Logger logger = LoggerFactory.getLogger(RolesServiceImpl.class);

//	private Roles role;

	@Inject
	private RoleRepository roleRepository;

	public Roles createRoles(Roles roles) {
		logger.info("Creating the new role");
		Roles Role = this.roleRepository.save(roles);
		logger.info("New role created");
		return Role;
	}

	@Override
	public Roles editRoles(Roles roles, Integer roleId) throws RolesException {
		logger.info("Inside the method to update the role");
		logger.info("checking role is exist or not");
		roles = this.roleRepository.findById(roleId).orElseThrow(() -> new RolesException("Roles", "roleId", roleId));

		logger.info("Updating the role");
		roles.setRoleName(roles.getRoleName());
		roles.setNumOfUsers(roles.getNumOfUsers());
		roles.setDescription(roles.getDescription());
		roles.setAccessItem(roles.getAccessItem());
		roles.setVendorTemplateAccess(roles.getVendorTemplateAccess());
		roles.setDashboardAccess(roles.getDashboardAccess());
		roles.setMasterRepoAccess(roles.getMasterRepoAccess());
		roles.setStatus(roles.isStatus());

		logger.info("Role updated....");
		Roles update = this.roleRepository.update(roles);

//		 Roles save = this.roleRepository.save(roles);
		logger.info("something went wrong");
//		save.toString();
		return update;

	}

	@Override
	public Roles getSingleRoleById(Integer roleId) throws RolesException {
		logger.info("Inside the method to get the role by role id....");
		logger.info("checking role is exsits or not..");
		Roles role = this.roleRepository.findById(roleId)
				.orElseThrow(() -> new RolesException("Roles", "roleId", roleId));
		return role;
	}

	@Override
	public List<Roles> getAllRolls() {
		logger.info("Inside the method to get all the roles");
		logger.info("Getting the list of the roles");
		List<Roles> roles = this.roleRepository.findAll();
		return roles;
	}

	@Override
	public List<Roles> searchBykeyword(String keywords) {
		logger.info("Inside the search method");
		List<Roles> findByTitleContaining = this.roleRepository.findByTitleContaining("%" + keywords + "%");
		return findByTitleContaining;
	}

	@Override
	public String deleteSingleRoleById(Integer roleId) {
		logger.info("Inside the method to delete the role");
		logger.info("finding the role by id");
		Roles role = this.roleRepository.findById(roleId)
				.orElseThrow(() -> new RolesException("Roles", "roleId", roleId));
		this.roleRepository.delete(role);
		return "Role deleted successfully.";
	}

}
