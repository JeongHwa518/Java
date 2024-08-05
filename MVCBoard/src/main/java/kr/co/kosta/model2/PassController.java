package kr.co.kosta.model2;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import kr.co.kosta.util.JSFunction;

@WebServlet("/mvcboard/pass.do")
public class PassController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setAttribute("mode", request.getParameter("mode"));		// 키값 mode에 실제 값 mode가 저장됨
		request.getRequestDispatcher("/board/pass.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String idx = request.getParameter("idx");
		String mode = request.getParameter("mode");
		String pass = request.getParameter("pass");
		
		MVCBoardDAO dao = new MVCBoardDAO();
		boolean confirmed = dao.confirmPassword(pass, idx);
		dao.close();
		
		if (confirmed) {
			if(mode.equals("edit")) {	// 수정모드
				HttpSession session = request.getSession();
				session.setAttribute("pass", pass);
				response.sendRedirect("../mvcboard/edit.do?idx=" + idx);
				
			} else if (mode.equals("delete")) {
				
			}
		} else {
			JSFunction.alertBack(response, "비밀번호 검증에 실패했습니다.");
		}
	}
}


