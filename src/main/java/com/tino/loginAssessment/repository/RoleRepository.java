package com.tino.loginAssessment.repository;

import com.tino.loginAssessment.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
