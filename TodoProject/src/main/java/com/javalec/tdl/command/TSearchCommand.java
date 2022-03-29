package com.javalec.tdl.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TSearchCommand implements TCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		TDao dao = new TDao();
		ArrayList<TDao> dtos = dao.search();
		request.setAttribute("search", dtos);	
	}

}
