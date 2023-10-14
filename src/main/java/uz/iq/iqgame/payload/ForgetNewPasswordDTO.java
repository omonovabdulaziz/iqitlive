package uz.iq.iqgame.payload;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ForgetNewPasswordDTO {
    @NotNull(message = "Email kiriting")
    private String email;

    @NotNull(message = "Password kiriting")
    private String newPassword;
}
