package com.fp.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fp.model.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long>{

	User findFirstByUsername(@Param("username") String username);
	User findFirstByUsernameAndPassword(@Param("username") String username, 
			@Param("password") String password);
}