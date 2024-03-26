package com.laioffer.airbnb.service;

import com.laioffer.airbnb.model.Authority;
import com.laioffer.airbnb.model.User;
import com.laioffer.airbnb.model.UserRole;
import com.laioffer.airbnb.repository.AuthorityRepository;
import com.laioffer.airbnb.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RegisterService {
    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;
    public RegisterService(UserRepository userRepository, AuthorityRepository authorityRepository) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
    }
    @Transactional
    public void add(User user, UserRole role) {
        userRepository.save(user);
        authorityRepository.save(new Authority(user.getUsername(), role.name()));
    }
}
