package fr.eni.bll;

import fr.eni.bo.User;
import fr.eni.dal.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void createNewUser(User user){
        //verif confirm mot de passe
        userDao.save(user);
    }
}
