package com.kiri.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WishListDAO {

	@Autowired
	private SqlSession session;

	public List<Map<String, Object>> selectWishList(String user_email) throws Exception {
		return session.selectList("myPageMapper.selectWishList", user_email);
	}

	public int wishDelete(int seq_group) throws Exception {
		return session.delete("myPageMapper.wishDelete", seq_group);
	}
}
