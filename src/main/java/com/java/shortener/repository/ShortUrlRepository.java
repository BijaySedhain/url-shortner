package com.java.shortener.repository;

import com.java.shortener.domain.entities.ShortUrl;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {

    /*
        used the @EntityGraph annotation with attributePaths = "createdBy" to
        optimize the query by specifying that the createdBy relationship should be eagerly
        fetched when executing the findPublicShortUrls method. This avoids the N+1 select problem
        by ensuring that the createdBy association is fetched in a single query, rather than lazily
        loading it for each ShortUrl entity.

       Could have used @Query("select su from ShortUrl su left join fetch su.createdBy where su.isPrivate = false order by su.createdAt desc ")
     */

    @Query("select su from ShortUrl su where su.isPrivate = false order by su.createdAt desc ")
    @EntityGraph(attributePaths = "createdBy")
    List<ShortUrl> findPublicShortUrls();
}
