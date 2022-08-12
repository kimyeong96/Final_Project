package com.kiri.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiri.dto.Board_FileDTO;

@Repository
public class Board_FileDAO {
	
	@Autowired
	private SqlSession session;
	
	// 파일 db 넣기
	public void uploadFile(Board_FileDTO dto) throws Exception{
		session.insert("fileMapper.insert", dto);
	}
	
	// 파일 삭제
	public void delete(String saveName) throws Exception{
		session.delete("fileMapper.delete", saveName);
	}
}
