package com.activity.feed.model.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activity.feed.model.Follower;

@Repository
public interface FollowerRepository extends JpaRepository<Follower, Long>{
	
	Follower findByFeedId(Long feedId);
	
	Set<Follower> findByUserId(Long userId);
	
	
}
