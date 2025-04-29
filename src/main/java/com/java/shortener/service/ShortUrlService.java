package com.java.shortener.service;

import com.java.shortener.domain.entities.ShortUrl;
import com.java.shortener.repository.ShortUrlRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShortUrlService {

    private final ShortUrlRepository shortUrlRepository;

    public ShortUrlService(ShortUrlRepository shortUrlRepository) {
        this.shortUrlRepository = shortUrlRepository;
    }

    public List<ShortUrl>findAllShortUrls() {
        return shortUrlRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
    }

    public List<ShortUrl> findAllPublicShortUrls() {
        return shortUrlRepository.findPublicShortUrls();
    }
}
