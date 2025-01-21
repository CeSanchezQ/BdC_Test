package cl.bch.technique.test.test.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
    private Long id;
    private String rut;
    private String first_name;
    private String last_name;
    private String date_birth;
    private String mobile_phone;
    private String email;
    private String adress;
    private Long city_id;
    private boolean session_active;
    private String password;
}
