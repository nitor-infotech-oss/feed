package com.activity.feed.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "notification_activity")
public class NotificationActivity {

	@Id
	@GeneratedValue
	private Long id;

	private boolean isSeen = false;
	private Long followerId;
	private Date seenOn;
	private String slug;
	private Long feedId;
	private String userId;
	
	public NotificationActivity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@ManyToOne
    @JoinColumn(name="activity_id", nullable=false)
    private Activity activity;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isSeen() {
		return isSeen;
	}

	public void setSeen(boolean isSeen) {
		this.isSeen = isSeen;
	}

	public Long getFollowerId() {
		return followerId;
	}

	public void setFollowerId(Long followerId) {
		this.followerId = followerId;
	}

	public Date getSeenOn() {
		return seenOn;
	}

	public void setSeenOn(Date seenOn) {
		this.seenOn = seenOn;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Long getFeedId() {
		return feedId;
	}

	public void setFeedId(Long feedId) {
		this.feedId = feedId;
	}
	
	

}
