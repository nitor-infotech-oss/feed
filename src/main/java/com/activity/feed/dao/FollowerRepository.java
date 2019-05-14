package com.activity.feed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activity.feed.model.Follower;

@Repository
public interface FollowerRepository extends JpaRepository<Follower, Long>{
	
	Follower findByFeedId(Long feedId);
}
