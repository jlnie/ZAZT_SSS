package com.at117.zazt.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.at117.zazt.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
