package com.example.ec.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor()
@NoArgsConstructor
@ToString
@Getter
@Setter
public class TourPackage {

    @Id
    String code;

    @Column
    String name;
}
