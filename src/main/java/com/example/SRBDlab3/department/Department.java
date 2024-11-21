package com.example.SRBDlab3.department;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dept_id;
    private String name;
    private String info;

    public Department() {
    }


    public Department(Integer dept_id,
                      String name,
                      String info) {
        this.dept_id = dept_id;
        this.name = name;
        this.info = info;
    }

    public Department(String name,
                      String info) {
        this.name = name;
        this.info = info;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_id=" + dept_id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
