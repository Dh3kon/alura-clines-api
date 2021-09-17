package br.com.caelum.clines.api.users;

import br.com.caelum.clines.shared.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserViewMapperTest {

    private final String NAME = "Anna Smith";
    private final String EMAIL = "anna@email.com";
    private final String PASSWORD = "qwerty";

    private UserViewMapper mapper;

    @Test
    @DisplayName("Should convert user to user view")
    void shouldConvertUserToUserView() {
        var user = new User(NAME, EMAIL, PASSWORD);
        mapper = new UserViewMapper();
        var userView = mapper.map(user);
        assertEquals(NAME, userView.getName());
        assertEquals(EMAIL, userView.getEmail());
    }
}