package com.bootgo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootgo.system.dao.UserDao;
import com.bootgo.system.domain.UserDO;
import com.bootgo.system.service.UserService;



@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDO get(Long userId){
		return userDao.get(userId);
	}
	
	@Override
	public List<UserDO> list(Map<String, Object> map){
		return userDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return userDao.count(map);
	}
	
	@Override
	public int save(UserDO user){
		return userDao.save(user);
	}
	
	@Override
	public int update(UserDO user){
		return userDao.update(user);
	}
	
	@Override
	public int remove(Long userId){
		return userDao.remove(userId);
	}
	
	@Override
	public int batchRemove(Long[] userIds){
		return userDao.batchRemove(userIds);
	}
	
}
