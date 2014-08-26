import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//import com.ebao.pub.util.StringUtils;

/**
 * 
 */

/**
 * @author chris.zhang
 *
 */
public class Test {
	
	public static void main(String[] args) {
		//			XmlHandler.readXmlFile();
//		System.out.println(true||false);
//		StringUtils.isNullOrEmpty(str)
//		Random rnd = new Random(100);
//		int i =rnd.nextInt();
//		System.out.println(i);
//		HashMap map = new HashMap();
//		combine(map, "hello");
//		System.out.println((String)map.get("hello"));
//		System.out.println(true||false);
		List aa = new ArrayList();
		aa = null;
		System.out.println(aa.size());
	}
	
	public static HashMap combine (HashMap map,String str){
		map.put(str, str);
		return map;
	}
	
	/**
	 * loop print a list
	 * @param list
	 */
	public static void doLoopPrint(List list){
		for(Object l :list){
			if(!"".equals(l)&&l!=null)
			System.out.println(list.toString());
		}
	}
	
	public static String doLoopPrint1(List list){
		return null;
	}
	private static String filePath = "D:\\workspace\\TP_DEV_SRC_6\\test\\file\\test.xml";

}
