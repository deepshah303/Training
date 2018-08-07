package lti.hola.web;

import javax.servlet.http.HttpServletRequest;

import lti.hola.bean.ForgetBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;
import lti.hola.service.UserService;
import lti.hola.service.UserServiceImpl;

public class LoginController {
	public static RegisterBean authenticate(HttpServletRequest request) {
		UserService service = new UserServiceImpl();

		// Instantiating login been to hold login credentials
		LoginBean login = new LoginBean();
		// Reading request parameters and storing in login bean object
		login.setEmail(request.getParameter("email"));
		login.setPassword(request.getParameter("password"));
		// Passing login bean object to service method
		RegisterBean user = service.authenticate(login);
		return user;

	}

	public static boolean forgetPassword(HttpServletRequest request) {
		UserService service = new UserServiceImpl();

		ForgetBean forget = new ForgetBean();
		forget.setEmail(request.getParameter("email"));
		forget.setMovie(request.getParameter("movie"));

		return service.validate(forget);
	}

	public static boolean changePassword(HttpServletRequest request) {
		UserService service = new UserServiceImpl();
		// Reading request parameters and storing in login bean object
		LoginBean change = new LoginBean();
		change.setEmail(request.getParameter("email"));
		change.setPassword(request.getParameter("password"));

		return service.changePassword(change);

	}

}
