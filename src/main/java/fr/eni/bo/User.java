package fr.eni.bo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "Le mot de passe est obligatoire")
    private String password;

    @Transient
    private String retypedPassword;

    private String gender;

   // @NotNull(message = "Le prénom est obligatoire")
    private String firstName;

   // @NotNull(message = "Le nom est obligatoire")
    private String lastName;

   // @NotNull(message = "L'email est obligatoire")
    //@Email
    private String email;

    private String phone;
    private String address;
    private String zipCode;
    private String city;

   // @NotNull(message = "Vous devez être admin pour effectuer cette action")
    private boolean isAdmin;

    @OneToMany
    private List<Cart> cartList;


    // Constructeurs
    public User() {
    }

    public User(String password, String gender, String firstName,
                String lastName, String email, String phone, String address,
                String zipCode, String city, boolean isAdmin, List<Cart> cartList) {
        this.password = password;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.isAdmin = isAdmin;
        this.cartList = cartList;
    }

    public User(int id, String password, String gender,
                String firstName, String lastName, String email, String phone,
                String address, String zipCode, String city, boolean isAdmin, List<Cart> cartList) {
        this.id = id;
        this.password = password;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.isAdmin = isAdmin;
        this.cartList = cartList;
    }


    // Getters Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRetypedPassword() {
        return retypedPassword;
    }

    public void setRetypedPassword(String retypedPassword) {
        this.retypedPassword = retypedPassword;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean is_admin) {
        this.isAdmin = is_admin;
    }

    public List<Cart> cartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        if (cartList == null)
            this.cartList = new ArrayList<>();
        else
            this.cartList = cartList;
    }

// Méthode ToString

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", adress='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", is_admin=" + isAdmin +
                ", cartList=" + cartList +
                '}';
    }

}
