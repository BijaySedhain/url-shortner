INSERT INTO users (email, password, name, role)
VALUES ('admin@gmail.com', 'admin', 'Administrator', 'ROLE_ADMIN'),
       ('bijay@gmail.com', 'secret', 'Bijay', 'ROLE_USER');

INSERT INTO short_urls (short_key, original_url, created_by, created_at, expires_at, is_private, click_count)
VALUES
    ('rs1Aed', 'https://docs.oracle.com/en/java/', 1, TIMESTAMP '2024-07-15', NULL, FALSE, 0),
    ('hujfDf', 'https://spring.io/guides/gs/spring-boot/', 1, TIMESTAMP '2024-07-16', NULL, FALSE, 0),
    ('ertcbn', 'https://github.com/spring-projects/spring-initializr', 1, TIMESTAMP '2024-07-17', NULL, FALSE, 0),
    ('edfrtg', 'https://stackoverflow.com/help/how-to-ask', 1, TIMESTAMP '2024-07-18', NULL, TRUE, 0),
    ('vbgtyh', 'https://www.baeldung.com/spring-boot', 1, TIMESTAMP '2024-07-19', NULL, FALSE, 0),
    ('rtyfgb', 'https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#template-layout', 1, TIMESTAMP '2024-07-25', NULL, FALSE, 0),
    ('rtvbop', 'https://platform.openai.com/docs/guides/retrieval', 1, TIMESTAMP '2024-07-26', NULL, FALSE, 0),
    ('2wedfg', 'https://docs.spring.io/spring-ai/reference/', 1, TIMESTAMP '2024-07-27', NULL, TRUE, 0),
    ('6yfrd4', 'https://www.langchain.com/', 1, TIMESTAMP '2024-07-28', NULL, FALSE, 0),
    ('r5t4tt', 'https://www.langchain.com/use-cases/agents', 1, TIMESTAMP '2024-07-29', NULL, FALSE, 0),
    ('ffr4rt', 'https://developers.google.com/machine-learning/guides/text-classification', 1, TIMESTAMP '2024-08-10', NULL, FALSE, 0),
    ('9oui7u', 'https://ollama.com/blog/langchain4j-java', 1, TIMESTAMP '2024-08-11', NULL, FALSE, 0),
    ('cvbg5t', 'https://go.dev/doc/', 1, TIMESTAMP '2024-08-12', NULL, FALSE, 0),
    ('nm6ytf', 'https://www.jooq.org/doc/latest/manual/sql-building/relationships/many-to-many/', 1, TIMESTAMP '2024-08-13', NULL, FALSE, 0),
    ('tt5y6r', 'https://www.jooq.org/doc/latest/manual/sql-building/relationships/one-to-many/', 1, TIMESTAMP '2024-08-14', NULL, FALSE, 0),
    ('fgghty', 'https://www.jooq.org/doc/latest/manual/sql-building/relationships/one-to-one/', 1, TIMESTAMP '2024-08-15', NULL, FALSE, 0),
    ('f45tre', 'https://www.jooq.org/doc/latest/manual/sql-building/dml/', 1, TIMESTAMP '2024-08-16', NULL, FALSE, 0),
    ('54rt54', 'https://www.jooq.org/doc/latest/manual/getting-started/', 1, TIMESTAMP '2024-08-17', NULL, FALSE, 0);
