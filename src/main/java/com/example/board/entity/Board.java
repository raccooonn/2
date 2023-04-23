package com.example.board.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Board {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    private String category;

    private String people;

    private String startDate;

    private String endDate;

    @CreatedDate
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "board", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;




}
