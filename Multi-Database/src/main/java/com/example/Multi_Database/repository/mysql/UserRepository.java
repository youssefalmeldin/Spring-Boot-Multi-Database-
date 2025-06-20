package com.example.Multi_Database.repository.mysql;

import com.example.Multi_Database.model.mysql.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}