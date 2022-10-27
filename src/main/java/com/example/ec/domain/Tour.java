package com.example.ec.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Tour {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    @NonNull
    private String title;

    @Column(length = 2000)
    @NonNull
    private String description;

    @Column(length = 2000)
    @NonNull
    private String blurb;

    @Column
    @NonNull
    private Integer price;

    @Column
    @NonNull
    private String duration;

    @Column(length = 2000)
    @NonNull
    private String bullets;

    @Column
    @NonNull
    String keywords;

    @ManyToOne
    @NonNull
    private TourPackage tourPackage;

    @Column
    @Enumerated
    @NonNull
    private Difficulty difficulty;

    @Column
    @Enumerated
    @NonNull
    private Region region;

}
