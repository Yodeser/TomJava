package cn.yodes.TomJava.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *  Copyright  2016  Yodes.cn
 *  All       right      reserved.
 *  @author Yodes E-mail:yodeser@gmail.com
 *  @version Create on 2016年12月7日 上午12:29:17
 *  description
 */

public class Y_Map {

	/**
	 * Compute the max value and key of the input map.
	 * @param data
	 * @return (maxKey , maxValue)
	 */
	public static String computeMax(Map<String, Double> data) {
		 Map<String, Double> dataMap = data;
		 List<Double> list = new ArrayList<Double>();
		     
		 Iterator<Entry<String, Double>> ite = dataMap.entrySet().iterator();
		 while(ite.hasNext()){
			 Entry<String, Double> entry = ite.next();
			 Double.parseDouble(entry.getValue().toString());
			 list.add(entry.getValue());
		 }
		 Collections.sort(list);

		 for (Entry<String, Double> entry : dataMap.entrySet()) {  
			  
			  if(entry.getValue() == list.get(list.size() - 1)){
				  return ""+"("+entry.getKey().toString()+" , "+entry.getValue()+")";
			  }
			  
		 }  
	     
		return null;
	}

	/**
	 * Compute the min key and value of the input map.
	 * @param data
	 * @return (minKey , minValue)
	 */
	public static String computeMin(Map<String, Double> data) {
		 Map<String, Double> dataMap = data;
		 List<Double> list = new ArrayList<Double>();
		     
		 Iterator<Entry<String, Double>> ite = dataMap.entrySet().iterator();
		 while(ite.hasNext()){
			 Entry<String, Double> entry = ite.next();
			 entry.getValue();
			 list.add(entry.getValue());
		 }
		 Collections.sort(list);
		 
		 
		 for (Entry<String, Double> entry : dataMap.entrySet()) {  
			  
			  if(entry.getValue() == list.get(0)){
				  return ""+"("+entry.getKey().toString()+" , "+entry.getValue()+")";
			  }
			  
		 }  
	     
		return null;
	}
	
    //根据value值获取到对应的一个key值
    public static String getKey(HashMap<String,String> map,String value){
        String key = null;
        //Map,HashMap并没有实现Iteratable接口.不能用于增强for循环.
        for(String getKey: map.keySet()){
            if(map.get(getKey).equals(value)){
                key = getKey;
            }
        }
        return key;
        //这个key肯定是最后一个满足该条件的key.
    }
    
    //根据value值获取到对应的所有的key值
    public static List<String> getKeyList(HashMap<String,String> map,String value){
        List<String> keyList = new ArrayList<String>();
        for(String getKey: map.keySet()){
            if(map.get(getKey).equals(value)){
                keyList.add(getKey);
            }
        }
        return keyList;
    }
	
}
