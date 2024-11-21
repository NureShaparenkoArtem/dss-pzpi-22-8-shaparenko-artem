package com.example.SRBDlab3.worker;

import jakarta.persistence.*;

@Entity
@Table(name = "workers")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer worker_id;
    private String name;
    private String address;
    private Long dept_id;
    private String information;

    public Worker() {
    }

    public Worker(Integer worker_id,
                  String name,
                  String address,
                  Long dept_id,
                  String information) {
        this.worker_id = worker_id;
        this.name = name;
        this.address = address;
        this.dept_id = dept_id;
        this.information = information;
    }

    public Worker(String name,
                  String address,
                  Long dept_id,
                  String information) {
        this.name = name;
        this.address = address;
        this.dept_id = dept_id;
        this.information = information;
    }

    public Integer getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(Integer worker_id) {
        this.worker_id = worker_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getDept_id() {
        return dept_id;
    }

    public void setDept_id(Long dept_id) {
        this.dept_id = dept_id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "worker_id=" + worker_id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dept_id=" + dept_id +
                ", information='" + information + '\'' +
                '}';
    }
}
