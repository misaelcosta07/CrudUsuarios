package com.misael.costa.CrudUsuarios.service;

import com.misael.costa.CrudUsuarios.entity.Users;
import com.misael.costa.CrudUsuarios.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepository repository;

    // criar
    public Users createUser(Users user){
        return repository.save(user);
    }
    // listar
    public List<Users> listUser(){
        List<Users> list = repository.findAll();
        return list;
    }
    // buscarPorID
    public Optional<Users> searchById(Long id){
        Optional<Users> optionalUsers = repository.findById(id);
        return optionalUsers;
    }
    //atualizar
    public Users update(Long id, Users user) {
       Users existingUser = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        return repository.save(existingUser);
    }
    // deleltarPorID
    public void deleteByID(Long id){
                if(!repository.existsById(id)){
                    throw new RuntimeException("Usuario nao encontrado");
                }
        repository.deleteById(id);
    }

}
