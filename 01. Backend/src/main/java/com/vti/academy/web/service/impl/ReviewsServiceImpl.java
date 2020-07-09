package com.vti.academy.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vti.academy.web.model.Reviews;
import com.vti.academy.web.repository.ReviewsRepository;
import com.vti.academy.web.service.ReviewsService;


public class ReviewsServiceImpl implements ReviewsService {

	@Autowired
	private ReviewsRepository repository;

	@Override
	public List<Reviews> getAll() {
		return repository.findAll();
	}

	@Override
	public List<Reviews> getByType(int type) {
		return repository.findByType(type);

	}

}
