package com.kiri.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiri.dao.Group_ChatDAO;
import com.kiri.dto.Group_ChatDTO;
import com.kiri.dto.Group_MemberDTO;
import com.kiri.dto.MemberDTO;
import com.kiri.dto.Tbl_GroupDTO;

@Service
public class Group_ChatService {
	
	@Autowired
	private Group_ChatDAO dao;

	public void insert(Group_ChatDTO dto) throws Exception {
		dao.insert(dto);
	}

	public List<Group_ChatDTO> selectChat(int seq_group) throws Exception {
		return dao.selectChat(seq_group);
	}

	public List<Tbl_GroupDTO> selectGroup(int seq_group) throws Exception {
		return dao.selectGroup(seq_group);
	}

	public List<Group_MemberDTO> selectNick(int seq_group) throws Exception {
		return dao.selectNick(seq_group);
	}

	public MemberDTO getProfileImg(String user_nickname) throws Exception {
		return dao.getProfileImg(user_nickname);
	}

}
