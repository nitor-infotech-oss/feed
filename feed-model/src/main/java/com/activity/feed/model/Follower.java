package com.activity.feed.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="follower")
public class Follower {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private Long userId;
	private String userName;
	private String slug;
	private String imageUrl;
	private String thumbnailUrl;
	private boolean isAdmin;
	private boolean isMute;
	private MuteType type;
	private Date muteEndBy;
	
	
	
	public Follower() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Follower(Long userId, String userName, boolean isAdmin, Feed feed) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.isAdmin = isAdmin;
		this.feed = feed;
	}

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="feed_id", nullable=false)
    private Feed feed;

	enum MuteType {
		EIGHT_HOUR, ONE_WEEK, ONE_YEAR;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Feed getFeed() {
		return feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean isMute() {
		return isMute;
	}

	public void setMute(boolean isMute) {
		this.isMute = isMute;
	}

	public MuteType getType() {
		return type;
	}

	public void setType(MuteType type) {
		this.type = type;
	}

	public Date getMuteEndBy() {
		return muteEndBy;
	}

	public void setMuteEndBy(Date muteEndBy) {
		this.muteEndBy = muteEndBy;
	}

	
}
