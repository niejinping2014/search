package xyz.hollysys.search.util;

public class StringUtils {
	public static boolean isBlank(String str){
		if(str == null || str.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
}
