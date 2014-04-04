package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description TODO
 * @author hongxingfan
 * @since 2014年4月4日 下午5:35:38
 * @summarize 使用好向前匹配=?(content)
 */
public class PicturePattern {
	private static Pattern pat = Pattern.compile("^\\/(model|photo)_{0,1}([0-9]*)\\/(.*?pic.*?)0*([0-9]{3,})=?(\\.shtml)");

	public static void main(String[] args) {
		String url = "";
		Matcher matcher = pat.matcher(url);
		if (matcher.find()) {
			System.out.println(matcher.group());
		}
	}

}
