package uz.iq.iqgame.service;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import uz.iq.iqgame.payload.*;

public interface AuthenticationService extends UserDetailsService {
    ResponseEntity<ApiResponse> adminAuth(LoginDTO loginDTO);

    ResponseEntity<ApiResponse> registerUser(RegisterDTO registerDTO);

    ResponseEntity<ApiResponse> loginUser(LoginDTO loginDTO);

    ResponseEntity<ApiResponse> verifyEmail(String emailCode, String email);

    ResponseEntity<ApiResponse> forgetPassword(ForgetPasswordDTO passwordDTO);

    ResponseEntity<ApiResponse> verifyEmailNewPassword(String emailCode , ForgetNewPasswordDTO passwordDTO);

}
