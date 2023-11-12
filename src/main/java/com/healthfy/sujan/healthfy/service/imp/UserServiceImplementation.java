package com.healthfy.sujan.healthfy.service.imp;

import com.healthfy.sujan.healthfy.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    @Override
    public String loginUser(String username, String password) {

        return null;
    }

//    private String createJWT(String id, String issuer, String subject, long ttlMillis){
//        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
//
//        long nowMillis = System.currentTimeMillis();
//        Date now = new Date(nowMillis);
//    }
}
