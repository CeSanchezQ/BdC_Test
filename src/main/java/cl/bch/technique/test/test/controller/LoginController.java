package cl.bch.technique.test.test.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import cl.bch.technique.test.test.model.dto.UserDto;

@RestController
public class LoginController {

    private static final Log LOGGER = LogFactory.getLog(LoginController.class);

    @GetMapping("/cliente/login")
    public UserDto login(@RequestBody UserDto user){
        LOGGER.info("Se ha realizado una petición de login para el usuario: " + user.getRut());
        return new UserDto(1L,"12508387-0","test","test","1996-05-10","213212656","test@gmail.com","",0L,true,"1234");
    }
}
