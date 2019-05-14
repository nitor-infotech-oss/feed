package com.activity.feed;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.activity.feed.dao.ActivityRepository;
import com.activity.feed.dao.FeedRepository;
import com.activity.feed.dao.UserRepository;
import com.activity.feed.model.Activity;
import com.activity.feed.model.ActivityType;
import com.activity.feed.model.Feed;
import com.activity.feed.model.Follower;
import com.activity.feed.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FeedApiForMessagingFrameworkApplicationTests {

	@Autowired
	private FeedRepository feedRepository;
	
	@Autowired
	private ActivityRepository activityRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void test1User() {
		List<User> users = new ArrayList<>();
		User  user1 = new User("User 1","user1@nitor.com","user1");
		User  user2 = new User("User 2","user2@nitor.com","user2");
		User  user3 = new User("User 3","user3@nitor.com","user3");
		User  user4 = new User("User 4","user4@nitor.com","user4");
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		userRepository.saveAll(users);
	}
	
	@Test
	public void test2Feed() {
		Feed feed = new Feed("Group 1","User 1", new Date(),com.activity.feed.model.FeedType.PROJECT,"User 2", new Date(), "Slug 1" );
		User user1 = userRepository.findByUserName("user1");
		User user2 = userRepository.findByUserName("user2");
		Follower follower1 = new Follower(user1.getId(), user1.getUserName(), true, feed);
		Follower follower2 = new Follower(user2.getId(), user2.getUserName(), true, feed);
		Set<Follower> followers = new HashSet<>();
		followers.add(follower1);
		followers.add(follower2);
		feed.setFollowers(followers);
		feedRepository.saveAndFlush(feed);
		Feed actualFeed = feedRepository.findByName("Group 1");
		actualFeed.getFollowers();
		assertEquals(feed.getName(), actualFeed.getName());
		//assertEquals(2, actualFeed.getFollowers().size());
		
	}
	
	@Test
	public void test3Activity() {
		Activity activity = new Activity();
		activity.setActivityType(ActivityType.TEXT);
		activity.setFeed(feedRepository.findByName("Group 1"));
		activityRepository.save(activity);
	}
	

}
