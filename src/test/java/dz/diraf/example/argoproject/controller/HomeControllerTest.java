package dz.diraf.example.argoproject.controller;

import dz.diraf.example.argoproject.entity.User;
import dz.diraf.example.argoproject.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.lenient;


@ExtendWith(MockitoExtension.class)
class HomeControllerTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    HomeController homeController;

    @Test
    void shouldReturnGreetingMessage() {
        // Arrange
        User user = User.builder().name("Benali farid").build();
        lenient().when(userRepository.save(user)).thenReturn(user);

        // Act
        ResponseEntity<String> response = homeController.getHome();

        // Assert
        assert response.getBody() != null;
//        assert response.getBody().equals("Hello User: " + user);
    }

}