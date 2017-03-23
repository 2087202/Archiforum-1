package ArchiForum.Controller;

import ArchiForum.Domain.Board;
import ArchiForum.Repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by tocch on 7-3-2017.
 */
@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private final BoardRepository boardRepository;

    public BoardController(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }

    @GetMapping
    public ModelAndView view(){
        Iterable<Board> boards = this.boardRepository.findAll();
        return new ModelAndView("boards/view","boards",boards);
    }
}
