package com.example.board.service;

import com.example.board.entity.Board;
import com.example.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;
    //글 작성

    public void write(Board board){


        boardRepository.save(board);
    }

    //글 리스트 처리
    public Page<Board> boardList( Pageable pageable) {

        return boardRepository.findAll(pageable);
    }

    //상세 불러오기
    public Page<Board> boardSearchList(String searchKeyword, Pageable pageable){

        return boardRepository.findByTitleContaining(searchKeyword, pageable);
    }


    public Board boardView(Integer id) {

        return boardRepository.findById(id).get();
    }



    //글 삭제
    public void boardDelete(Integer id) {

        boardRepository.deleteById(id);

    }

}
