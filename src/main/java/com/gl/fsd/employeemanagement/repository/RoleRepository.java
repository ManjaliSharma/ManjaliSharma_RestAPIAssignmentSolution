package com.gl.fsd.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.fsd.employeemanagement.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
