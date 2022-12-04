package com.java.dragan.PetStoreApp.Service;


import com.java.dragan.PetStoreApp.Models.Users;
import com.java.dragan.PetStoreApp.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {



//This is the Service class for Users here is written the code that
    // Create , Save and List to added Users .

    @Autowired
    private UsersRepository usRepo;


    @Override
    public Users createUser(Users users) throws Exception {


        Users local=this.usRepo.findByUserName(users.getUsername());
        if (local != null){
            System.out.println("User is already there!!");
            throw new Exception("User already present");
        }

        return null;
    }

    @Override
    public List<Users> getAllUsers() {
        return usRepo.findAll();
   }

    @Override
    public Users saveUser(Users user) {
        return usRepo.save(user);
    }

}