package code.com.copart.problem4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution4 {
	
	/**
	 * PART 0
	 * Reads the file from the FilePath 
	 * and store that into a List of double values
	 * @param strFile
	 * @return
	 */
	public List<Double> readFile(String strFile) {
		
		
		List<Double> lstValues = null;
		
		File objFile = new File(strFile);
		
		if(objFile == null || !objFile.exists()) {
			
			System.out.println("File does not exists. Please try with another file");
			return null;
		}
		
		BufferedReader bufferedReader = null;
		
		try {
			
			bufferedReader = new BufferedReader(new FileReader(strFile));
			
			String strLine = null;
			lstValues = new ArrayList<>();
			
			while((strLine = bufferedReader.readLine()) != null) {
				
				double dblLine = Double.parseDouble(strLine);
				lstValues.add(dblLine);
			}
		}
		catch(IOException e) {
			
			System.out.println("IOException in reading the file");
			//e.printStackTrace();
		}
		catch(Exception e) {
			
			System.out.println("Exception in reading the file");
			//e.printStackTrace();
		}
		finally {
			
			if(bufferedReader != null) {
				try {
					
					bufferedReader.close();
				} 
				catch (IOException e) {
					
					System.out.println("IOException in closing the bufferedReader");
					//e.printStackTrace();
				}
				
				bufferedReader = null;
			}
		}
		return lstValues;
		
	}
	
	/**
	 * PART 0
	 * Prints the list of Values 
	 * @param dblLstValues
	 */
	public void printFile(List<Double> dblLstValues) {
		
		if(dblLstValues == null) {
		
			return;
		}
		
		for(double value : dblLstValues) {
			System.out.println(value);
		}
	}
	
	/**
	 * PART 1
	 * Plot the data based on the values
	 * with Math.floor function - to round the values
	 * @param dblLstValues
	 */
	public void plotData(List<Double> dblLstValues) {
		
		if(dblLstValues == null) {
			
			return;
		}
		
		for(double dblValue : dblLstValues) {
			
			int intValue = (int) Math.floor(dblValue);
			
			plot(intValue);
		}
	}

	/**
	 * PART 1
	 * To print the number of stars
	 * @param intValue
	 */
	private void plot(int intValue) {
		
		for(int index = 1; index <= intValue; index++) {
			
			System.out.print("* ");
		}
		System.out.println();
	}

	
	/**
	 * PART 2
	 * Reads the double array to detect the pattern in the values
	 * @param dblStockPrice
	 * @return
	 */
	private Map<Integer, String> getPattern(Double[] dblStockPrice) {
		
		Map<Integer, String> mapPatterType = new HashMap<>();
		
		mapPatterType.put(0, "");
		mapPatterType.put(1, "");
		mapPatterType.put(2, "");
		
		for(int index = 0; index+3 < dblStockPrice.length; index++) {
			
			double a = dblStockPrice[index];
			double b = dblStockPrice[index+1];
			double c = dblStockPrice[index+2];
			double d = dblStockPrice[index+3];
			
			if(a>b && b>c && c<d) {
				mapPatterType.put(index+3, "buy");
			}
			else if(a<b && b<c && c>d) {
				mapPatterType.put(index+3, "sell");
			}
			else {
				mapPatterType.put(index+3, "");
			}
		}
		return mapPatterType;
	}
	
	/**
	 * To print the pattern received as an output from the method getPattern()
	 * 
	 * @param lstDblValues
	 */
	public void printPattern(List<Double> lstDblValues) {
		
		if(lstDblValues == null) {
			
			return;
		}
		Double[] dblStockPrice = lstDblValues.toArray(new Double[lstDblValues.size()]);
		Map<Integer, String> mapPatterType = getPattern(dblStockPrice);
		
		for(int index = 0; index+3 < dblStockPrice.length; index++) {
			
			System.out.println((index+1) + "\t" + dblStockPrice[index] + "\t" + mapPatterType.get(index));
		}
		
	}
	
	/**
	 * Prints the execution time from subtracting the end time with the start time
	 * @param dtStart
	 * @param dtEnd
	 */
	private void printExecutionTime(Date dtStart, Date dtEnd) {
		
		System.out.println();
		System.out.println("Execution Time : " + (Math.abs(dtEnd.getTime() - dtStart.getTime())) + " ms");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		String fileNameWithPath = "/Users/nxkundu/eclipse-workspace/CopartInterview/resources/stock.txt";
		
		Date dtStart = null;
		Date dtEnd = null;
		
		Solution4 objMain = new Solution4();
		/**
		 * PART 0 : To read and Print the file
		 */
		System.out.println();
		System.out.println("PART 0 : To read and Print the file");
		System.out.println();
		
		dtStart = new Date();
		
		List<Double> lstDblValues = objMain.readFile(fileNameWithPath);
		objMain.printFile(lstDblValues);
		
		dtEnd = new Date();
		objMain.printExecutionTime(dtStart, dtEnd);
		
		
		/**
		 * PART 1 : To Get The Plot and Print the Plot
		 */
		System.out.println();
		System.out.println("PART 1 : To Get The Plot and Print the Plot");
		System.out.println();
		
		dtStart = new Date(); 
		
		objMain.plotData(lstDblValues);
		
		dtEnd = new Date();
		objMain.printExecutionTime(dtStart, dtEnd);
		
		/**
		 * PART 2: To Get The Pattern and Print the Pattern
		 */
		
		System.out.println();
		System.out.println("PART 2: To Get The Pattern and Print the Pattern");
		System.out.println();
		
		dtStart = new Date(); 
		
		objMain.printPattern(lstDblValues);
		
		dtEnd = new Date();
		objMain.printExecutionTime(dtStart, dtEnd);
	}
	
}
