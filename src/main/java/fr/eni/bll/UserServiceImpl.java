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
        if(user.getPassword().equals(user.getRetypedPassword())){
            userDao.save(user);
        }
    }

    public User connectUser(String email, String password) {
        User user = userDao.getUserByEmailAndPassword(email, password);
        return user;
    }
}
