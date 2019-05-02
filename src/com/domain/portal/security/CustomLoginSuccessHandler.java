package com.domain.portal.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

@Service("customLoginSuccessHandler")
public class CustomLoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
	private static final Logger log = LoggerFactory.getLogger(CustomLoginSuccessHandler.class);

	public CustomLoginSuccessHandler() {
	}

	/**
	 * This method will redirect to the page that was called.
	 */
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		log.debug("Session: {}", session);

		if (session != null) {
			super.onAuthenticationSuccess(request, response, authentication);
		} else {
			super.onAuthenticationSuccess(request, response, authentication);
		}
	}
}