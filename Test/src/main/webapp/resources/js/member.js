
function validate() {
	
	//---- 이름 유효성 검증 ----
	if($("#username").val() == "") {
		
		$("#username_msg").html("이름을 입력하세요!")
		return false
		
	}
	
	//이름 패턴 검증
	var nmReg = /^[a-zA-Z가-힣]{2,20}$/
	if(!nmReg.test($("#username").val())) {
		
		$("#username_msg").html("이름은 2~20자 한글, 영문 대소문자만 입력할 수 있습니다")
		return false
		
	}	
	
	
	//---- ID 유효성 검증 ----
	
	//아이디를 입력했는지 검증
	if($("#userid").val() == "") {
		
		$("#userid_msg").html("아이디를 입력하세요!")
		return false
		
	}
	
	//아이디 패턴 검증
	//5~20자의 소문자, 숫자만 사용 가능
	var idReg = /^[a-zA-Z0-9]{5,20}$/
	if(!idReg.test($("#userid").val())) {
		
		$("#uid_msg").html("아이디는 5~20자의 영대소문자, 숫자만 가능합니다")
		return false
		
	}
	
	
	//---- PASSWORD 유효성 검증 ----
	
	//패스워드를 입력하지 않았을 때
	if($("#userpw").val()=="") {
		
		$("#userpw_msg").html("비밀번호를 입력하세요!")
		return false
		
	}
	
	//패스워드 입력값 검증
	var pwReg = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*\-_+=])[a-zA-Z0-9!@#$%^&*_+\-=]{8,16}$/
	
	if(!pwReg.test($("#userpw").val())){
		
		$("#userpw_msg").html("비밀번호는 8~16자 영문 대소문자, 숫자, 특수문자를 사용하세요")
		return false
	}
	
	
	//---- 비밀번호 입력 확인 ----
	if($("#userpw").val() != $("#userpwch").val()) {
		
		$("#userpwch_msg").html("비밀번호가 일치하지 않습니다")
		
		return false
		
	}
	
	
	
	//유효성 검증 성공
	return true
	
	
}
