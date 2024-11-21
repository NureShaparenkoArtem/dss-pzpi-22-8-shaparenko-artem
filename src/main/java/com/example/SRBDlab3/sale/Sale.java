package com.example.SRBDlab3.sale;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sale_id;
    private Long check_no;
    private Long good_id;
    private Date date_sale;
    private Long quantity;

    public Sale() {
    }

    public Sale(Integer sale_id,
                Long check_no,
                Long good_id,
                Date date_sale,
                Long quantity) {
        this.sale_id = sale_id;
        this.check_no = check_no;
        this.good_id = good_id;
        this.date_sale = date_sale;
        this.quantity = quantity;
    }

    public Sale(Long check_no,
                Long good_id,
                Date date_sale,
                Long quantity) {
        this.check_no = check_no;
        this.good_id = good_id;
        this.date_sale = date_sale;
        this.quantity = quantity;
    }

    public Integer getSale_id() {
        return sale_id;
    }

    public void setSale_id(Integer sale_id) {
        this.sale_id = sale_id;
    }

    public Long getCheck_no() {
        return check_no;
    }

    public void setCheck_no(Long check_no) {
        this.check_no = check_no;
    }

    public Long getGood_id() {
        return good_id;
    }

    public void setGood_id(Long good_id) {
        this.good_id = good_id;
    }

    public Date getDate_sale() {
        return date_sale;
    }

    public void setDate_sale(Date date_sale) {
        this.date_sale = date_sale;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "sale_id=" + sale_id +
                ", check_no=" + check_no +
                ", good_id=" + good_id +
                ", date_sale=" + date_sale +
                ", quantity=" + quantity +
                '}';
    }
}
