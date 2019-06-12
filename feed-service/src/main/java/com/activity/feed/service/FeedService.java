package com.activity.feed.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.activity.feed.model.Feed;
import com.activity.feed.model.dao.FeedRepository;
import com.activity.feed.model.dao.FollowerRepository;

@Service
public class FeedService {
	
	@Autowired
	private FeedRepository feedRepository;
	
	private FollowerRepository followerRepository;
	
	@Transactional
	public Feed getFeed(Long id) {
		Optional<Feed> optionalFeed = feedRepository.findById(id);
		if(optionalFeed.isPresent()) {
			return optionalFeed.get();
		}
		return null;
	}
	
	public List<Feed> getFeeds(Long userId) {
		
		Set<Long> feedIds = new HashSet<Long>();
		followerRepository.findByUserId(userId).stream().forEach(follower -> {
			feedIds.add(follower.getId());
		});
		return feedRepository.findAllById(feedIds);
	}
	
}
