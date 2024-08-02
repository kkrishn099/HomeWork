CREATE TABLE FUN_BOOK (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    post_date TIMESTAMP,
    post_category VARCHAR(255),
    author VARCHAR(255),
    content TEXT,
    view_count BIGINT
);