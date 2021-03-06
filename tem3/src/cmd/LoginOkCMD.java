package cmd;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import command.Command;

public class LoginOkCMD implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberType = request.getParameter("memberType");
		String id = request.getParameter("id");
		System.out.println("=======================loginOkCMD+++++"+memberType);	
		System.out.println("=======================loginOkCMD+++++"+id);	

		String path = null;

		if (memberType.equals("sickMember") && id.equals("admin")) { //관리자메인이동 임시
			path = "redirect:MMain.do"; 
		} else if (memberType.equals("hosMember")) {
			path = "redirect:HHospitalMain.do";
		} else if (memberType.equals("sickMember")) {
			path = "redirect:SSickMain.do";
		} 
			
		
//		HttpSession session = request.getSession();
//		if (session.isNew() || session.getAttribute("memberId") == null) {
//			session.setAttribute("memberId", id);
//			System.out.println("로그인 완료");
//		} else {
//			System.out.println("이미 로그인되어 있음");
//		}
		
		HttpSession session = request.getSession(); //세션 생성
		session.setAttribute("memberId", id); //세션 객체에 id값을 memberId라는 이름으로 저장
		
		return path;
	}

}
