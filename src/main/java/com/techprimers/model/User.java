package com.techprimers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author kansanja on 26/11/21.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    private Integer id;
    private String name;
    private String dept;
    private Integer salary;
    private Date time;

}
