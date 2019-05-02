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
        jdbc.update("INSERT INTO bike (id, brand, type, image, price, name, description, email, phone, date, year, city, state, color, mileage, condition, engine, model) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", bike.id, bike.brand, bike.type, bike.image, bike.price, bike.name, bike.description, bike.email, bike.phone, bike.date, bike.year, bike.city, bike.state, bike.color, bike.mileage, bike.condition, bike.engine, bike.model);
    }
    public List<Bike> findAll() {
        return jdbc.query("SELECT * FROM bike ORDER BY name ASC", this::mapRowToStory);
    }
    public List<Bike> findByBrand(String brand) {
        return jdbc.query("SELECT * FROM bike where brand = ? ORDER BY name ASC", this::mapRowToStory, brand);
    }
    public List<Bike> sortByDate() {
        return jdbc.query("SELECT * FROM bike ORDER BY date DESC LIMIT 4", this::mapRowToStory);
    }
    public List<Bike> findByType(String type) {
        return jdbc.query("SELECT * FROM bike where type = ? ORDER BY name ASC", this::mapRowToStory, type);
    }
    public List<Bike> findByID(UUID id) {
        return jdbc.query("SELECT * FROM bike where id = ? ORDER BY name ASC", this::mapRowToStory, id);
    }
    public List<Bike> findByBrandType(String brand, String type) {
        return jdbc.query("SELECT * FROM bike where brand = ? AND type = ? ORDER BY name ASC", this::mapRowToStory, brand, type);
    }
    public List<Bike> findByBrandPrice(String brand, String price) {
        Integer Price = Integer.parseInt(price);
        return jdbc.query("SELECT * FROM bike where brand = ? AND price <= ? ORDER BY name ASC", this::mapRowToStory, brand, Price);
    }
    public List<Bike> findByPrice(String price) {
        Integer Price = Integer.parseInt(price);
        return jdbc.query("SELECT * FROM bike where price <= ? ORDER BY name ASC", this::mapRowToStory, Price);
    }
    private Bike mapRowToStory(ResultSet rs, int rowNum) throws SQLException {
        return new Bike(UUID.fromString(rs.getString("id")), rs.getString("brand"), rs.getString("type"), rs.getString("image"),
                rs.getInt("price"), rs.getString("name"), rs.getString("description"), rs.getString("email"), rs.getString("phone"), rs.getString("date"), rs.getString("year"), rs.getString("city"), rs.getString("state"), rs.getString("color"), rs.getInt("mileage"), rs.getString("condition"), rs.getString("engine"), rs.getString("model"));
    }
}