package fr.eni.bll;

import fr.eni.bo.Jewel;
import fr.eni.dal.JewelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JewelServiceImpl implements JewelService{
    @Autowired
    private JewelDao jewelDao;

    public void createNewJewel(Jewel jewel) {
        jewelDao.save(jewel);
    }
}