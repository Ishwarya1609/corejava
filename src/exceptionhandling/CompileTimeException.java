package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {

	public static void main(String[] args) {
		try {
			FileInputStream fi=new FileInputStream("C:\\Users\\Admin\\Desktop\\Aish\\Software Testing\\Pgms\\corejava\\small pgms.docx");
		} catch (Exception e) {
			System.out.println("Please check whether the File is available");
		}
	


	}

}
