package services;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TemplatePage implements ITemplatePage {

	@Override
	public String generateJSP() {
		// TODO Auto-generated method stub

			return getClass().getResource("bar.jsp").toString();
	}
	
	private String generateMenu() throws IOException {
		
		return "";
	}
}
