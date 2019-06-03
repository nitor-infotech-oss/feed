package com.activity.feed.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "feed")
public class Feed {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String createdBy;
	private Date createdDate;
	@Enumerated(EnumType.STRING)
	private FeedType type;
	private String updatedBy;
	private Date updateDate;
	private String slug;
	private Integer unseenMsgCount;
	private byte[] feedImage;
	private byte[] feedPhotoForIOS;

	@OneToMany(mappedBy = "feed", cascade = CascadeType.ALL)
	private Set<Follower> followers;

	@OneToMany(mappedBy = "feed")
	private Set<Activity> activities;

	public Feed() {
		super();
	}

	public Feed(String name, String createdBy, Date createdDate, FeedType type, String updatedBy, Date updateDate,
			String slug) {
		super();
		this.name = name;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.type = type;
		this.updatedBy = updatedBy;
		this.updateDate = updateDate;
		this.slug = slug;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public FeedType getType() {
		return type;
	}

	public void setType(FeedType type) {
		this.type = type;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Integer getUnseenMsgCount() {
		return unseenMsgCount;
	}

	public void setUnseenMsgCount(Integer unseenMsgCount) {
		this.unseenMsgCount = unseenMsgCount;
	}

	public byte[] getFeedImage() {
		return feedImage;
	}

	public void setFeedImage(byte[] feedImage) {
		this.feedImage = feedImage;
	}

	public byte[] getFeedPhotoForIOS() {
		return feedPhotoForIOS;
	}

	public void setFeedPhotoForIOS(byte[] feedPhotoForIOS) {
		this.feedPhotoForIOS = feedPhotoForIOS;
	}

	public Set<Follower> getFollowers() {
		return followers;
	}

	public void setFollowers(Set<Follower> followers) {
		this.followers = followers;
	}

	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

}
