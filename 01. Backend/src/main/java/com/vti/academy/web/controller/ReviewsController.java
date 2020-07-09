package com.vti.academy.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vti.academy.web.model.Reviews;
import com.vti.academy.web.service.ReviewsService;

@RestController
@RequestMapping("/reviews")
public class ReviewsController {
	private ReviewsService service;

	@GetMapping
	public List<Reviews> getAll() {
		return service.getAll();
	}
}
