package com.tempus.serverAPI.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Cascade;

import java.util.Date;

//
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "e_id")
    private long id;

    @Column(name = "event_name")
    @NotNull
    private String name;

    @Column(name = "date")
    private Date date;

    @Column(name = "start")
    private String start_time;

    @Column(name = "end")
    private String end_time;

    @Column (name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "g_id")
    private Groups group;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "u_id")
    @JsonIgnore
    private Users user;





    //TODO: Lägg till mer fält
}
