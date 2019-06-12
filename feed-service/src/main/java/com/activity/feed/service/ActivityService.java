package com.activity.feed.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activity.feed.model.Activity;
import com.activity.feed.model.dao.ActivityRepository;

@Service
public class ActivityService {
	
	@Autowired
	ActivityRepository activityRepository;
	
	public Set<Activity> getActivities(Long feedId){
		return activityRepository.findAllByFeedId(feedId);
	}
	
	

}
