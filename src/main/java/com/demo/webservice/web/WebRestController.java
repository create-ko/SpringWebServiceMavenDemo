package com.demo.webservice.web;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.webservice.dto.posts.PostsSaveRequestDto;
import com.demo.webservice.service.posts.PostsService;


/**
 * Restful Controller
 * @author create_ko
 *
 */
@RestController
@AllArgsConstructor
public class WebRestController {

	private PostsService postsService;
	
    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
    
    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}
