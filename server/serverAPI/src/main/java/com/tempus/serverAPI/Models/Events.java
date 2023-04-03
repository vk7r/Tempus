package com.tempus.serverAPI.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    private String name;

    @Column(name = "date")
    private String date;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "g_name")
    @JsonIgnore
    private Groups group;

    //TODO: Lägg till mer fält
}
