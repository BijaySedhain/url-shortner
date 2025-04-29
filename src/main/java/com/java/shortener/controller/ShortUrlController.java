package com.java.shortener.controller;

import com.java.shortener.domain.entities.ShortUrl;
import com.java.shortener.repository.ShortUrlRepository;
import com.java.shortener.service.ShortUrlService;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShortUrlController {

    private final ShortUrlRepository shortUrlRepository;
    private final ShortUrlService shortUrlService;

    public ShortUrlController(ShortUrlRepository shortUrlRepository, ShortUrlService shortUrlService) {
        this.shortUrlRepository = shortUrlRepository;
        this.shortUrlService = shortUrlService;
    }

    @GetMapping("/")
    ResponseEntity<List<ShortUrl>> getAllUrls() {
        List<ShortUrl> shortUrls = shortUrlService.findAllShortUrls();
        return ResponseEntity.ok(shortUrls);
    }

    @GetMapping("/public")
    ResponseEntity<List<ShortUrl>> getPrivateUrls() {
        List<ShortUrl> shortUrls = shortUrlService.findAllPublicShortUrls();
        return ResponseEntity.ok(shortUrls);
    }
}
