package MinMaxPackage;

import static org.junit.Assert.*;
import org.junit.Test;
import MinMaxPackage.EmptyNumberException;
import MinMaxPackage.MinMax;

public class MinMaxCiclomatica {
	private int[] xs;
	@Test
	public void wayOne(){
		xs =new int[] {1,2};
		MinMax.minMax(xs);
	}	
	@Test(expected = EmptyNumberException.class)
	public void wayTwo(){
		xs = null;
		MinMax.minMax(xs);
	}	
	@Test
	public void wayThree(){
		xs =new int[] {1};
		MinMax.minMax(xs);
	}
	@Test
	public void wayFour(){
		xs =new int[] {1,2,3};
		MinMax.minMax(xs);
	}
}
