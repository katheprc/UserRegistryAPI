package com.katheprc.UserRegistryAPI.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.katheprc.UserRegistryAPI.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByName(@Param("name") String name);
	
}
