package cn.yodes.TomJava.String;


/**
 * @author Yodes.cn
 * String tookit for JAVA developer.
 */

public class StringTookit {
	
	
	/**
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
	 * @
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
}
