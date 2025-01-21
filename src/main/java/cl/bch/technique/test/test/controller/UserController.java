package cl.bch.technique.test.test.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.bch.technique.test.test.model.User;
import cl.bch.technique.test.test.model.dto.UserDto;
import cl.bch.technique.test.test.service.UserService;

@RestController
@RequestMapping("/cliente")
public class UserController {

    private static final Log LOGGER = LogFactory.getLog(UserController.class);
    
    @Autowired
    private UserService userService;

    @GetMapping("/consulta/{id}")
    public UserDto consultar(@PathVariable Long id){
        LOGGER.info("---- Se ha realizado una consulta de usuario por id: "+ id + "-----");
        UserDto userDto = userService.serchById(id);
        return userDto;
    }

    @PutMapping("/guardar")
    public ResponseEntity<?> guardar(@RequestBody UserDto userDto){
        LOGGER.info("---- Se ha realizado la petición de guardar los datos del usuario con lo siguientes datos: "+ userDto.toString() + "-----");
        try{
           UserDto userSaved = userService.save(userDto);
           return ResponseEntity.status(HttpStatus.CREATED).body(userSaved);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ocurrió un error al crear al usuario");
        }
    } 

}
