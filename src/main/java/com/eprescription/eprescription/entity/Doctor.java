package com.eprescription.eprescription.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table (name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @NotEmpty (message = "Email may not be empty")
    @Size (min=7,max = 50)
    @Column (name = "email")
    private String email;

    @NotEmpty (message = "Password may not be empty")
    @Size (min=8,max = 20)
    @Column (name = "password")
    private String password;

    @NotEmpty (message = "Phone number may not be empty")
    @Size (min=10,max = 10)
    @Column (name = "phone")
    private String phone;


    public Doctor() {
    }

    public Doctor(Long id, String email, String password, String phone) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Doctor{");
        sb.append("id=").append(id);
        sb.append(", email='").append(email).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", phone=").append(phone);
        sb.append('}');
        return sb.toString();
    }
}
