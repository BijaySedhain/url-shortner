package com.java.shortener.controller;

import com.java.shortener.domain.entities.ShortUrl;
import com.java.shortener.repository.ShortUrlRepository;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShortUrlController {

    private final ShortUrlRepository shortUrlRepository;

    public ShortUrlController(ShortUrlRepository shortUrlRepository) {
        this.shortUrlRepository = shortUrlRepository;
    }

    @GetMapping("/")
    ResponseEntity<List<ShortUrl>> getAllUrls() {
        List<ShortUrl> shortUrls = shortUrlRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
        return ResponseEntity.ok(shortUrls);
    }
}
