package MinMaxPackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import MinMaxPackage.EmptyNumberException;
import MinMaxPackage.MinMax;
public class MinMaxTestCajaNegra {
	private int[] xs;
	@Before
	public void inicio(){
		xs =new int[] {0};
	}
	@Test
	public void comprobarTamano() {
		xs = MinMax.minMax(xs);
		int tam = xs.length;
		assertEquals(2,tam,1e-15);
	}
	
	@Test
	public void comprobarResultadoIgualACero(){
		xs = MinMax.minMax(xs);
		assertEquals(0,xs[0],1e-15);
		assertEquals(0,xs[1],1e-15);
	}
	@Test
	public void resultadoDistintoCero(){
		xs =new int[] {1};
		xs = MinMax.minMax(xs);
		assertEquals(1,xs[0],1e-15);
		assertEquals(1,xs[1],1e-15);
	}	
	@Test
	public void MenorMayor(){
		xs =new int[] {0,1};
		xs = MinMax.minMax(xs);
		assertEquals(0,xs[0],1e-15);
		assertEquals(1,xs[1],1e-15);
		assertEquals(2,xs.length,1e-15);
	}
	@Test
	public void MayorMenor(){
		xs =new int[] {1,0};
		xs = MinMax.minMax(xs);
		assertEquals(0,xs[0],1e-15);
		assertEquals(1,xs[1],1e-15);
	}	
	@Test
	public void DosValoresOMas(){
		xs =new int[] {1,0,2};
		xs = MinMax.minMax(xs);
		assertEquals(0,xs[0],1e-15);
		assertEquals(2,xs[1],1e-15);
		assertEquals(2,xs.length,1e-15);
	}
	@Test(expected = EmptyNumberException.class)
	public void ErrorListaVacia(){
		MinMax.minMax(null);
	}
	@Rule
	public ExpectedException e = ExpectedException.none();
	
	@Test
	public void MensajeListaVacia(){
		e.expect(EmptyNumberException.class);
		e.expectMessage("No se admite número negativo");
		xs = null;
		MinMax.minMax(xs);
	}
}
