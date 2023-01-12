package fr.eni.bll;

import fr.eni.bo.Jewel;

import java.util.List;

public interface JewelService {
    public void createNewJewel(Jewel jewel);
    public List<Jewel> getAllJewel();
}
