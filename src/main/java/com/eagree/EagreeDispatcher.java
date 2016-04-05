package com.eagree;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/**
 * 
 * @author aksinghdce
 * The below class acts as a dispatcher servlet, much like a unit that knows what controller 
 * will handle a particular client request.
 */
public class EagreeDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}

}
