/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

import java.util.Date;

/**
 * This class allow us share the person's atributes
 *
 * @author pablonoguera
 */
public class Person {

    private boolean disability;

    private int height;
    private int weight;

    private Date birthday;

    private String email;
    private String id;
    private String name;
    private String phoneNumber;

    public Person() {
        this.disability = false;
        this.height = 0;
        this.weight = 0;
        this.birthday = null;
        this.email = "No registered";
        this.id = "No registered";
        this.name = "No registered";
        this.phoneNumber = "No registered";
    }

    public Person(boolean disability) {
        this.disability = true;
    }

    
    public Person(boolean disability, int height, int weight, Date birthday,
            String email, String id, String name, String phoneNumber) {
        this.disability = disability;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
        this.email = email;
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the disability
     */
    public boolean isDisability() {
        return disability;
    }

    /**
     * @param disability the disability to set
     */
    public void setDisability(boolean disability) {
        this.disability = disability;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
 
    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" + "disability=" + disability + ", height=" + height + 
                ", weight=" + weight + ", birthday=" + birthday + ", email=" + 
                email + ", id=" + id + ", name=" + name + ", phoneNumber=" + 
                phoneNumber + '}';
        
    }

}
