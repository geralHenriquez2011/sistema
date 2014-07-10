package com.desarrollo.sistema.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HomeControllerTests {

	 @Test
	    public void testHandleRequestView() throws Exception{		
	        HomeController controller = new HomeController();
	        ModelAndView modelAndView = controller.handleRequest(null, null);		
	        assertEquals("index", modelAndView.getViewName());
	        assertNotNull(modelAndView.getModel());
	        String nowValue = (String) modelAndView.getModel().get("now");
	        assertNotNull(nowValue);

	    }
}
