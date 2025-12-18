package com.misael.costa.CrudUsuarios.controller;

import com.misael.costa.CrudUsuarios.entity.Users;
import com.misael.costa.CrudUsuarios.service.UsersService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
@Tag(name = "cadastrados", description = "gerenciador de cadastro")
public class UsersController {

    @Autowired
    private UsersService usersService;

    // listar (get)
    @GetMapping("/list")
    @Operation(summary = "Listar usuarios", description = "Lista todos os usuarios cadastrados, salvos no DB.")
    public List<Users> listUser(){
        return usersService.listUser();
    }
    // adicionar (post)
    @PostMapping("/create")
    @Operation(summary = "Cradastrar usuarios", description = "Cria e cadastra o usuario no DB")
    public Users createUsers(@RequestBody Users user){
        return usersService.createUser(user);
    }
    // update - editar (put)
    @PutMapping("/{id}")
    @Operation(summary = "Altera dados dos usuarios", description = "atualiza dados do usuario ja salvo no DB por ID.")
    public Users editarById(@PathVariable Long id, @RequestBody Users user) {
            return usersService.update(id, user);
    }
    // deletar (delete)
    @DeleteMapping("/{id}")
    @Operation(summary = "Deleta usuarios", description = "deleta usuarios por ID criados no DB.")
    public void deleteById(@PathVariable Long id){
        usersService.deleteByID(id);
    }
}
