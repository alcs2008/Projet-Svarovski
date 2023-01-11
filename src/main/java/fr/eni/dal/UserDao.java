package fr.eni.dal;

import fr.eni.bo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository <User, Integer>{

    public User getUserByEmailAndPassword(String email, String password);
}
