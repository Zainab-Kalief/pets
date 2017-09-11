package com.wura.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wura.web.models.Cat;
import com.wura.web.models.Dog;
import com.wura.web.models.Pet;

/**
 * Servlet implementation class Make
 */

public class Make extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Make() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String breed = request.getParameter("breed");
		int weight = Integer.parseInt(request.getParameter("weight"));
		Dog dog = null;
		Cat cat = null;
		Pet pet = null;
		if (request.getParameter("pet").equals("dog")) {
			dog = new Dog(name, breed, weight);
			pet = dog;
		} else {
			cat = new Cat(name, breed, weight);
			pet = cat;
		}
		
		request.setAttribute("pet", pet);
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/ShowPet.jsp");
		view.forward(request, response);
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//	
//		out.write("<h1>" + pet.showAffection() + "</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
