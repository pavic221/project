package com.java.dragan.PetStoreApp.Service;

import com.java.dragan.PetStoreApp.Models.Users;
import com.java.dragan.PetStoreApp.Repository.UsersRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class UserServiceImplTest {

    @Test
    void createUser() {




        Users user1 = new Users(1 , "Dragan" , "masina123"  ,"Pavic" , "adresssa1" , 1112){

            public  Users SaveUser(Users user1){
                 return  usRepo.save(user1);

//                 assertTrue(user1.getFirstName("Dragan"));

            }

            private void assertTrue (boolean equals) {

            }

                @Autowired
            UsersRepository usRepo;


        };


    }


}