package code.com.copart.problem2;

public class Solution22 {

	public void geLongestSequence(String word1, String word2) {
		
		char[] charArray1 = word1.toCharArray();
		char[] charArray2 = word1.toCharArray();
		
		int size1 = word1.length();
		int size2 = word2.length();
		
		int[][] array = new int[size1][size2];
		
		int count = 0;
		for(int i = 0; i< size1; i++) {
			
			count++;
			
			for(int j = 0; j< size2; j++) {
				
				if(charArray1[i] == charArray2[j]) {
					array[i][j] = count;
				}
				else {
					array[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i< size1; i++) {
			
			for(int j = 0; j< size2; j++) {
				
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
		
		find(charArray1, charArray2, array);
		
	}
	
	private String search(char[] chArr1, char[] chArr2, int[][] array, int i, int j) {
		
		if(i- 1>= 0 && j-1>=0 && array[i-1][j-1] < array[i][j]) {
			return search(chArr1, chArr2, array, i-1, j-1) + chArr1[i];
		}
		else {
			
			return String.valueOf(chArr1[i]);
		}
	}

	private void find(char[] chArr1, char[] chArr2, int[][] intArr) {
		
		int size1 = chArr1.length;
		int size2 = chArr2.length;
		
		String strSeq = "";
		
		for(int i = 0; i< size1; i++) {
			
			for(int j = i; j< size2; j++) {
				
				if(i!=j) {
					
					String str = search(chArr1, chArr2, intArr, i, j);
					
					if(strSeq.length() < str.length()) {
						
						strSeq = str;
					}
				}
				
			}
		}
		System.out.println(strSeq);
	}
	
	public static void main(String[] args) {
		
		Solution22 obj = new Solution22();
		
		System.out.println();
		System.out.println();
		obj.geLongestSequence("abracadabra", "abracadabra");
	}
}
