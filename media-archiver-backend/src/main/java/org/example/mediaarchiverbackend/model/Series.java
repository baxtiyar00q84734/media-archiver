package org.example.mediaarchiverbackend.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("series")
@Data
public class Series extends Media {
    private int totalSeasons;
    private int episodesPerSeason;
}