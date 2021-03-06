package cmd;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import kty.ArtrDAO;
import lastdto.artrInfoDTO;

public class HDoctorAddVerifyCMD implements Command{

   @Override
   public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String hosId = (String) request.getSession().getAttribute("memberId");

		artrInfoDTO dto = new artrInfoDTO();
		dto.setHosId(hosId);//
		dto.setArtrName(request.getParameter("artrName"));
		dto.setArtrSub(request.getParameter("artrSub"));

		ArtrDAO dao = new ArtrDAO();
		dao.insert(dto);
		
      return "redirect:HDoctorlist.do";
   }

   
   
}