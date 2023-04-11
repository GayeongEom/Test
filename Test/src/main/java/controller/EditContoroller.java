package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.Member;
import service.face.EditService;
import service.impl.EditServiceImpl;

@WebServlet("/test/edit")
public class EditContoroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EditService editService = new EditServiceImpl();
	HttpSession session = null;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/test/edit [GET]");
		
		
		session = req.getSession();
		
		//현재 넘어온 userno으로 DB에서 일치하는 데이터 가져와야함
		int userno = (int)session.getAttribute("userno");
		System.out.println("세션에서 얻어온 userno : " + userno);
		
		Member member = editService.getInfo(userno);
		
		System.out.println("Controller member : " + member);
		
		session.setAttribute("member", member);
		
		req.getRequestDispatcher("/WEB-INF/views/login/edit.jsp").forward(req, resp);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("/test/edit [POST]");

		req.setCharacterEncoding("UTF-8");
	
		//현재 넘어온 userno으로 DB에서 일치하는 데이터 가져와야함
		int userno = (int)session.getAttribute("userno");
		System.out.println("세션에서 얻어온 userno : " + userno);
		
		Member member = new Member();
		
		member.setUserno(userno);
		member.setUsername(req.getParameter("username"));
		member.setUserid(req.getParameter("userid"));
		member.setUserpw(req.getParameter("userpw"));
		member.setUseremail(req.getParameter("useremail"));
		member.setUserphone(req.getParameter("userphone"));
		member.setUsergrade(req.getParameter("usergrade"));
		
		editService.editInfo(member);
		
		resp.sendRedirect("./user");
	
	
	}
	
	
}
