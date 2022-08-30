package com.pwc.anemoi.vendor.roles.repo;

import java.util.List;


import com.pwc.anemoi.vendor.roles.model.Roles;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer>{
	
	@Query("select r from roles r where r.title like:key")
	List<Roles> findByTitleContaining(@Parameter("key") String  title);

}
