package ru.digitalleague.taxiservicespringdata.model;

import javax.persistence.*;

@Entity
@Table(name = "city_queue")
public class CityQueue {

    @Id
    @Column(name = "city_id")
    @SequenceGenerator(name = "city_queue_seq",sequenceName = "city_queue_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "city_queue_seq")
    private long cityId;


    @Column(name = "name")
    private String name;

    @Column(name = "queue")
    private String queue;

//    Constructors
    public CityQueue() {
    }

//    Getters and Setters
    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }
}
