package fr.eni.converter;

import fr.eni.bll.JewelTypeService;
import fr.eni.bo.JewelType;
import fr.eni.dal.JewelTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StringToJewelTypeConverter implements Converter<String, JewelType> {

    private JewelTypeService jewelTypeService;

    private JewelTypeDao jewelTypeDao;
    @Autowired
    public void setJewelTypeService(JewelTypeService jewelTypeService, JewelTypeDao jewelTypeDao) {
        this.jewelTypeService = jewelTypeService;
        this.jewelTypeDao = jewelTypeDao;
    }

    @Override
    public JewelType convert(String id) {
        System.out.println("Convert - "+ id );
        Integer theId = Integer.parseInt(id);
        return jewelTypeDao.findById(theId).orElse(null);
    }

}
