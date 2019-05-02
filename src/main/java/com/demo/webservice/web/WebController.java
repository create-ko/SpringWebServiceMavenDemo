package com.demo.webservice.web;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.webservice.service.posts.PostsService;

/**
 * Main Controller 
 * @author create_ko
 */
@Controller
@AllArgsConstructor
public class WebController {
	
	private PostsService postsService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "main";
    }
}