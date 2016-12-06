package cn.yodes.TomJava.Rex;

import java.util.regex.Pattern;

/**
 *  Copyright  2016  Yodes.cn
 *  All       right      reserved.
 *  @author Yodes E-mail:yodeser@gmail.com
 *  @version Create on 2016年12月6日 下午5:18:03
 *  description
 */

public class StringRex {

	static Pattern pattern = Pattern.compile("^[-\\+]?\\d+(\\.\\d*)?|\\.\\d+$");
}
