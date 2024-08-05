package kr.co.kosta.model2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mvcboard/view.do")
public class ViewController extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		MVCBoardDAO dao = new MVCBoardDAO();
		String idx = request.getParameter("idx");
		// 조회수 1증가
		dao.updateVisitCount(idx);				// 조회수 호출(MVCBoardDAO)
		
		MVCBoardDTO dto = dao.selectView(idx);
		dao.close();      // 이미 dto에 값을 넣었기 때문에 dao 닫아도 됨
		
		// 줄바꿈 처리
		dto.setContent(dto.getContent().replace("\r\n", "<br/>"));
		
		
		// 첨부파일 확장자(sfile) 확인 및 이미지 타입 표시
		String ext = null;
		String fileName = dto.getSfile();
		if(fileName != null)
			ext = fileName.substring(fileName.lastIndexOf(".")+1);   // 파일이름의 뒤에서부터 저장
		String[] mimetype = {"jpg", "png", "gif"};					 // 이 중 하나 포함되면 이미지로 처리
		List<String> mimetypeList = Arrays.asList(mimetype);
		
		boolean isImage = false;
		if(mimetypeList.contains(ext));
			isImage = true;
			
		request.setAttribute("dto", dto);
		request.setAttribute("isImage", isImage);		
		request.getRequestDispatcher("/board/view.jsp").forward(request, response);
	}
}
