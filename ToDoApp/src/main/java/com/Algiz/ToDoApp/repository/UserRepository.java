package com.Algiz.ToDoApp.repository;

import com.Algiz.ToDoApp.dataBase.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT count(us) from User us where name = ?1 and mdp = ?2")
    Integer findUser(String username,String mdp);

    @Query("SELECT count(us) from User us")
    Integer countUser();

}
