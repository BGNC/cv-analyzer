package com.bgnc.cv_analyzer.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false, name = "create_time")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createTime;

    @Column(name = "update_time")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date updateTime;

    @PrePersist
    protected void onCreate() {
        this.createTime = new Date();
        this.updateTime = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updateTime = new Date();
    }
}
