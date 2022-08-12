package com.kiri.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiri.dto.SiteDTO;

@Repository
public class SiteDAO {

	@Autowired
	private SqlSession session;

	public List<SiteDTO> selectSiteList(String user_email) throws Exception {
		return session.selectList("myPageMapper.selectSiteList", user_email);
	}

	public void deleteSite(String user_email) throws Exception {
		session.delete("myPageMapper.deleteSite", user_email);
	}

	public void insertSite(Map<String, String> siteMap) throws Exception {
		session.insert("myPageMapper.insertSite", siteMap);
	}
}
