package MinMaxPackage;

import static org.junit.Assert.*;
import org.junit.Test;
import MinMaxPackage.EmptyNumberException;
import MinMaxPackage.MinMax;

public class MinMaxTestCajaBlanca {
	private int[] xs;	
	@Test
	public void statementCoverage(){
		xs =new int[] {0,1,2,3,4,5,6};
		MinMax.minMax(xs);
	}
	@Test(expected = EmptyNumberException.class)
	public void decisionCoverage(){
		xs =new int[] {0,1,2,3,4,5,6};
		MinMax.minMax(xs);
		xs =null;
		MinMax.minMax(xs);		
	}	
	@Test(expected = EmptyNumberException.class)
	public void conditionCoverage(){
		xs =new int[] {0,1};
		MinMax.minMax(xs);
		xs = null;
		MinMax.minMax(xs);
	}	
	@Test(expected = EmptyNumberException.class)
	public void decisionConditionCoverage(){
		decisionCoverage();
		conditionCoverage();
	}
}
