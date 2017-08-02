package code.com.copart.problem2;

public class Solution21 {

	public void geLongestSequence(String word) {
		
		char[] charArray = word.toCharArray();
		int size = word.length();
		int[][] array = new int[size][size];
		
		int count = 0;
		for(int i = 0; i< size; i++) {
			
			count++;
			
			for(int j = 0; j< size; j++) {
				
				if(charArray[i] == charArray[j]) {
					array[i][j] = count;
				}
				else {
					array[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i< size; i++) {
			
			for(int j = 0; j< size; j++) {
				
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
		
		find(charArray, array);
		
	}
	
	private String search(char[] chArr, int[][] array, int i, int j) {
		
		if(i- 1>= 0 && j-1>=0 && array[i-1][j-1] < array[i][j]) {
			return search(chArr, array, i-1, j-1) + chArr[i];
		}
		else {
			
			return String.valueOf(chArr[i]);
		}
	}

	private void find(char[] chArr, int[][] intArr) {
		
		int size = chArr.length;
		String strSeq = "";
		
		for(int i = 0; i< size; i++) {
			
			for(int j = i; j< size; j++) {
				
				if(i!=j) {
					
					String str = search(chArr, intArr, i, j);
					
					if(strSeq.length() < str.length()) {
						
						strSeq = str;
					}
				}
				
			}
		}
		System.out.println(strSeq);
	}
	
	public static void main(String[] args) {
		
		Solution21 obj = new Solution21();
		obj.geLongestSequence("abracadabra");
	}
}
