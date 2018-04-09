package com.fp.service;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fp.repo.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("userDetailsService")
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.info("findFirstByUsername:{}", username);
		try {
			return userRepository.findFirstByUsername(username);
		}catch(Exception e) {
			log.error(e.getMessage(), e);
			throw new UsernameNotFoundException("Invalid credentials");
		}
	}

}
