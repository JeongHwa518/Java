package kr.co.kosta.model2;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mvcboard/edit.do")
@MultipartConfig(
		maxFileSize = 1048576,
		maxRequestSize = 10485760
)
public class EditController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String idx = request.getParameter("idx");
		MVCBoardDAO dao = new MVCBoardDAO();
	 	MVCBoardDTO dto = dao.selectView(idx);
	 	request.setAttribute("dto", dto);		// 컨트롤러랑 jsp 파일이랑 위치가 다르므로 공유 해야 함
	 	request.getRequestDispatcher("/board/edit.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}
}
