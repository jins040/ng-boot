package kr.re.kitri.ng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by danawacomputer on 2017-07-18.
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
