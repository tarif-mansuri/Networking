package com.tm.url;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateURL {
	public static void main(String[] args) {
		try {
			/*
			 * Creating an absolute URL. An absolute URL contains all of the information
			 * necessary to reach the resource
			 */
			URL absoluteUrl = new URL("http://example.com/");

			/*
			 * Creating relative URL we can create relative URL using absolute URL
			 * 
			 * URL(URL baseURL, String relativeURL) The first argument is a URL object that
			 * specifies the base of the new URL. The second argument is a String that
			 * specifies the rest of the resource name relative to the base. If baseURL is
			 * null, then this constructor treats relativeURL like an absolute URL
			 * specification. Conversely, if relativeURL is an absolute URL specification,
			 * then the constructor ignores baseURL.
			 */
			URL relativeUrl1 = new URL(absoluteUrl, "pages/page1.html");
			URL relativeUrl2 = new URL(absoluteUrl, "pages/page2.html");
			URL relativeUrl3 = new URL(relativeUrl1, "/anything");

			// Other URL Constructors
			/*
			 * URL(protocol, hostName, path); path starts with forward slash
			 * 
			 * URL(protocol, hostName, port ,path);
			 */
			URL otherUrl1 = new URL("http", "example.com", "/pages/page1.html");
			//rendered url = http://example.com/pages/page1.html
			URL otherUrl2 = new URL("http", "example.com", 80, "/pages/page1.html");
			//rendered url = http://example.com:80/pages/page1.html
			
			//URL addresses with Special characters
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}

}
