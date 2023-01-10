package fr.eni.bo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Jewel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Le nom est obligatoire")
    private String name;

    private String description;

    @NotNull(message = "Le prix est obligatoire")
    private float price;

    @NotNull(message = "La photo est obligatoire")
    private String photo;

    @NotNull(message = "Le stock est obligatoire")
    private int stock;

    @ManyToOne
    private JewelType type;

    public Jewel() {
        super();
    }

    public Jewel(int id, String name, String description, float price, String photo, int stock, JewelType idType) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.photo = photo;
        this.stock = stock;
        this.type = idType;
    }

    public Jewel(String name, String description, float price, String photo, int stock, JewelType idType) {
        super();
        this.name = name;
        this.description = description;
        this.price = price;
        this.photo = photo;
        this.stock = stock;
        this.type = idType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public JewelType getIdType() {
        return type;
    }

    public void setIdType(JewelType idType) {
        this.type = idType;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Jewel [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", description=");
        builder.append(description);
        builder.append(", price=");
        builder.append(price);
        builder.append(", photo=");
        builder.append(photo);
        builder.append(", stock=");
        builder.append(stock);
        builder.append(", idType=");
        builder.append(type);
        builder.append("]");
        return builder.toString();
    }


}
