package com.timothy.Shop.repository;

import com.timothy.Shop.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@Repository
public class ReviewRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public ReviewRepository(JdbcTemplate jdbctemplate) {
        jdbc = jdbctemplate;
    }

    public void save(Review review) {
        review.id = UUID.randomUUID();

        jdbc.update("INSERT INTO review (id, name, date, rating, review) VALUES (?,?,?,?,?)", review.id, review.name, review.date, review.rating, review.review);
    }

    public List<Review> findAll() {
        return jdbc.query("SELECT id, name, date, rating, review FROM review ORDER BY name ASC", this::mapRowToStory);
    }

    private Review mapRowToStory(ResultSet rs, int rowNum) throws SQLException {
        return new Review(UUID.fromString(rs.getString("id")), rs.getString("name"), rs.getString("date"), rs.getFloat("rating"), rs.getString("review"));
    }

}
