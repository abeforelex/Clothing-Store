package com.diasofttesting.ClothingStore.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * @author Alexey Dolzhenko
 * 11/15/2021
 */
// Creating entity named "Comment" by using "@Entity" annotation
// Using "@Data" to reduce the amount of code

@Data
@Entity
@Table(name = "Comment")

public class Comment {

    // Creating primary key, which will be automatically generated
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="Username")
    private String userName;

    @Column(name="Comment")
    @Type(type = "text")
    private String comment;

    @Column(name="Grade")
    private int grade;

}
