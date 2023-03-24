package com.north814.cyllene;

import java.sql.*;
import java.util.ArrayList;

import javax.sql.*;
import javax.naming.*;

public class TestEngine {
	private Connection conn = null;
	private DataSource ds = null;
	
	public TestEngine() throws Exception{
        Context ctx = new InitialContext();
        ds = (DataSource)ctx.lookup("java:comp/env/jdbc/cyllene");		
	}
	
	public TestEngine(boolean testmode) throws Exception{
		try {
		
			System.out.println("HELLO-WORLD");
//			conn = DriverManager.getConnection("jdbc:mysql://tethys/scorecard","scorecard","scorecard");
//			System.out.println("Connection IsClosed: " + conn.isClosed());
		}finally {
			try {conn.close();}catch(Exception ce) {}
		}
	}
	
	public void lookupExam(int examID) throws Exception{
		System.out.println("lookupExam: " + examID);
	}
	
	

	public static void main (String[] args) {
		try {				
			TestEngine te = new TestEngine(true);
			te.lookupExam(721);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	
	
}
