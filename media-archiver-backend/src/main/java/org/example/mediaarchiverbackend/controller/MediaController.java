package org.example.mediaarchiverbackend.controller;

import org.example.mediaarchiverbackend.model.Media;
import org.example.mediaarchiverbackend.model.Movie;
import org.example.mediaarchiverbackend.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/media")
public class MediaController {
    @Autowired
    private MediaService mediaService;

    @GetMapping
    public List<Media> getAllMedia() {
        return mediaService.getAllMedia();
    }

    @PostMapping("/movies")
    public Media addMovie(@RequestBody Movie movie) {
        return mediaService.saveMedia(movie);
    }

}
