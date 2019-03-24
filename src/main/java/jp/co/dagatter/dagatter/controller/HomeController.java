package jp.co.dagatter.dagatter.controller;

import jp.co.dagatter.dagatter.domain.Tweets;
import jp.co.dagatter.dagatter.service.TweetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private TweetsService tweetsService;

    /**
     * 初期画面
     *
     * @return
     */
    @GetMapping()
    public String init() {

        // ツイートを取得
        List<Tweets> tweets = tweetsService.findAll();

        return "index";
    }

}
