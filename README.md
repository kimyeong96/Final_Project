# 파이널 프로젝트
![로고](./screenshoots/logo.png)

## 📖 프로젝트 개요
- 커뮤니티 기능이 존재하는 취미 활동 및 모임 사이트

---------------------------------------
## 💡 프로젝트 주제 선정 이유
- 모임의 목적이지만, 대다수의 사이트들은 게시글을 등록 할 때, 혹은 모임에 가입할 때 결제를 요구하는 곳이 많았다.
- 타사이트 보다 접근성이 쉬운 페이지를 만들고자 하였다.

위의 내용들을 반영한 사이트인 "끼리끼리" 프로젝트를 기획

---------------------------------------
## 📆 구현 기간

- 프로젝트 기획 기간 : 22.06.28 ~ 22.07.10
- 프로젝트 구현 기간 : 22.07.11 ~ 22.08.05
---------------------------------------
## 🔨 개발 환경 및 사용 도구
|구분|항목|
|:---:|:---:|
|OS|Window10|
|IDE|Eclipse, VS Code, SQL Developer|
|Server / DBMS|Apache Tomcat 8.5 / Oracle 11g XE|
|Framework / Platform|Spring|
|Pattern|MVC MODEL2 Pattern|
|Development Languages|Java, HTML, CSS , Javascript, Jquery, Ajax, MyBatis|
|Front|FullCalendar v5.11.2, Chart JS v3.9.1, Sweetalert v11.4.26,  Summernote v0.8.18, Slick Slider|
|Backend|ojdbc8, cos.jar, gson2.8.9, dbcp2, WebSocket|
|Open API|Kakao Login, Kakao Map, Naver Login|

---------------------------------------



## 🔎 핵심 구현 기술

1️⃣ 사용자 페이지


|구분|내용|
|---|---|
|메인|현재 진행 중인 모임 노출, 회원가입 유도, 게시판 베스트 글 노출|
|모임 목록|카테고리 및 지역으로 선정해서 모임 목록 보기|
|로그인|로그인(카카오 로그인 API, 네이버 로그인 API), 회원 가입, 로그아웃|
|마이페이지|개인 정보 수정, 쪽지 및 작성 글 확인|
|게시판|게시글 수정 및 삭제, 게시글 댓글 등록 및 수정, 공지사항 확인|
|모임|모임 생성, 모임 수정, 모임 관리, 모임 게시판, 모임 일정, 모임 채팅|



2️⃣ 관리자 페이지

|구분|내용|
|---|---|
|메인|그래프를 통해 당일 로그인 수, 모임 일정 및 회원수(ChartJS) 조회|
|회원 관리|회원 조회 및 회원 정보 수정|
|게시판 관리|게시판 조회 및 삭제, 공지사항 등록|
|모임 관리|모임 조회 및 모임 삭제|

---------------------------------------


## 😙 나의 역할 및 담당 기능

#### 직책 : 팀원

#### 담당 기능 : 모임 생성 및 수정, 모임 상세페이지, 모임 일정, 모임 목록 보여주기(카테고리, 지역), 모임 쪽지, 관리자 메인


