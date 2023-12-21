package dataDrivenFramework;

import java.io.FileInputStream;

import java.util.Properties;

public class Fetch_from_Properties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("D:\\Selenium\\logincredentials.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		
		String USERNAME= pobj.getProperty("username");
		String PASSWORD= pobj.getProperty("password");
		String URL=pobj.getProperty("url");
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(URL);
	}

}
