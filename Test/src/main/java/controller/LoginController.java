package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Member;
import service.face.LoginService;
import service.impl.LoginServiceImpl;


@WebServlet("/test/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginService loginService = new LoginServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/test/login [GET]");
		
		req.getRequestDispatcher("/WEB-INF/views/login/login.jsp").forward(req, resp);
	
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/test/login [POST]");
		req.setCharacterEncoding("UTF-8");
		
		Member member = new Member();
		
		member.setUserid(req.getParameter("userid"));
		member.setUserpw(req.getParameter("userpw"));
		
		System.out.println(member);
		
		//DB에서 조회하기
		Member result = loginService.login(member);
		
		System.out.println("컨트롤러쪽 result : " + result);
		
		if(result!=null) {
			
			//세션
			HttpSession session = req.getSession();
			
			session.setAttribute("userno", result.getUserno());
			session.setAttribute("userid", result.getUserid());
			session.setAttribute("username", result.getUsername());
			
			resp.sendRedirect("./user");
			
		} else {
			resp.sendRedirect("./login");
		}
		

		
//		넘버 아이디 네ㅔ임
//		보여줄건 아이디 네임
//		회원정보 수정시 넘버로보여줄 때는 세션에 아이디 네임을 변경해서
		
		
		//세션으로 보내면
		//회원정보 수정 세션으로 안보내면 인식 못함 어떤 회원 정보를 수정할건지
		
		

		
	
	}
	

}
