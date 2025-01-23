package cl.bch.technique.test.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bch.technique.test.test.model.User;
import cl.bch.technique.test.test.model.dto.UserDto;
import cl.bch.technique.test.test.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository UserRepository;

    @Override
    public UserDto serchById(Long id) {
        User user = UserRepository.serchByid(id);
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setRut(user.getRut());
        userDto.setFirst_name(user.getFirst_name());
        userDto.setLast_name(user.getLast_name());
        userDto.setDate_birth(user.getDate_birth());
        userDto.setMobile_phone(user.getMobile_phone());
        userDto.setEmail(user.getEmail());
        userDto.setAddress(user.getAddress());
        userDto.setCity_id(user.getCity_id());
        userDto.setSession_active(user.isSession_active());
        return userDto;
    }

    @Override
    public UserDto save(UserDto userDto) {
        User newUser = new User();
        newUser.setId(userDto.getId());
        newUser.setRut(userDto.getRut());
        newUser.setFirst_name(userDto.getFirst_name());
        newUser.setLast_name(userDto.getLast_name());
        newUser.setDate_birth(userDto.getDate_birth());
        newUser.setMobile_phone(userDto.getMobile_phone());
        newUser.setEmail(userDto.getEmail());
        newUser.setAddress(userDto.getAddress());
        newUser.setCity_id(userDto.getCity_id());
        newUser.setSession_active(userDto.isSession_active());
        newUser.setPassword(userDto.getPassword());

        UserRepository.save(newUser);
        return userDto;
    }

}
