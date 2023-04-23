package com.example.board.controller;


import com.example.board.entity.Answer;
import com.example.board.entity.Board;
import com.example.board.service.AnswerService;
import com.example.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @PostMapping("/answer/writepro")
    public String answerWritePro(Answer answer, Model model) {


        answerService.write(answer);

        model.addAttribute("message", "답글 작성이 완료 되었습니다");
        model.addAttribute("searchUrl","/board/list");

        return "message";

    }

}