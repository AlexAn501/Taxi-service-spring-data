package ru.digitalleague.taxiservicespringdata.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "taxi_drive_info")
public class TaxiDriveInfo {

    @Id
    @Column(name = "driver_id")
    @SequenceGenerator(name = "taxi_driver_seq",sequenceName = "taxi_driver_seq",schema = "taxi_service", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "taxi_driver_seq")
    private long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "level")
    private int level;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "create_dttm")
    private Date createDttm;

    //    Constructors
    public TaxiDriveInfo() {
    }

    public TaxiDriveInfo(String lastName, String firstName, int level, String carModel, Date createDttm) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.level = level;
        this.carModel = carModel;
        this.createDttm = createDttm;
    }

    //     Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Date getCreateDttm() {
        return createDttm;
    }

    public void setCreateDttm(Date createDttm) {
        this.createDttm = createDttm;
    }
}