> code
* jsp
  * [모임 생성](https://github.com/kimyeong96/Final_Project/blob/main/src/main/webapp/WEB-INF/views/group/createGroup.jsp)
  * [모임 수정](https://github.com/kimyeong96/Final_project/blob/main/src/main/webapp/WEB-INF/views/group/modifyGroup.jsp)
  * [모임 상세](https://github.com/kimyeong96/Final_project/blob/main/src/main/webapp/WEB-INF/views/group/groupDetail.jsp)
  * [모임 일정](https://github.com/kimyeong96/Final_project/blob/main/src/main/webapp/WEB-INF/views/group/groupCalendar.jsp)
  * [모임 전체 목록](https://github.com/kimyeong96/Final_project/blob/main/src/main/webapp/WEB-INF/views/user/viewAllGroupList.jsp)
  * [모임 카테고리별 목록](https://github.com/kimyeong96/Final_project/blob/main/src/main/webapp/WEB-INF/views/user/categorySelected.jsp)
  * [모임 지역별 목록](https://github.com/kimyeong96/Final_project/blob/main/src/main/webapp/WEB-INF/views/user/siteSelected.jsp)
  * [관리자 메인](https://github.com/kimyeong96/Final_project/blob/main/src/main/webapp/WEB-INF/views/admin/adminMain.jsp)

* Controller
  * [모임 관련](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/controller/GroupController.java)
  * [모임 일정](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/controller/GroupCalendar.java)
  * [모임 목록](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/controller/UserController.java)
  * [관리자](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/controller/AdminController.java)

* Service
  * [모임 관련](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/service/Tbl_GroupService.java)
  * [모임 일정](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/service/GroupCalendarService.java)
  * [쪽지](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/service/MessageService.java)
  * [모임 목록](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/service/UserService.java)
  * [관리자](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/service/AdminService.java)

* DAO
  * [모임 관련](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/dao/Tbl_GroupDAO.java)
  * [모임 일정](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/dao/UserDAO.java)
  * [쪽지](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/dao/MessageDAO.java)
  * [모임 목록](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/dao/UserDAO.java)
  * [관리자](https://github.com/kimyeong96/Final_project/blob/main/src/main/java/com/kiri/dao/AdminDAO.java)

* Mapper
  * [모임 관련](https://github.com/kimyeong96/Final_project/blob/main/src/main/resources/mappers/group-mapper.xml)
  * [모임 일정](https://github.com/kimyeong96/Final_project/blob/main/src/main/resources/mappers/group-calendar-mapper.xml)
  * [쪽지](https://github.com/kimyeong96/Final_project/blob/main/src/main/resources/mappers/message-mapper.xml)
  * [모임 목록](https://github.com/kimyeong96/Final_project/blob/main/src/main/resources/mappers/user-mapper.xml)
  * [관리자](https://github.com/kimyeong96/Final_project/blob/main/src/main/resources/mappers/admin-mapper.xml)
---------------------------------------


## 📸 완성 화면 및 기능 보기
![메인](./screenshoots/메인.png)
![마이페이지](./screenshoots/마이페이지.png)
![모임상세](./screenshoots/모임상세.png)
![모임관리](./screenshoots/모임관리.png)
![모임생성](./screenshoots/모임생성.png)
![모임카테고리](./screenshoots/모임카테고리.png)
![자유게시판](./screenshoots/자유게시판.png)



## 😥 아쉬운 점
- DB 설계를 충분히 했음에도 불구하고, 수정이 불가피했다. 필요없는 컬럼의 삭제와 필요한 컬럼과 테이블의 생성이 반복되었다. 하지만 세미 프로젝트 보다 DB의 수정 빈도가 훨씬 줄어들어 프로젝트를 수행하는데 있어서, 큰 어려움을 겪지 않았다.
- 파이널 프로젝트이였지만, 기능이 생각보다 많지 않았다.

---------------------------------------

## 😃 만족한 점
- 세미 프로젝트 때 잘 사용하지 못했던 Git을 이번 프로젝트에서는 지속적으로 사용하여 팀원들과 공유하며, 소통했다.
- 다양한 라이브러리를 써봤고 라이브러리들의 사용법을 이해하는 능력을 키웠다.
- 다른 사람의 코드를 읽는 능력이 좋아졌다.
---------------------------------------

## 📑 기타 문서
* [전체 PPT](https://github.com/kimyeong96/Final_project/blob/main/ppt/%EC%A0%84%EC%B2%B4%20ppt.pptx)
* [기능화면 PPT](https://github.com/kimyeong96/Final_Project/blob/main/ppt/%EA%B8%B0%EB%8A%A5%ED%99%94%EB%A9%B4.pptx)
* [DB](https://github.com/kimyeong96/Final_project/blob/main/screenshoots/DB.png)


