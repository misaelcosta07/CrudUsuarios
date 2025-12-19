package com.misael.costa.CrudUsuarios.controller;

import com.misael.costa.CrudUsuarios.entity.Users;
import com.misael.costa.CrudUsuarios.service.UsersService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@Tag(name = "cadastrados", description = "gerenciador de cadastro")
public class UsersController {

    @Autowired
    private UsersService usersService;

    // listar (get)
    @GetMapping("/list")
    @Operation(summary = "Listar usuarios", description = "Lista todos os usuarios cadastrados, salvos no DB.")
    public ResponseEntity<List<Users>> listUser(){
       List<Users> users = usersService.listUser();
        return ResponseEntity.status(200).body(users);
    }
    // adicionar (post)
    @PostMapping("/create")
    @Operation(summary = "Cradastrar usuarios", description = "Cria e cadastra o usuario no DB")
    public ResponseEntity<Users> createUsers(@RequestBody Users user){
      Users userNovo =  usersService.createUser(user);
        return ResponseEntity.status(201).body(userNovo);
    }
    // update - editar (put)
    @PutMapping("/{id}")
    @Operation(summary = "Altera dados dos usuarios", description = "atualiza dados do usuario ja salvo no DB por ID.")
    public ResponseEntity<Users> editarById(@PathVariable Long id, @RequestBody Users user) {
      Users userNovo =  usersService.update(id, user);
            return ResponseEntity.status(201).body(userNovo);
    }
    // deletar (delete)
    @DeleteMapping("/{id}")
    @Operation(summary = "Deleta usuarios", description = "deleta usuarios por ID criados no DB.")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        usersService.deleteByID(id);
        return ResponseEntity.status(204).build(); // build - no content nao retorna corpo
    }
}
