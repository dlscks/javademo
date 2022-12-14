package java017_collection;

import java.util.ArrayList;

public class Java186_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");
		String[] arr = display(aList);
		for (String data : arr)
			System.out.println(data);

	}// end main

	public static String[] display(ArrayList<String> aList) {
		//방법 1
//		String[] stn = new String[aList.size()];
//		for (int i = 0; i < stn.length; i++) {
//			stn[i] = aList.get(i);
//		}
//		return stn;

		///////방법 2//////////////////////////////////////////////////
//		String[] stn = new String[aList.size()];
//		
//		return aList.toArray(stn);
		
	///////방법 3//////////////////////////////////////////////////
		
		return aList.toArray(new String[aList.size()]);
	}
}// end class
