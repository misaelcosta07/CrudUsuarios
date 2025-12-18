package com.misael.costa.CrudUsuarios.controller;

import com.misael.costa.CrudUsuarios.entity.Users;
import com.misael.costa.CrudUsuarios.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class UsersController {

    @Autowired
    private UsersService usersService;

    // listar (get)
    @GetMapping("/list")
    public List<Users> listUser(){
        return usersService.listUser();
    }
    // adicionar (post)
    @PostMapping("/create")
    public Users createUsers(@RequestBody Users user){
        return usersService.createUser(user);
    }
    // update - editar (put)
    @PutMapping("/{id}")
    public Users editarById(@PathVariable Long id, @RequestBody Users user) {
            return usersService.update(id, user);
    }
    // deletar (delete)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        usersService.deleteByID(id);
    }
}
