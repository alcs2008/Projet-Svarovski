package fr.eni.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(JewelCartId.class)
public class JewelCart {

    @Id
    private int jewel;
    @Id
    private int cart;
    private int quantity;

    public JewelCart(int jewel, int cart, int quantity) {
        this.jewel = jewel;
        this.cart = cart;
        this.quantity = quantity;
    }

    public JewelCart(int cart, int quantity) {
        this.cart = cart;
        this.quantity = quantity;
    }

    public JewelCart() {
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "JewelCart{" +
                "jewel=" + jewel +
                ", cart=" + cart +
                ", quantity=" + quantity +
                '}';
    }
}
