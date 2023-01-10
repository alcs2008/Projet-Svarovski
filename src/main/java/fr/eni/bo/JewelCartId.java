package fr.eni.bo;

import javax.persistence.IdClass;
import java.io.Serializable;

public class JewelCartId implements Serializable {
    private int jewel;
    private int cart;

    //public JewelCartId(Jewel jewel, Cart cart) {
    //    this.jewel = jewel;
    //    this.cart = cart;
    //}

    public JewelCartId() {
    }

    public int getJewel() {
        return jewel;
    }

    public void setJewel(int jewel) {
        this.jewel = jewel;
    }

    public int getCart() {
        return cart;
    }

    public void setCart(int cart) {
        this.cart = cart;
    }
}
