package com.tm.url;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadUrlDirectly {
	public static void main(String[] args) {
		try {
			URL oracleUrl = new URL("https://www.oracle.com");
			
			InputStream is = oracleUrl.openStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			is.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
