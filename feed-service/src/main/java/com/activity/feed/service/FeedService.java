package com.activity.feed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.activity.feed.model.Feed;
import com.activity.feed.model.dao.FeedRepository;

@Service
public class FeedService {
	
	@Autowired
	private FeedRepository feedRepository;
	
	@Transactional
	public Feed getFeed(Long id) {
		Optional<Feed> optionalFeed = feedRepository.findById(id);
		if(optionalFeed.isPresent()) {
			return optionalFeed.get();
		}
		return null;
	}
	
	public List<Feed> getFeeds(String userId) {
		
		return null;
	}
}
