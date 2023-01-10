package fr.eni.bo;

import javax.persistence.*;

@Entity
public class JewelSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private JewelType type;

    private int size;

    public JewelSize(int id, JewelType type, int size) {
        this.id = id;
        this.type = type;
        this.size = size;
    }

    public JewelSize(JewelType type, int size) {
        this.type = type;
        this.size = size;
    }

    public JewelSize() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JewelType getType() {
        return type;
    }

    public void setType(JewelType type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "JewelSize{" +
                "id=" + id +
                ", type=" + type +
                ", size=" + size +
                '}';
    }
}
