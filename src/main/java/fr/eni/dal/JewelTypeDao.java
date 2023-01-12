package fr.eni.dal;

import fr.eni.bo.Jewel;
import fr.eni.bo.JewelType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JewelTypeDao extends JpaRepository<JewelType, Integer> {

}
