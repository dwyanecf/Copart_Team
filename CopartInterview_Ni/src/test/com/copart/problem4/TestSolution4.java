package test.com.copart.problem4;

import java.util.List;

import org.junit.Test;

import code.com.copart.problem4.Solution4;

public class TestSolution4 {

	@Test
	public void getPattern() {
		
		Solution4 objSolution4 = new Solution4();
		
		List<Double> lstDblValues = objSolution4.readFile("/Users/nxkundu/eclipse-workspace/CopartInterview/resources/stock.txt");
		
		objSolution4.printPattern(lstDblValues);
		
		
	}
	
	@Test
	public void readWriteFile1() {
		
		Solution4 objSolution4 = new Solution4();
		List<Double> lstDblValues = objSolution4.readFile("");
		
		objSolution4.printFile(lstDblValues);
		
		
	}
	
	@Test
	public void readWriteFile2() {
		
		Solution4 objSolution4 = new Solution4();
		List<Double> lstDblValues = objSolution4.readFile("/Users/nxkundu/eclipse-workspace/CopartInterview/resources/stock.txt");
		
		objSolution4.printFile(lstDblValues);
		
		
	}
	
	@Test
	public void plotData() {
		
		Solution4 objSolution4 = new Solution4();
		List<Double> lstDblValues = objSolution4.readFile("/Users/nxkundu/eclipse-workspace/CopartInterview/resources/stock.txt");
		
		objSolution4.plotData(lstDblValues);
		
		
	}
}
