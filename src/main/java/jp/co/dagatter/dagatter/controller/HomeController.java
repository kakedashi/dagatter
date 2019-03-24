package jp.co.dagatter.dagatter.controller;

import jp.co.dagatter.dagatter.domain.Tweets;
import jp.co.dagatter.dagatter.domain.Users;
import jp.co.dagatter.dagatter.service.TweetsService;
import jp.co.dagatter.dagatter.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private TweetsService tweetsService;
    @Autowired
    private UsersService usersService;

    /**
     * 初期画面
     *
     * @return
     */
    @GetMapping()
    public String init(Model model) {

        // ツイートを取得
        List<Tweets> tweetsDomain = tweetsService.findAll();
        List <jp.co.dagatter.dagatter.model.Tweets>tweets = tweetsService.convertDomainListToModelList(tweetsDomain);
        for(jp.co.dagatter.dagatter.model.Tweets tweet: tweets) {
            tweet.setUser(usersService.convertDomainToModel(usersService.findOne(tweet.getUserId())));
        }
        model.addAttribute("tweets", tweets);
        return "index";
    }

}
