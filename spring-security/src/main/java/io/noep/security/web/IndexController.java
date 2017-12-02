package io.noep.security.web;

import io.noep.security.web.model.LoginForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Taehoon Yoo
 * User  : taehoon
 * Date  : 2017. 12. 2.
 * Time  : 오후 1:05
 * Page  : http:noep.github.io
 * Email : noep@naver.com
 * Desc  :
 */

@Controller
@RequestMapping("/")
public class IndexController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping(path = {"/", "/index"})
    public String index(Model model, @RequestParam(required = false, defaultValue = "") String name) {

        return "index";
    }

    @PostMapping(path = "/login")
    public String login(@Validated @ModelAttribute LoginForm loginForm, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            log.error("has errors {}", bindingResult.getAllErrors());
        }

        return "loginSuccess";
    }
}
