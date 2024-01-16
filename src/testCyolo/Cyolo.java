package testCyolo;

import java.util.ArrayList;
import java.util.List;

public class Cyolo {

	
	public static List<int[]> method(int[][]A, int[][]B){
	List<int[]> res = new ArrayList<>();
	
	int i =0, j =0;
	
	while(i < A.length && j < B.length) {
		int[] partA = A[i];
		int[] partB = B[j];
	if(partA[0] <= partB[1] && partB[0]<= partA[1]) {
		int resStart = Math.max(partA[0], partB[0]);
		int resEnd = Math.min(partA[1], partB[1]);
		res.add(new int[] {resStart, resEnd});
	}
	if(partA[1]<partB[1]) {
		i++;
	} else {
		j++;
	}
	}	
	return res;
}
}
