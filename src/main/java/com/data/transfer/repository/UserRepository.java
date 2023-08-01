package com.data.transfer.repository;

import com.data.transfer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


    User getUserById(Long id);
}
