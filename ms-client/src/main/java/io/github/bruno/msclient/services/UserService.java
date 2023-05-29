package io.github.bruno.msclient.services;

import io.github.bruno.msclient.entities.UserEntity;
import io.github.bruno.msclient.exceptions.UserNotFoundException;
import io.github.bruno.msclient.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    private final Logger logger = Logger.getLogger(UserService.class.getName());


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("Finding one user by name " + username);
        UserEntity byUserName = userRepository.findByUserName(username);
        if (byUserName != null) return byUserName;
        throw new UserNotFoundException();
    }
}
