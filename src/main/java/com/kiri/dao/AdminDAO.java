package com.kiri.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kiri.dto.AdminMainDTO;
import com.kiri.dto.BlackListDTO;
import com.kiri.dto.Group_CalendarDTO;
import com.kiri.dto.Login_LogDTO;
import com.kiri.dto.MemberDTO;
import com.kiri.dto.ReportDTO;
import com.kiri.dto.Tbl_GroupDTO;
import com.kiri.dto.SiteDTO;

@Repository
public class AdminDAO {
	
	@Autowired
	private SqlSession session;

	public List<MemberDTO> selectAllMember(int start, int end) throws Exception {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", start);
		map.put("end", end);
		return session.selectList("adminMapper.selectAllMember", map);
	}

	public int selectMemCnt() throws Exception {
		return session.selectOne("adminMapper.getPageNavi");
	}

	public List<ReportDTO> selectReport() throws Exception {
		return session.selectList("adminMapper.selectReport");
	}

	public ReportDTO selectReportBySeq(int seq_report) throws Exception {
		return session.selectOne("adminMapper.selectReportBySeq", seq_report);
	}

	public void insertBl(BlackListDTO dto) throws Exception {
		session.insert("adminMapper.insertBl", dto);
	}

	public void deleteReport(int seq_report) throws Exception {
		session.delete("adminMapper.deleteReport", seq_report);
	}

	public void updateBl(String user_email) throws Exception {
		session.update("adminMapper.updateBl", user_email);
	}

	public MemberDTO selectDetailMem(String user_email) throws Exception {
		return session.selectOne("adminMapper.selectDetailMem", user_email);
	}

	public void updateMem(String user_email, String user_blacklist) {
		Map<String, String> map = new HashMap<>();
		map.put("user_email", user_email);
		map.put("user_blacklist", user_blacklist);
		session.update("adminMapper.updateMem", map);
	}

	public List<MemberDTO> searchMember(String searchType, String searchKeyword) throws Exception {
		Map<String, String> map = new HashMap<>();
		map.put("searchType", searchType);
		map.put("searchKeyword", searchKeyword);
		return session.selectList("adminMapper.searchMember", map);
	}

	public HashMap<String, Object> getPageNavi(int curPage) throws Exception {
		int totalCnt = session.selectOne("adminMapper.getPageNavi"); // 전체 게시글의 개수
		int recordCntPerPage = 10; // 한 페이지에 몇개의 데이터(게시글)을 띄워줄지
		int naviCntPerPage = 3; // 네비바에 몇개 단위로 페이징을 구성할지
		int pageTotalCnt = 0; // 총 몇 페이지가 나올지

		if (totalCnt % recordCntPerPage > 0) { // 나머지가 생김
			pageTotalCnt = totalCnt / recordCntPerPage + 1;
		} else {
			pageTotalCnt = totalCnt / recordCntPerPage;
		}

		if (curPage < 1) {// 현재 페이지가 0이거나 혹은 음수일때
			curPage = 1; // 무조건 첫페이지로 맞춰주기
		} else if (curPage > pageTotalCnt) { // 현재 페이지가 총 페이지 수보다 크다면
			curPage = pageTotalCnt; // 무조건 마지막 페이지로 맞춰주기
		}

		int startNavi = ((curPage - 1) / naviCntPerPage) * naviCntPerPage + 1;
		int endNavi = startNavi + naviCntPerPage - 1;

		// 만약에 endNavi가 전체 페이지를 넘어갈 수 없음
		if (pageTotalCnt < endNavi) { // endNavi가 전체 페이지수보다 크다면
			endNavi = pageTotalCnt;
		}

		// <> 모양을 넣어줄지 여부에 대한 검사
		boolean needPrev = true; // startNavi가 1일때 needPrev가 false
		boolean needNext = true; // endNavi가 마지막 페이지(전체 페이지)와 같을때 needNext가 false

		if (startNavi == 1) {
			needPrev = false;
		}
		if (endNavi == pageTotalCnt) {
			needNext = false;
		}

		// map -> key, value
		// 제네릭 <키에 대한 자료형, 값에 대한 자료형>
		HashMap<String, Object> map = new HashMap<>();
		map.put("startNavi", startNavi);
		map.put("endNavi", endNavi);
		map.put("needPrev", needPrev);
		map.put("needNext", needNext);

		return map;
	}

	///////////////////////////////////////////////////////////////////////
	// 형석

