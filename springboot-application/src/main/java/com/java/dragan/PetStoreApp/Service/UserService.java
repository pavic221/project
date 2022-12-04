package com.java.dragan.PetStoreApp.Service;


import com.java.dragan.PetStoreApp.Models.Users;
import org.springframework.stereotype.Service;

import java.util.List;

//import java.util.List;


@Service
public interface UserService {

    //create user
    public Users createUser(Users users) throws Exception;

    //get all users
   List<Users> getAllUsers();

   //Save User
    Users saveUser(Users user);

}
