package fr.eni.dal;

import fr.eni.bo.Jewel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JewelDao extends JpaRepository<Jewel, Integer> {

}
