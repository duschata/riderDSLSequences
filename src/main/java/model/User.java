package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends CoreEntity {


    public User(String userName, String firstName, String lastName) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Column(name = "user_name", nullable = false, unique = true, length = 8)
    private String userName;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

}
