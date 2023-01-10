package fr.eni.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(JewelCartId.class)
public class JewelCart {

    @Id
    private Jewel jewel;
    @Id
    private Cart cart;
    private int quantity;

    public JewelCart(Jewel jewel, Cart cart, int quantity) {
        this.jewel = jewel;
        this.cart = cart;
        this.quantity = quantity;
    }

    public JewelCart(Cart cart, int quantity) {
        this.cart = cart;
        this.quantity = quantity;
    }

    public JewelCart() {
    }

    public Jewel getJewel() {
        return jewel;
    }

    public void setJewel(Jewel jewel) {
        this.jewel = jewel;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
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
