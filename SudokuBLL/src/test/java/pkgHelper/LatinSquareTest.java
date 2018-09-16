package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() {
		
		int [] arr = {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
	}

	@Test
	public void hasDuplicates_test2() {
		
		int [] arr = {1,1,3,4,5};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
		
	}
	@Test
	public void hasDuplicates_test3() {
		
		int [] arr = {1,3,4,5,1};
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test4() {
		
		int [] arr = null;
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasDuplicates(arr));
		
	}

	@Test
	public void doesElementExist_Test1() {
		int [] arr = {1,2,3,4,5};
		int iValue = 3;
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.doesElementExist(arr, iValue));
		
	}
	
	@Test
	public void doesElementExist_Test2() {
		int [] arr = {1,2,3,4,5};
		int iValue = 99;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
		
	}
	
	@Test
	public void doesElementExist_test3() {
		
		int [] arr = null;
		int iValue = 1;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.doesElementExist(arr, iValue));
		
	}
	
	@Test
	public void hasAllValues_Test1() {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {3,5,4,2,1};
		
		LatinSquare lq = new LatinSquare();
		
		assertTrue(lq.hasAllValues(arr1, arr2));

	}
	
	@Test
	public void hasAllValues_Test2() {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = null;
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));

	}
	
	@Test
	public void hasAllValues_Test3() {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,3};
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));

	}
	
	@Test
	public void hasAllValues_Test4() {
		int [] arr1 = null;
		int [] arr2 = {1,2,3,4,5};
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));

	}
	
	@Test
	public void hasAllValues_Test5() {
		int [] arr1 = {1,2,3,4,5};
		int [] arr2 = {1,2,2,3,3};
		
		LatinSquare lq = new LatinSquare();
		
		assertFalse(lq.hasAllValues(arr1, arr2));

	}

}






