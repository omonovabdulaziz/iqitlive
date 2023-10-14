package uz.iq.iqgame.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;
import uz.iq.iqgame.payload.*;
import uz.iq.iqgame.service.AuthenticationService;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@EnableWebSecurity
public class AuthController {
    private final AuthenticationService authenticationService;


    @PostMapping("/register")
    public ResponseEntity<ApiResponse> registerUser(@Valid @RequestBody RegisterDTO registerDTO) {
        return authenticationService.registerUser(registerDTO);
    }

    @GetMapping("/login")
    public ResponseEntity<?> loginUser(@Valid @RequestBody LoginDTO loginDTO) {
        return authenticationService.loginUser(loginDTO);
    }


    @GetMapping("/verifyEmail")
    public ResponseEntity<?> verifyEmail(@RequestParam String emailCode, @RequestParam String email) {
        return authenticationService.verifyEmail(emailCode, email);
    }

    @PutMapping("/forgetPassword")
    public ResponseEntity<ApiResponse> forgetPassword(@RequestBody ForgetPasswordDTO passwordDTO) {
        return authenticationService.forgetPassword(passwordDTO);
    }

    @PutMapping("/verifyEmailNewPassword")
    public ResponseEntity<ApiResponse> verifyEmailNewPassword(@RequestParam String emailCode, @RequestBody ForgetNewPasswordDTO passwordDTO) {
        return authenticationService.verifyEmailNewPassword(emailCode, passwordDTO);
    }
}
