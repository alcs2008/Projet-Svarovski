package fr.eni.bo;

import javax.persistence.IdClass;
import java.io.Serializable;

public class JewelCartId implements Serializable {
    private Jewel jewel;
    private Cart cart;

    public JewelCartId(Jewel jewel, Cart cart) {
        this.jewel = jewel;
        this.cart = cart;
    }
}
