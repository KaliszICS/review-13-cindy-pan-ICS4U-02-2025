import java.util.*;

public class PracticeProblem {


	public static void swap(ArrayList<String> list , int one, int two){
		list.set((one), list.get(two));
		list.set(two, list.get(one));
	}	

	public static ArrayList<Double> createArrayList(double[] list){
		ArrayList<Double> arrL = new ArrayList<Double>();
		for (int length = 0; length< list.length; length++){
			arrL.set(length, list[length]);
		}
		return arrL;
	}

	public static HashMap<String, Integer>  combineParallelArrays(String[] names, int[] ages){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		if (names.length == ages.length){
			for (int length = 0; length<ages.length; length++){
				map.put(names[length],ages[length]);
			}

		}		
		return map;
	}
	
	public static void increaseAge(HashMap<String, Integer> map, ) 


}

