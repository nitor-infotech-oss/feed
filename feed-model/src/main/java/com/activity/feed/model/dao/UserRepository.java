package com.activity.feed.model.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activity.feed.model.User;

@Repository
public interface UserRepository extends  JpaRepository<User, Long>{

	Optional<User> findById(Long id);
	User findByName(String name);
	User findByUserName(String userName);
}
