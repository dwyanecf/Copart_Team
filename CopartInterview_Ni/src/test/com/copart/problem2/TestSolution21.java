package test.com.copart.problem2;

import org.junit.Test;

import code.com.copart.problem2.Solution21;

public class TestSolution21 {

	@Test
	public void test() {
		
		Solution21 obj = new Solution21();
		obj.geLongestSequence("abaabaa");
	}
	
	@Test
	public void tes1t() {
		
		Solution21 obj = new Solution21();
		obj.geLongestSequence("abracadabra");
	}
}
