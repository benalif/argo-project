package dz.diraf.example.argoproject.controller;

import dz.diraf.example.argoproject.entity.User;
import dz.diraf.example.argoproject.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private final UserRepository userRepository;

    @GetMapping("/")
    public ResponseEntity<String> getHome() {
        User user = User.builder().name("Benali farid").build();
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok("Hello User: " + savedUser);
    }
}
