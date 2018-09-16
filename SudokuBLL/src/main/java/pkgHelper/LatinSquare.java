package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare()
	{
		
	}
	
	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}
	
	public int[][] getLatinSquare() {
		return LatinSquare;
	}
	
	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	public boolean hasDuplicates(int [] arr)
	{
		boolean hasDuplicates = false;
		
		if (arr == null) {
			return false;
		}	
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1]) 
			{
				hasDuplicates = true;
				break;
			}			
			
		}
		
		return hasDuplicates;
	}
	
	public boolean doesElementExist(int[] arr, int iValue)
	{
		boolean doesElementExist = false;
		
		if (arr == null)
			return false;
		
		for (int i: arr)
		{
			if (i==iValue)
			{
				doesElementExist = true;
				break;
			}
		}
		
		return doesElementExist;
	}
	
	public boolean hasAllValues(int[] arr1, int[] arr2)
	{
		boolean hasAllValues = false;
		
		if (arr1 == null)
			return false;
		
		if (arr2 == null)
			return false;
		
		if (arr1.length != arr2.length)
			return false;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		hasAllValues = true;
		return hasAllValues;
	}
	
	public int[] getRow(int iRow) {
		int[] getRow = new int[LatinSquare.length];
		if (iRow > LatinSquare.length)
			return null;
		if (iRow < LatinSquare.length)
			return null;
		for (int i = 0; i < getRow.length; i++) {
			
			getRow[i] = LatinSquare[i][iRow];
			
		}
		return getRow;
	}
	
}







