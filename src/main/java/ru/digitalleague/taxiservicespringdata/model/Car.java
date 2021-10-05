package ru.digitalleague.taxiservicespringdata.model;

import ru.digitalleague.taxiservicespringdata.exception_handling.UnparseableDateException;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "car_seq", sequenceName = "car_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_seq")
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "createdttm")
    private Date createDttm;

    //     Constructors
    public Car() {
    }

    //     Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getCreateDttm() {
        return createDttm;
    }

    public void setCreateDttm(String createDttm) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.createDttm = df.parse(createDttm);
        } catch (ParseException exception) {
            throw new UnparseableDateException(
                    String.format("Incorrect date format %s, expected format yyyy-MM-dd", createDttm));
        }
    }
}