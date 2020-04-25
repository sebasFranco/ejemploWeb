package com.ejemploWeb.jpa.jpaRepositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemploWeb.domain.model.User;

public interface JpaUserRepository extends JpaRepository<User, Long>{

}
