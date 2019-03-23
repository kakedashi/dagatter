package jp.co.dagatter.dagatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    /**
     * 初期画面
     *
     * @return
     */
    @RequestMapping()
    public String init() {
        return "home";
    }

}
