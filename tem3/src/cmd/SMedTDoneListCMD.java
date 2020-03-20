package cmd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import kcr.MediRqListItemDAO;
import kcr.XXHosInfoDAO;
import kcr.XXMediRqstDAO;
import lastdto.hosMemberDTO;
import lastdto.mediRqListItemDTO;
import lastdto.mediRqstDTO;

public class SMedTDoneListCMD implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// String id = request.getParameter("id"); 
		//로그인중인 아이디를 받아오도록// 나중에 세션으로 변경
		String id = "sic1"; //가상의 파라미터
		
		String type = "tmr";
		
		MediRqListItemDAO dao = new MediRqListItemDAO();
		List<mediRqListItemDTO> list = new ArrayList<>();
//		list = dao.selectDone(id, type);
		
		
		request.setAttribute("list", list);
		request.setAttribute("id", id);  
		
		String path ="aView/chorong/med_TdoneList.jsp";
		
		return path;
	}

}
