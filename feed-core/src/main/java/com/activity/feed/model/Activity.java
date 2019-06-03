package com.activity.feed.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "activity")
public class Activity {

	@Id
	@GeneratedValue
	private Long id;

	private String followerId;
	private String followerName;
	
	@ManyToOne
    @JoinColumn(name="feed_id", nullable=false)
    private Feed feed;
	
	@OneToMany(mappedBy = "activity")
	private Set<NotificationActivity> notificationActivities;

	@Enumerated(EnumType.STRING)
	private ActivityType activityType;
	private Verb verb;
	private String slug;
	private String objectName;
	private Double score;
	private String foreignId;
	private Date published;
	private String userId;
	private String longitude;
	private String latitude;
	private String mediaUrl;
	private String mediaThumbnailUrl;
	private String mediaDestinationPath;
	
	

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFollowerId() {
		return followerId;
	}

	public void setFollowerId(String followerId) {
		this.followerId = followerId;
	}

	public String getFollowerName() {
		return followerName;
	}

	public void setFollowerName(String followerName) {
		this.followerName = followerName;
	}

	public ActivityType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}

	public Verb getVerb() {
		return verb;
	}

	public void setVerb(Verb verb) {
		this.verb = verb;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getForeignId() {
		return foreignId;
	}

	public void setForeignId(String foreignId) {
		this.foreignId = foreignId;
	}

	public Date getPublished() {
		return published;
	}

	public void setPublished(Date published) {
		this.published = published;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getMediaUrl() {
		return mediaUrl;
	}

	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	public String getMediaThumbnailUrl() {
		return mediaThumbnailUrl;
	}

	public void setMediaThumbnailUrl(String mediaThumbnailUrl) {
		this.mediaThumbnailUrl = mediaThumbnailUrl;
	}

	public String getMediaDestinationPath() {
		return mediaDestinationPath;
	}

	public void setMediaDestinationPath(String mediaDestinationPath) {
		this.mediaDestinationPath = mediaDestinationPath;
	}

	public Feed getFeed() {
		return feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	public Set<NotificationActivity> getNotificationActivities() {
		return notificationActivities;
	}

	public void setNotificationActivities(Set<NotificationActivity> notificationActivities) {
		this.notificationActivities = notificationActivities;
	}
	
	

}
