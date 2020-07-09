package com.vti.academy.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vti.academy.web.model.Reviews;

@Service
public interface ReviewsService {
	public List<Reviews> getAll();

	List<Reviews> getByType(int type);
}
