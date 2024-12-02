package kz.bitlab.springboot.springsecuritytask.service;


import kz.bitlab.springboot.springsecuritytask.model.User;
import kz.bitlab.springboot.springsecuritytask.model.UserRole;
import kz.bitlab.springboot.springsecuritytask.repository.RoleRepository;
import kz.bitlab.springboot.springsecuritytask.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public void registerUser(String email, String name, String password) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        user.setPassword(passwordEncoder.encode(password));
        UserRole role = roleRepository.findByName("ROLE_USER")
                .orElseThrow(() -> new RuntimeException("Role not found"));
        user.setRoles(Set.of(role));
        userRepository.save(user);
    }

}
