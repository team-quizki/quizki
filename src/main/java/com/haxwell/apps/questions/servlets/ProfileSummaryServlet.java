package com.haxwell.apps.questions.servlets;

/**
 * Copyright 2013,2014 Johnathan E. James - haxwell.org - jj-ccs.com - quizki.com
 *
 * This file is part of Quizki.
 *
 * Quizki is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * Quizki is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Quizki. If not, see http://www.gnu.org/licenses.
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haxwell.apps.questions.constants.Constants;
import com.haxwell.apps.questions.entities.User;
import com.haxwell.apps.questions.managers.NotificationManager;
import com.haxwell.apps.questions.servlets.actions.SetListOfUserNotificationsInSessionAction;

/**
 * Servlet implementation class ProfileSummaryServlet
 */
//@ WebServlet("/secured/ProfileSummaryServlet")
public class ProfileSummaryServlet extends AbstractHttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileSummaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fwdPage = "/secured/profile.jsp";
		
		String button = request.getParameter("button");
		
		if (button == null) button = "";
		
		if (button.equals("Clear"))
		{
			User user = (User)request.getSession().getAttribute(Constants.CURRENT_USER_ENTITY);
			
			NotificationManager.clearAllUserNotifications(user.getId());
		}
		
		request.getSession().setAttribute("tabIndex", Constants.PROFILE_SUMMARY_TAB_INDEX);
		
		forwardToJSP(request, response, fwdPage);
	}
}
