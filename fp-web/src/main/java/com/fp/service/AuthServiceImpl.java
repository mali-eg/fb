package com.fp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fp.model.Token;
import com.fp.repo.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	private UserRepository userRepo;
	
	public AuthServiceImpl() {
		
	}

	@Override
	public Token login(String userName, String password) {
		
//		User user = userRepo.findByUsernameAndPassword(userName, password);
//		List<String> authorities = Arrays.asList("ROLE_USER") ;
//		if(user != null) {
//			String token = Jwts.builder()
//	                .setSubject(userName)
//	                .setExpiration(new Date(System.currentTimeMillis() + Constants.EXPIRATION_TIME))
//	                .claim("authorities", authorities)
//	                .signWith(SignatureAlgorithm.HS512, Constants.SECRET.getBytes())
//	                .compact();
//			return new Token(token);
//		}else {
//			throw new InvalidCredentialsException();
//		}
		return null;
	}
	
	public boolean isValidToken(String token) {
//		String jwt = Jwts.parser()
//                .setSigningKey(Constants.SECRET.getBytes())
//                .parseClaimsJws(token.replace(Constants.TOKEN_PREFIX, ""))
//                .getBody()
//                .getSubject();
		return false;
	}

}
