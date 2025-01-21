package cl.bch.technique.test.test.service;

import cl.bch.technique.test.test.model.dto.UserDto;

public interface UserService {
    
    public UserDto serchById(Long id);
    public UserDto save(UserDto userDto);

}
