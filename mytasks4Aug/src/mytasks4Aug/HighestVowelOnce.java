package mytasks4Aug;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HighestVowelOnce {
	public static void main(String[] args) {
		 
		String s="Hiiii Heeeello i looove to do code and practicing my skiill over there";
		System.out.println(hello(s));
	}
	public static String hello(String s) {
		String[] ar=s.split(" ");
		Arrays.sort(ar); 
		Map<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
		for(String w:ar) {
			//int length=w.length();
			int n = countUniqueVowel(w);
			if(map.containsKey(n)) {
				String temp=map.get(n);
				temp=w+" "+temp;
				map.put(n, temp);
				
			}else {
				map.put(n, w);
			}
		}
		System.out.println("map: "+map);
		StringBuilder sb=new StringBuilder();
		for(Entry<Integer,String> e:map.entrySet()) {
			sb.append(e.getValue()).append(" ");
		}
		return sb.toString().trim();
	}
	public static int countUniqueVowel(String s) {
		int count=0;
		s.toLowerCase();
		if(s.contains("a")) {
			count++;
		}
		if(s.contains("e")) {
			count++;
		}
		if(s.contains("i")) {
			count++;
		}
		if(s.contains("o")) {
			count++;
		}
		if(s.contains("u")) {
			count++;
		}
		return count;
	}
}

