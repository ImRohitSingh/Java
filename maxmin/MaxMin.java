package maxmin;

public class MaxMin 
{
	int x;
	int y;
	MaxMin(String a,String b) throws NumberFormatException
	{
		x = Integer.parseInt(a);
		y = Integer.parseInt(b);
	}
	
	public int findMax() throws BothEqualException
	{
		if( x== y)
			throw new BothEqualException("Please enter unequal values : ");
		
		if( x > y )
			return x;
		else
			return y;
	}
	
	public int findMin() throws BothEqualException
	{
		if( x== y)
			throw new BothEqualException("Please enter unequal values : ");
		
		if( x < y )
			return x;
		else
			return y;
	}
}
