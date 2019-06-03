package com.activity.feed.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_tenant_relation")
public class UserTenantRelation {

    private Long id;
    private String username;
    private String tenant;

    public UserTenantRelation() {
    }

    public UserTenantRelation(Long id, String username, String tenant) {
        this.id = id;
        this.username = username;
        this.tenant = tenant;
    }

    @Id
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }
}
