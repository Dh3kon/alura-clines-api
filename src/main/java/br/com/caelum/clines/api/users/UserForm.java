package br.com.caelum.clines.api.users;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor
@Getter
public class UserForm {

    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String password;

}
