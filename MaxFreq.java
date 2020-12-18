import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class MaxFreq {
	
	public static int removeDuplicates(int arr[]){
		
		
		HashMap<Integer,Integer> seen = new HashMap<>();
        int max = 0 ;
        int v =0;
        int output=0;
		for(int i = 0;i<arr.length;i++ ) {
			if(seen.containsKey(arr[i])){
				v = seen.get(arr[i]);
                seen.put(arr[i],v+1);
			}
			else {
			seen.put(arr[i],1);}
			
		}
		for (Map.Entry<Integer,Integer> entry :seen.entrySet()) {
		    Integer key = entry.getKey();
		    Integer value = entry.getValue();
		    
//		    System.out.println("This is the Key " + key + "and the value is " + value);
		    if(value>max) {
		    	max=value;
		    	output=key;
		    }
		    
		    
		}
		return output;
			
       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,6,6,6,6,9,9,9,9,9,9,9,9,99,97,8,9};
		int output = removeDuplicates(arr);
		System.out.println(output);
		


	}

}
