package oop.md.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarsRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Cars> findAll() {
        return jdbcTemplate.query("SELECT*FROM Cars",
                (response, rowNumber) ->
                        new Cars(response.getDouble("cars_id"),
                                response.getString("numele"),
                                response.getString("producatorul"),
                                response.getInt("pretul")));
    }


    public void save (Cars cars){
        jdbcTemplate.update(
                "INSERT INTO Cars(car_id, numele, producatorul, pretul) VALUES (?,?,?,?)",
                cars.getCar_id(),cars.getNumele(),cars.getProducatorul(),cars.getPretul());
    }

    public void delete(String name){
        jdbcTemplate.update("DELETE FROM Cars WHERE numele=?",name);
    }
}