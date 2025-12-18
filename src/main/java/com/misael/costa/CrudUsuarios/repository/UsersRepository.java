package com.misael.costa.CrudUsuarios.repository;

import com.misael.costa.CrudUsuarios.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
}
