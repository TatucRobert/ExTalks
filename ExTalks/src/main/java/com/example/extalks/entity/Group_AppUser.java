package com.example.extalks.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Group_AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    String appUser_id;

    String group_id;

    String role;
}
