package kr.re.kitri.ng.controller;

import kr.re.kitri.ng.model.Hero;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-07-18.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {

    @GetMapping("")
    public String index() {
        return "Hello World..";
    }

    @GetMapping("/heroes")
    public List<Hero> heroes() {
        List list = new ArrayList<>();
        list.add(new Hero(1, "원더우먼"));
        list.add(new Hero(2, "맥가이버"));
        list.add(new Hero(3, "슈퍼맨"));
        list.add(new Hero(4, "스파이더맨"));
        list.add(new Hero(5, "아이언맨"));
        list.add(new Hero(6, "배트맨"));

        return list;
    }

    @GetMapping("/heroes/{id}")
    public Hero getHero(@PathVariable String id) {
        List<Hero> list = this.heroes();
        return list.get(Integer.parseInt(id)-1);
    }
}
