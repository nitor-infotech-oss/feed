package com.activity.feed.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activity.feed.model.UserTenantRelation;

@Repository
public interface UserTenantRelationRepository extends JpaRepository<UserTenantRelation, Long> {

}
