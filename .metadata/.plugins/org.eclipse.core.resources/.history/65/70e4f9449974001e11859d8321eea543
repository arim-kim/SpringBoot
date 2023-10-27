<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Main</title>
</head>
<body>
	<h1>Student Main</h1>
	<button id="btnStudentDetail">Student 상세</button>
	<button id="btnStudentList">Student 목록</button>
	<button id="btnStudentInsert">Student 등록</button>
	<button id="btnStudentUpdate">Student 수정</button>
	<button id="btnStudentDelete">Student 삭제</button>
	<button id="btnStudentDetailJsp">Student 상세 Jsp</button>
	<button id="btnStudentListJsp">StudentList 상세 Jsp</button>

	<script>
	window.onload = function() {
		
		document.querySelector("#btnStudentDetail").onclick = async function() {
			// 비동기 요청
			try {
				let response = await fetch('/mydb/studentDetail/5');
				let data = await response.json();
				// data로 이후 비동기 처리 결과
				console.log(data);
			} catch(error) {
				console.error(error);
			}
		};
		
		
	
		document.querySelector("#btnStudentInsert").onclick = async function() {
			// 비동기 요청
			// post로 전송할 데이터 준비
			// post로 전송 www-urlencoded
			let urlParams = new URLSearchParams({
				student_nm: '홍길동', // 수정 
				email: 'gildong@gmail.com',
				phone: '010-1234-5678',
			});
			
			
			let fetchOptions = {
					method: 'POST',
					body: urlParams
			}
			
			try {
				let response = await fetch('/mydb/studentInsert', fetchOptions);
				let data = await response.json();
				// data로 이후 비동기 처리 결과
				console.log(data);
			} catch(error) {
				console.error(error);
			}
			
		};
		
		document.querySelector("#btnStudentDetailJsp").onclick = function() {
			// 동기화된 페이지 요청
			window.location.href = "/mydb/studentDetailJsp/2";
			
		};
		
		// 수정 
		document.querySelector("#btnStudentListJsp").onclick = async function() {
			window.location.href = "/mydb/studentListJsp";
		};
		
		
		document.querySelector("#btnStudentList").onclick = async function() {
			try {
				
				let response = await fetch('/mydb/studentList'); // 옵션 없으므로 get
				let data = await response.json(); // json으로 변환 
				
				// data로 이후 비동기 처리 결과를 보여줘야 
				console.log(data);
			} catch (error) {

			}
		};
		
		
		let empUpdateData = {
			 student_id : 1,
			 student_nm : '길동2',
			 email : 'sa@gildong2.com',
			 phone : '010-0000-0000'
		};
		
		document.querySelector("#btnStudentUpdate").onclick = async function() {
			try {
			
				let fetchOptions = {
						method : 'POST',
						body : new URLSearchParams(empUpdateData)
				}
				
				let response = await fetch('/mydb/studentUpdate', fetchOptions); // 옵션 없으므로 get
				let data = await response.json(); // json으로 변환 
				
				// data로 이후 비동기 처리 결과를 보여줘야 
				console.log(data);
				
			} catch (error) {
				console.error(error);
			}
		};
		
		document.querySelector("#btnStudentDelete").onclick = async function() {
			try {
			
				
				let response = await fetch('/mydb/studentDelete/1'); // 옵션 없으므로 get
				let data = await response.json(); // json으로 변환 
				
				// data로 이후 비동기 처리 결과를 보여줘야 
				console.log(data);
				
			} catch (error) {
				console.error(error);
			}
		};
	
	}

</script>

</body>



</html>