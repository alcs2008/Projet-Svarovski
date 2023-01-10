package fr.eni.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class JewelType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull(message = "Le nom est obligatoire")
	private String name;
	
	private int size;
	
	public JewelType(int id, String name, int size) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
	}

	public JewelType(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}

	public JewelType() {
		super();
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JewelType [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
