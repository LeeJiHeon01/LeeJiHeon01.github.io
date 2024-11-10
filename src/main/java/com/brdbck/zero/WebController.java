package com.brdbck.zero;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/") public String index() { return "index"; }

    @GetMapping("/main") public String main2() { return "main"; }

    @GetMapping("/audioDrama") public String audioDrama() { return "audioDrama"; }

    @GetMapping("/menubar") public String menubar() { return "menubar"; }

    @GetMapping("/story") public String plot() { return "plot"; }

    @GetMapping("/game") public String game() { return "game"; }

}
