package com.java.dragan.PetStoreApp.Repository;

import com.java.dragan.PetStoreApp.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    @Query("select u from Users u where u.username = :username")
    public Users findByUserName(String username);


}
