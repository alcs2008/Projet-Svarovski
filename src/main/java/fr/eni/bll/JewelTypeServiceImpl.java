package fr.eni.bll;

import fr.eni.bo.JewelType;
import fr.eni.dal.JewelTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JewelTypeServiceImpl implements JewelTypeService{
    @Autowired
    private JewelTypeDao jewelTypeDao;


    @Override
    public List<JewelType> getTypesList() {
        return jewelTypeDao.findAll();
    }
}