package ua.neilo.poster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ua.neilo.poster.domain.Role;
import ua.neilo.poster.domain.User;
import ua.neilo.poster.repository.UserRepository;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Controller
public class RegistrationController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String registrationNewUser(User user,
                                      Map<String, Object> model) {
        User userFromDB = userRepository.findByLogin(user.getLogin());

        if (userFromDB != null) {
            model.put("message", "User exists!");
            return "registration";
        }

        user.setActive(true);
        Set<Role> roles = new HashSet<>();
        roles.add(Role.ADMIN);
        user.setRoles(roles);

        userRepository.save(user);

        return "redirect:/login";
    }
}
