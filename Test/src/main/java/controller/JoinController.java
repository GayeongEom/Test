package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.Member;
import service.face.JoinService;
import service.impl.JoinServiceImpl;

@WebServlet("/test/join")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private JoinService joinService = new JoinServiceImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/test/join [GET]");
	
		req.getRequestDispatcher("/WEB-INF/views/login/join.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/test/join [POST]");
		req.setCharacterEncoding("UTF-8");
	
		Member member = new Member();
		
		member.setUsername(req.getParameter("username"));
		member.setUserid(req.getParameter("userid"));
		member.setUserpw(req.getParameter("userpw"));
		member.setUseremail(req.getParameter("useremail"));
		member.setUserphone(req.getParameter("userphone"));
		member.setUsergrade(req.getParameter("usergrade"));
		
		System.out.println(member);
		
		//DB에 인서트 해야해
		int result = joinService.joinNew(member);
		
		System.out.println("Controller쪽 result : " + result);
		
		if(result > 0) {	//성공하면 로그인 화면으로 넘어가기
			resp.sendRedirect("./login");
		} 
	
	
	}
	
	

}
