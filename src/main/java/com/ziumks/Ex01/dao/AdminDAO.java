package com.ziumks.Ex01.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ziumks.Ex01.domain.Admin;

@Mapper
public interface AdminDAO {
	public List<Admin> listAdmin();
	public int insertAdmin(Admin admin);
	public int updateAdmin(Admin admin);
}
