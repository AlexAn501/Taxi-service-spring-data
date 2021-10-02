package ru.digitalleague.taxiservicespringdata.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "car_seq",sequenceName = "car_seq",schema = "taxi_service", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "car_seq")
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "createdttm")
    private Date createDttm;

//     Constructors
    public Car() {
    }

    public Car( String model, Date createDttm) {
        this.model = model;
        this.createDttm = createDttm;
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

    public void setCreateDttm(Date createDttm) {
        this.createDttm = createDttm;
    }
}
