package br.com.alexandre.blog.rest;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexandre.blog.model.Response;
import br.com.alexandre.blog.service.implementation.PostServiceImpl;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PostController {
	
	private final PostServiceImpl postService;
	
	@GetMapping("/posts")
	public ResponseEntity<Response> createPost() {
		return ResponseEntity.ok(
				Response.builder()
				.timeStamp(LocalDateTime.now())
				.data(Map.of("Posts", postService.listPost(20)))
				.message("Posts retrieved")
				.status(HttpStatus.OK)
				.statusCode(HttpStatus.OK.value())
				.build()
		);
		
	}

}
