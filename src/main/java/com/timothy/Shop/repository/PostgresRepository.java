package com.timothy.Shop.repository;


import com.timothy.Shop.model.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@Repository
public class PostgresRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public PostgresRepository(JdbcTemplate jdbctemplate) {
        jdbc = jdbctemplate;
    }

    public void save(Bike bike) {
        bike.id = UUID.randomUUID();

        jdbc.update("INSERT INTO bike (id, brand, type, image, price, name, description, date) VALUES (?,?,?,?,?,?,?,?)", bike.id, bike.brand, bike.type, bike.image, bike.price, bike.name, bike.description, bike.date);
    }

    public List<Bike> findAll() {
        return jdbc.query("SELECT id, brand, type, image, price, name, description, date FROM bike ORDER BY name ASC", this::mapRowToStory);
    }

    private Bike mapRowToStory(ResultSet rs, int rowNum) throws SQLException {
        return new Bike(UUID.fromString(rs.getString("id")), rs.getString("brand"), rs.getString("type"), rs.getString("image"),
                rs.getInt("price"), rs.getString("name"), rs.getString("description"), rs.getString("date"));
    }




}
