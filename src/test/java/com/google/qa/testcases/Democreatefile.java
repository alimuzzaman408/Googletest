package com.google.qa.testcases;

import java.io.File;
import java.io.IOException;
import org.testng.annotations.Test;
public class Democreatefile {		
@Test
public void demofile() throws IOException {
	File file= new File("C:/Users/shapan/Desktop/jHON");
	file.mkdir();
	System.out.println("Folder has created");
}
	

}
