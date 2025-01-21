package cl.bch.technique.test.test.repository;

import cl.bch.technique.test.test.model.User;

public interface UserRepository {

    public User login(String user, String password);
    public User serchByid(Long id);
    public User save(User user);
}
