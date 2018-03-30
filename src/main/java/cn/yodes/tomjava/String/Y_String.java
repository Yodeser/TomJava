package cn.yodes.tomjava.String;

import java.util.regex.Pattern;

/**
 * @author Yodes.cn
 * String tookit for JAVA developer.
 */

/**
 * @author Yodes
 *
 */
public class Y_String {
	
	
	/**
	 * judge a string does not contains  many substing.(means ||)
	 * @param s 
	 * @param args
	 * @return boolean
	 */
	public static boolean isContains(String name, String... args) {
		boolean flag = true;
		for (int i = 0; i < args.length; i++) {
			if (!name.contains(args[i])) {
				flag = false;
			}
		}
		return flag;
	}

	
	/**
	 * judge a string does not equals many substring.(means &&)
	 * @param name
	 * @param args
	 * @return boolean
	 */
	public static boolean isEquals(String name, String... args) {
		for (int i = 0; i < args.length; i++) {
			if (name.equalsIgnoreCase(args[i])) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * judge a string is not a legal double data.
	 * @param str
	 * @return boolean
	 */
	public static boolean isDouble(String str) {

	    Pattern pattern = Pattern.compile("^[-\\+]?\\d+(\\.\\d*)?|\\.\\d+$");

	    return pattern.matcher(str).matches();

	}
	
	/**
	 * judge a string is not a legal int data.
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str){  
	    Pattern pattern = Pattern.compile("[0-9]*");  
	    return pattern.matcher(str).matches();     
	}  
}