	// 모임 검색
	public List<Tbl_GroupDTO> searchGroup(String searchType, String searchKeyword) throws Exception {
		Map<String, String> map = new HashMap<>();
		map.put("searchType", searchType);
		map.put("searchKeyword", searchKeyword);
		return session.selectList("adminMapper.searchGroup", map);
	}

	// 모임 전체 조회
	public List<Tbl_GroupDTO> selectAllGroup(int start, int end) throws Exception {
		Map<String, Integer> map = new HashMap<>();
		map.put("start", start);
		map.put("end", end);
		return session.selectList("adminMapper.selectAllGroup", map);
	}

	// 모임 삭제
	public int deleteGroup(int seq_group) throws Exception {
		return session.delete("adminMapper.deleteGroup", seq_group);
	}

	// 모임 개수 조회
	public int selectGroupCnt() throws Exception {
		return session.selectOne("adminMapper.getPageNaviGroup");
	}

	// 모임 페이지네이션
	public HashMap<String, Object> getPageNaviGroup(int curPage) throws Exception {
		int totalCnt = session.selectOne("adminMapper.getPageNaviGroup"); // 전체 게시글의 개수
		int recordCntPerPage = 7; // 한 페이지에 몇개의 데이터(게시글)을 띄워줄지
		int naviCntPerPage = 3; // 네비바에 몇개 단위로 페이징을 구성할지
		int pageTotalCnt = 0; // 총 몇 페이지가 나올지

		if (totalCnt % recordCntPerPage > 0) { // 나머지가 생김
			pageTotalCnt = totalCnt / recordCntPerPage + 1;
		} else {
			pageTotalCnt = totalCnt / recordCntPerPage;
		}

		if (curPage < 1) {// 현재 페이지가 0이거나 혹은 음수일때
			curPage = 1; // 무조건 첫페이지로 맞춰주기
		} else if (curPage > pageTotalCnt) { // 현재 페이지가 총 페이지 수보다 크다면
			curPage = pageTotalCnt; // 무조건 마지막 페이지로 맞춰주기
		}

		int startNavi = ((curPage - 1) / naviCntPerPage) * naviCntPerPage + 1;
		int endNavi = startNavi + naviCntPerPage - 1;

		// 만약에 endNavi가 전체 페이지를 넘어갈 수 없음
		if (pageTotalCnt < endNavi) { // endNavi가 전체 페이지수보다 크다면
			endNavi = pageTotalCnt;
		}

		// <> 모양을 넣어줄지 여부에 대한 검사
		boolean needPrev = true; // startNavi가 1일때 needPrev가 false
		boolean needNext = true; // endNavi가 마지막 페이지(전체 페이지)와 같을때 needNext가 false

		if (startNavi == 1) {
			needPrev = false;
		}
		if (endNavi == pageTotalCnt) {
			needNext = false;
		}

		// map -> key, value
		// 제네릭 <키에 대한 자료형, 값에 대한 자료형>
		HashMap<String, Object> map = new HashMap<>();
		map.put("startNavi", startNavi);
		map.put("endNavi", endNavi);
		map.put("needPrev", needPrev);
		map.put("needNext", needNext);

		return map;
	}

	// 김영완 07_22
	// 카카오맵
	public List<AdminMainDTO> selectAllGroupLocation() {
		return session.selectList("adminMapper.selectAllGroupLocation");
	}

	// 그룹 수(도넛 그래프)
	public List<AdminMainDTO> cntGroupCalendar() {
		return session.selectList("adminMapper.cntGroupCalendar");
	}

	// 멤버 수
	public int cntMember() {
		return session.selectOne("adminMapper.cntMember");
	}

	// 모임 수
	public int cntGroupCnt() {
		int rs = session.selectOne("adminMapper.cntGroupCnt");
		if (rs < 0)
			return 0;
		else
			return rs;
	}

	// 게시글 수(자유게시판)
	public int cntBoard() {
		int rs = session.selectOne("adminMapper.cntBoard");
		if (rs < 0)
			return 0;
		else
			return rs;
	}

	// 게시글 수(모임게시판)
	public int cntGroupBoard() {
		int rs = session.selectOne("adminMapper.cntGroupBoard");
		if (rs < 0)
			return 0;
		else
			return rs;
	}

	// 일정수
	public int cntGroupCal() {
		int rs = session.selectOne("adminMapper.cntGroupCal");
		if (rs < 0)
			return 0;
		else
			return rs;
	}

	// 선호지역 수
	public List<SiteDTO> cntPreLocation() {
		return session.selectList("adminMapper.cntPreLocation");
	}

	// 로그인 로그 수
	public List<Login_LogDTO> cntLoginLog() {
		return session.selectList("adminMapper.cntLoginLog");
	}
}
