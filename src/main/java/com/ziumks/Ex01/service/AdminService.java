package com.ziumks.Ex01.service;

import org.springframework.stereotype.Service;

import com.ziumks.Ex01.domain.Admin;
import com.ziumks.Ex01.mapper.AdminMapper;

@Service
public class AdminService {
	AdminMapper adminMapper;
	
	public int adminInsertService(Admin admin) throws Exception{
		return adminMapper.insertAdmin(admin);
	}
}
