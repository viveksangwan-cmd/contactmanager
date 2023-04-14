package com.viveksangwan.contactmanager.dao;

import com.viveksangwan.contactmanager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}