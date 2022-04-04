package com.revature.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.revature.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
