package com.demo.Carpool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.Carpool.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User getByEmail(String email);

	@Query(value="select * from users where email=?1 and password=?2", nativeQuery = true)
	public User getByEmailAndPassword(String email, String password);

	
	
}
