package com.vti.academy.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vti.academy.web.model.Reviews;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long> {

	List<Reviews> findByType(int type);

}
