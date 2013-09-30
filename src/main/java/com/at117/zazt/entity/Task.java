package com.at117.zazt.entity;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

//JPA标识
@Entity
@Table(name = "zazt_task")
public class Task extends IdEntity implements Serializable{
    @Column(name = "TITLE", length = 63,nullable = false)
	private String title;

    @Column(name = "DESCRIPTION", length = 255)
	private String description;

    // JPA 基于USER_ID列的多对一关系定义
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "REF_USER_ID",nullable = false)
	private User user;

	// JSR303 BeanValidator的校验规则
	@NotBlank
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
