/**
 * 
 */
package com.poc.common;

import java.security.MessageDigest;

/**
 * Used to encrypt the password
 * 
 * @author niel_liu
 *
 */
public class PasswordUtil {
	
	public static char[] CH_TABLE = {'0' , '1' , '2', '3', '4' , '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	/**
	 * Encrypt the string with MD5
	 * @param plain
	 * @return
	 */
	public static String encryptWithMD5(String plain) {
		String result = "";
		
		try {
			
			MessageDigest md = MessageDigest.getInstance("MD5");
		
			md.update(plain.getBytes());
	    
			byte[] b=md.digest();
	    
			int size = b.length;
			char[] temp = new char[size*2];
	    
			for(int i = 0; i < size; ++i) {
				temp[2*i] = CH_TABLE[((b[i] >> 4) & 0x0f)];
				temp[2*i + 1] = CH_TABLE[b[i] & 0x0f];
			}
			result = String.valueOf(temp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
