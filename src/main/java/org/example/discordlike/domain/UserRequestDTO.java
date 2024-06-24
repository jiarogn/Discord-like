package org.example.discordlike.domain;

import lombok.Data;

@Data
public class UserRequestDTO {
    private String username;
    private String password;
    private String email;
    private Integer role;
}
