package com.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pojo.Manager;

@Repository
public interface ManagerMapper {
		List<Manager> QueryUserByName(String username);
}
