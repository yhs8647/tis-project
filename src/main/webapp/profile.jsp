<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--jsp파일 내용 그대로 html로 옴긴 파일입니다.-->
<html>
<head>
	<link rel="stylesheet" href="resources/css/style.css?after"> 
<style>
	h2{
    color:#fff;
    transform:translate(-40%,-30%);

    font-size:40px
}


h1{
    text-align:center;
}

.profileupdate{
    margin:0 auto;
    width:1000px;
}

.back{
    margin:0 auto;
    margin-top: 20px;
    background-color:#141517;
    width: 1200px;
    border-radius: 10%;
    margin-bottom: 50px;

}

.profileupdate{
    margin:0 auto;
    padding:50px 50px 0px 50px;
    
}

.updateinput, .updatedate{
    width:450px;
    height:60px;
    margin-bottom: 70px;
    font-size:35px;
    color:#808080;
    border-radius: 10px;
    padding-left: 20px;
}

.updatetr{
    text-align:center;
 

}

input[type='radio'],input[type='radio']:checked{
    appearance:none;
    vertical-align: -12px;
    padding:0;

}

.checkboxtd{
    text-align: left;
    padding:0 0 0 100px;
    font-size:25px;
    color:#fff;
    vertical-align: 30px;
    margin-bottom: 50px;

}


input[type='checkbox'],input[type='checkbox']:checked{
    padding:0;

}




input[type='checkbox']{
    width:30px;
    height:30px;
}

input[type='radio']{
    border:none;
    width:50px;
    height:50px;
    background-color:#fff;
    border-radius:100%;
    margin:0;
}



input[type='radio']:checked{
    
    transition:all .3s;
    background-color:#7c7c7c7a;
}

.radiotext{
    font-size:40px;
    text-align:center;


}

.gendertd{
    display:inline-block;
    padding:0px 0 0 0;
    font-size:35px;
    color:#fff
}

p{
    padding:50px;
}

.submitbt{
    margin:0 auto;
    width:300px;
    height:100px;
    text-align:center;
    margin-bottom: 300px;
}

input[type="submit"]{
    width:150px;
    height:70px;
    border:none;
    border-radius: 10px;
    background-color: #7c7c7c7a;
    font-size: 30px;
    color:#fff;
   
}

input[type="submit"]:checked{
    background-color: #fff;
   
}

	
</style> 
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id = "root">
		<div class="content">
			<header>
				<nav class="leftmenu">
					<a class="logolink" href="#">
						<img src="resources/img/logo.png" class="logoimg" >	
					</a>
				<section class="leftsction">
					<ul class="leftmenubuttonul">
						<li class="leftmenubuttonli">
							<a href="home.html">영상 보기</a>
						</li>
						<li class="leftmenubuttonli">
							<a href="search.html">검색</a>
						</li>
						<li class="leftmenubuttonli">
							<a href="BoardList.html">평점 게시판</a>
						</li>	
						<li class="leftmenubuttonli">
							<a href="mymovie.do">마이페이지</a>
                                <li class="mypagesub">
                                    <a href="profile.do" class="profilea"> 개인정보수정</a>
                                </li>
						</li>
						<li class="leftmenubuttonli">
							<a href="manager.html">관리자페이지</a>
						</li>					
					</ul>
	
				</section>
				</nav>
			</header>
			<main class="maincontent">
					<div class="update">
						<h1>개인정보수정</h1>
							<form action="profileupdate.do" id="profileupdate" method="post">
						
							<div class="back">
							<table class="profileupdate">
								<tr class="updatetr">
									<td>
										<h2>아이디</h2>
									</td>
									<td>
										<input type="text" name="userid" class="updateinput" value="${vo.userid }">
									</td>
								</tr>
								<tr class="updatetr">
									<td>
										<h2>비밀번호</h2>
									</td>
									<td>
										<input type="password" name="password" class="updateinput">
									</td>
								</tr>
								<tr class="updatetr">
									<td>
										<h2>닉네임</h2>
									</td>
									<td>
										<input type="text" name="nickname" class="updateinput" value="${vo.nickname }" >
									</td>
								</tr>
								<tr class="updatetr">
									<td>
										<h2>성 별</h2>
									</td>
									<td class="gendertd">
											<input type="radio" name="gender" value="0" class="updategender"> 남 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<input type="radio" name="gender" value="1" class="updategender"> 여
									</td>
								</tr>
								<tr class="updatetr">
									<td>
										<h2>생년월일</h2>
									</td>
									<td>
										<input type="date" name="a" value="${vo.birthday }" min = "1900-01-01" class="updatedate">
									</td>
								</tr>
								<tr class="updatetr">
									<td>
										<h2>이메일</h2>
									</td>
									<td>
										<input type="text" name="email" class="updateinput" value="${vo.email }">
									</td>
								</tr>
								<tr class="updatetr">
									<td>
										<h2>선호 장르</h2>
									</td>
									<td class="checkboxtd">
										<label><input type="checkbox">장르1</label>&nbsp;&nbsp;&nbsp;&nbsp; <label><input type="checkbox">장르2</label>&nbsp;&nbsp;&nbsp;&nbsp; <label><input type="checkbox">장르3</label><br><br>
										<label><input type="checkbox">장르4</label>&nbsp;&nbsp;&nbsp;&nbsp; <label><input type="checkbox">장르5</label>&nbsp;&nbsp;&nbsp;&nbsp; <label><input type="checkbox">장르6</label><br><br>
									</td>
								</tr>
							</table>
							
						</div>
						<div class="submitbt">
							<input type="submit" value="수정완료">
						</div>	
						</form>
					</div>
			</main>		
		</div>
		<footer>
			<nav class="footbar">
				
			</nav>
		</footer>
	</div>
</body>
</html>