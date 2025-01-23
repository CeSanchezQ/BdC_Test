package cl.bch.technique.test.test.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cl.bch.technique.test.test.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository{

    @Value("${file.jsonDatabase.path}")
    private String filePath;

    private List<User> userList;

    ObjectMapper objectMapper = new ObjectMapper();

    public UserRepositoryImpl(){
        Resource resource = new ClassPathResource("UserDatabase.json");
        //ObjectMapper objectMapper = new ObjectMapper();
        try {
            userList = new ArrayList<>(Arrays.asList(objectMapper.readValue(resource.getFile(), User[].class)));
        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User login(String user, String password) {
        return new User(1L,"12508387-0","test","test","1996-05-10","213212656","test@gmail.com","",0L,true,"1234");
    }

    @Override
    public User serchByid(Long id) {
        return userList.stream().filter(user -> {
            return user.getId().equals(id);
        }).findFirst().orElse(null);
    }

    @Override
    public User save(User user) {
        user.setId(userList.size() + 1L);
        List<User> userNewList = new ArrayList<>(userList);
        userNewList.add(user);
        Resource resource = new ClassPathResource("C:\\Users\\under\\OneDrive\\Escritorio\\Prueba tecnica\\UserDatabase.json");
        //ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(resource.getFile(), userNewList);
            return user;
        } catch (StreamWriteException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
