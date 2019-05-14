package com.activity.feed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activity.feed.model.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long>{
	
	public Activity findByFeedId(long feed_id);
	
	
}
