package maxmin;

public class GenerateMaxMin 
{
	public static void main(String[] args) throws NumberFormatException, BothEqualException
	{
		String x = "-1";
		String y = "-2";
		
		MaxMin mm = new MaxMin(x,y);
		System.out.println(mm.findMax());
		System.out.println(mm.findMin());
	}

}
