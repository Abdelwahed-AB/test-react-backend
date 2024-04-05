package com.library.testreact.services;

import com.library.testreact.entities.User;
import com.library.testreact.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id){
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("Can't find user with id: "+ id));
    }

    @Override
    public void createUser(User user){
        user.setId(0L);
        userRepository.save(user);
    }

    @Override
    public void updateUser(Long id, User user){
        user.setId(id);
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
