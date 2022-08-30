package com.pwc.anemoi.vendor.roles.service;


import java.util.List;

import com.pwc.anemoi.vendor.roles.exceptions.RolesException;
import com.pwc.anemoi.vendor.roles.model.Roles;

public interface RolesService {

	Roles createRoles(Roles roles);

	Roles editRoles(Roles roles, Integer roleId) throws RolesException;

	Roles getSingleRoleById(Integer roleId) throws RolesException;

	List<Roles> getAllRolls();

	List<Roles> searchBykeyword(String keywords);

	String deleteSingleRoleById(Integer roleId);

//	void deleteRoles();

}