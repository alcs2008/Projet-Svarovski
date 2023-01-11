package fr.eni.bll;

import fr.eni.bo.User;

public interface UserService {

    public void createNewUser(User user);
    public User connectUser(String email, String password);

}
