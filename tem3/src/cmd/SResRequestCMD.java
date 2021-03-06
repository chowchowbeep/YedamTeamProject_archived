package cmd;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

public class SResRequestCMD implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// S28,29통합 진료신청페이지로 이동.
		
		//getParameter()없이 jsp에서 바로 페이지에 출력할 
		//hosId, hosName, hosAdd, hosBizTime은 ${param.name} 사용
		
		request.setAttribute("rqType", "Res");// 진료신청페이지에서 접수인지, 예약인지에 따라 정보를 다르게 표시할 수 있도록

		String path = "aView/chorong/request.jsp";
		return path;
	}

}
