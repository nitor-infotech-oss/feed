package com.activity.feed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activity.feed.model.Feed;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Long>{
	Feed findByName(String name);
	
	 
}
