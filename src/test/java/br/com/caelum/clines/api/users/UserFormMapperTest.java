package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserFormMapperTest {

    private final String NAME = "Anna Smith";
    private final String EMAIL = "anna@email.com";
    private final String PASSWORD = "qwerty";

    private UserFormMapper mapper;

    @Test
    @DisplayName("Should convert to UserFormMapper when successful")
    void shouldConvertToUserFormMapper() {
        var userForm = new UserForm(NAME, EMAIL, PASSWORD);
        mapper = new UserFormMapper();
        var user = mapper.map(userForm);
        assertEquals(NAME, user.getName());
        assertEquals(EMAIL, user.getEmail());
        assertEquals(PASSWORD, user.getPassword());
    }
}