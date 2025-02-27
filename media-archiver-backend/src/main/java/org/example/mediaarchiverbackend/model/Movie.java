package org.example.mediaarchiverbackend.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("movie")
@Data
public class Movie extends Media {
    private String director;
    private int durationMinutes;
    // No filePath here
}
