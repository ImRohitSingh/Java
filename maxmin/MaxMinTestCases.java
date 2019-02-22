package maxmin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxMinTestCases 
{
	private MaxMin mmi;
	
	@Test
	public void inputTest()
	{
		assertThrows(NumberFormatException.class,()->{
			new MaxMin("rohit","singh");
		});
	}
	
	@Test
	public void inputTest2()
	{
		assertThrows(NumberFormatException.class,()->{
			new MaxMin("5","singh");
		});
	}
	
	@Test
	public void equalityTestMax()
	{
		mmi = new MaxMin("5","5");
		assertThrows(BothEqualException.class,()->{
			mmi.findMax();
		});
	}
	
	@Test
	public void equalityTestMin()
	{
		mmi = new MaxMin("5","5");
		assertThrows(BothEqualException.class,()->{
			mmi.findMin();
		});
	}

	@Test
	public void happyFlowTestMax() throws BothEqualException
	{
		mmi = new MaxMin("5","6");
		assertEquals(6,mmi.findMax());
	}
	
	@Test
	public void happyFlowTestMin() throws BothEqualException
	{
		mmi = new MaxMin("5","6");
		assertEquals(5,mmi.findMin());
	}
	
	@Test
	public void happyFlowTestMax2() throws BothEqualException
	{
		mmi = new MaxMin("-1","-2");
		assertEquals(-1,mmi.findMax());
	}
	
	@Test
	public void happyFlowTestMin2() throws BothEqualException
	{
		mmi = new MaxMin("-1","-2");
		assertEquals(-2,mmi.findMin());
	}
	
}
