package com.metrologist.beta.repository;


import com.metrologist.beta.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Roles, Integer> {
    Roles findByName(String name);


}
