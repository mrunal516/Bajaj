
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.UserClass;


@Repository
public interface UserRepository extends JpaRepository<UserClass, Integer>{
	
	

}
