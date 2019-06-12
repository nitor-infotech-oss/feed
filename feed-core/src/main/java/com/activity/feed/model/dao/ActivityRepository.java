package com.activity.feed.model.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activity.feed.model.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long>{
	
	public Set<Activity> findAllByFeedId(Long feedId);
	
	
}
