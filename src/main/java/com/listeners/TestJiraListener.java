package com.listeners;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.utill.JiraPolicy;
import com.utill.JiraServiceProvider;

import net.rcarz.jiraclient.JiraException;

public class TestJiraListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady = jiraPolicy.logTicketReady();
		if(isTicketReady) {
			//raise Jira Ticket
			System.out.println("is ticket ready for JIRA"+isTicketReady);
			JiraServiceProvider jirasp = new JiraServiceProvider("","","","");
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()+"got failed due to some assertion orexception";
		    String issueDescription = result.getThrowable().getMessage()+"\n";
		    issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
		    
		    try {
				jirasp.createJiraTicket("Bug", issueSummary, issueDescription, "reportername");
			} catch (JiraException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		
		
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
