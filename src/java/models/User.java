package models;


import java.io.Serializable;

/**
 *
 * @author Meron Seyoum
 */
public class User implements Serializable {
    
    private String email;
    private boolean active;
    private String first_Name;
    private String last_Name;
    private String password;
    private int role;

    public User(String email, boolean active, String first_Name, String last_Name, String password, int role) {
        this.email = email;
        this.active = active;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.password = password;
        this.role = role;
    }

    public User(String email, String first_Name, String last_Name, int role) {
        this.email = email;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.role = role;
    }

    public User() {
    } 

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
   
}
