package cl.bch.technique.test.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String rut;
    private String first_name;
    private String last_name;
    private String date_birth;
    private String mobile_phone;
    private String email;
    private String address;
    private Long city_id;
    private boolean session_active;
    private String password;
}
