package org.example.mediaarchiverbackend.repository;

import org.example.mediaarchiverbackend.model.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<Media, Long> {
}
