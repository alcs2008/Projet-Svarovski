package fr.eni.bo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Jewel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jewelId;
    //@NotNull(message = "Le nom est obligatoire")
    private String jewelName;
    @ManyToOne
    private JewelType jewelType;
    private String jewelSize;
    private String jewelDescriptive;
    //@NotNull(message = "Le prix est obligatoire")
    private float jewelPrice;
    //@NotNull(message = "La photo est obligatoire")
    private String jewelPhoto;
    //@NotNull(message = "Le stock est obligatoire")
    private int jewelStock;

// 3 constructeurs
    public Jewel() {
    }

    public Jewel(int jewelId, String jewelName, JewelType jewelType, String jewelSize, String jewelDescriptive, float jewelPrice, String jewelPhoto, int jewelStock) {
        this.jewelId = jewelId;
        this.jewelName = jewelName;
        this.jewelType = jewelType;
        this.jewelSize = jewelSize;
        this.jewelDescriptive = jewelDescriptive;
        this.jewelPrice = jewelPrice;
        this.jewelPhoto = jewelPhoto;
        this.jewelStock = jewelStock;
    }

    public Jewel(String jewelName, JewelType jewelType, String jewelSize, String jewelDescriptive, float jewelPrice, String jewelPhoto, int jewelStock) {
        this.jewelName = jewelName;
        this.jewelType = jewelType;
        this.jewelSize = jewelSize;
        this.jewelDescriptive = jewelDescriptive;
        this.jewelPrice = jewelPrice;
        this.jewelPhoto = jewelPhoto;
        this.jewelStock = jewelStock;
    }
// Getters / Setters

    public int getJewelId() {return jewelId;}

    public void setJewelId(int jewelId) {this.jewelId = jewelId;}

    public String getJewelName() {return jewelName;}

    public void setJewelName(String jewelName) {this.jewelName = jewelName;}

    public JewelType getJewelType() {
        return jewelType;
    }

    public void setJewelType(JewelType jewelType) {
        this.jewelType = jewelType;
    }

    public String getJewelDescriptive() {
        return jewelDescriptive;
    }

    public void setJewelDescriptive(String jewelDescriptive) {
        this.jewelDescriptive = jewelDescriptive;
    }

    public String getJewelSize() {return jewelSize;}

    public void setJewelSize(String jewelSize) {this.jewelSize = jewelSize;}

    public String getJawelDescriptive() {return jewelDescriptive;}

    public void setJawelDescriptive(String jawelDescriptive) {this.jewelDescriptive = jawelDescriptive;}

    public float getJewelPrice() {return jewelPrice;}

    public void setJewelPrice(float jewelPrice) {this.jewelPrice = jewelPrice;}

    public String getJewelPhoto() {return jewelPhoto;}

    public void setJewelPhoto(String jewelPhoto) {this.jewelPhoto = jewelPhoto;}

    public int getJewelStock() {return jewelStock;}

    public void setJewelStock(int jewelStock) {this.jewelStock = jewelStock;}

// ToString Method

    @Override
    public String toString() {
        return "Jewel{" +
                "jewelId=" + jewelId +
                ", jewelName='" + jewelName + '\'' +
                ", jewelType='" + jewelType + '\'' +
                ", jewelSize='" + jewelSize + '\'' +
                ", jawelDescriptive='" + jewelDescriptive + '\'' +
                ", jewelPrice=" + jewelPrice +
                ", jewelPhoto='" + jewelPhoto + '\'' +
                ", jewelStock=" + jewelStock +
                '}';
    }
}
