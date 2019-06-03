package com.activity.feed.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activity.feed.model.NotificationActivity;

@Repository
public interface NotificationActivityRepository extends  JpaRepository<NotificationActivity, Long>{
	
	List<NotificationActivity> findByFeedIdAndActivityId(Long feedId, Long activityId);
}
