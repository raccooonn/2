package com.example.board.service;

import com.example.board.entity.Answer;
import com.example.board.entity.Board;
import com.example.board.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public void write(Answer answer){
        answerRepository.save(answer);
    }



}
