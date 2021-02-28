/**
 * 
 */
package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author johnj
 *
 */
public class HashCheck {
	//Private Variables
	private String pdata;
	private StringBuffer checkSum = new StringBuffer();
	private byte[] digest;
	

	//Constructor Classes
	public HashCheck(String data) {
		pdata = data;
		createDigest(pdata);
	}
	
	public HashCheck(String data1, String data2) {
		pdata = data1 + " " + data2;
		createDigest(pdata);
	}
	
	
	private void createDigest(String dpdata) {
		//Create message digest object
		MessageDigest md;
		//try catch when setting algorithm
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(dpdata.getBytes());
			digest = md.digest();
			
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Convert from byte array to HesString format
		for( int i = 0; i < digest.length; i++) {
			checkSum.append(Integer.toHexString(0xFF & digest[i]));
		}
	}
	
	//Make a message.
	public String getMessage() {
		String message = "<p>This is " + pdata + "</p>\n\n" + "<p>SHA-256: CheckSum Value: " +  checkSum.toString() +"</p>";
		return message;
		
	}
	
	
}
