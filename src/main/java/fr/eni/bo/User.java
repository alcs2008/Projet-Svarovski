package fr.eni.bo;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull(message = "login obligatoire")
    private String login;

    @NotNull(message = "Mot de passe obligatoire")
    private String password;

    private String gender;

    @NotNull(message = "Prénom obligatoire")
    private String firstname;

    @NotNull(message = "Nom obligatoire")
    private String lastname;

    @NotNull(message = "email obligatoire")
    private String email;

    private String phone;
    private String adress;
    private String zipCode;
    private String city;

    @NotNull(message = "Vous devez être admin pour effectuer cette action")
    private boolean is_admin;

    @OneToMany
    @NotEmpty(message="Panier vide")
    private List<Cart> cartList;


// Constructeurs
    public User() {
    }

    public void user(String login, String password, String gender, String firstname,
                     String lastname, String email, String phone, String adress,
                     String zipCode, String city, boolean is_admin, List<Cart> cartList) {
        this.login = login;
        this.password = password;
        this.gender = gender;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.zipCode = zipCode;
        this.city = city;
        this.is_admin = is_admin;
        this.cartList = cartList;
    }

    public void user(int id, String login, String password, String gender,
                     String firstname, String lastname, String email, String phone,
                     String adress, String zipCode, String city, boolean is_admin, List<Cart> cartList) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.gender = gender;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.adress = adress;
        this.zipCode = zipCode;
        this.city = city;
        this.is_admin = is_admin;
        this.cartList = cartList;
    }


// Getters Setters
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    public boolean isIs_admin() {
        return is_admin;
    }
    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }
    public List<Cart> cartList() { return cartList; }
    public void setCartList(List<Cart> cartList) {
        if (cartList == null)
            this.cartList = new ArrayList<>();
        else
            this.cartList = cartList;
    }


// Méthode ToString

        @Override
        public String toString () {
            return "user{" +
                    "id=" + id +
                    ", login='" + login + '\'' +
                    ", password='" + password + '\'' +
                    ", gender='" + gender + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", adress='" + adress + '\'' +
                    ", zipCode='" + zipCode + '\'' +
                    ", city='" + city + '\'' +
                    ", is_admin=" + is_admin +
                    ", cartList=" + cartList +
                    '}';
        }


    }