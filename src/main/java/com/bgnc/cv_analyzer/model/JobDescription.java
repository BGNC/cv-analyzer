package com.bgnc.cv_analyzer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "job_description")
public class JobDescription extends BaseEntity {

    @NotNull
    private String title;

    @NotNull
    @Lob
    private String description;
}