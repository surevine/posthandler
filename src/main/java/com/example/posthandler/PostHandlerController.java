package com.example.posthandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PostHandlerController {

	private static final Logger LOG = LoggerFactory.getLogger(PostHandlerController.class);

	@PostMapping
	public void post(RequestEntity<byte[]> request) {
		LOG.info("I got a request, with a body of size=[{}]", request.getBody().length);
	}
}
