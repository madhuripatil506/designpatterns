package com.bridgelabz.designpattern.adapterdesignpattern;
/******************************************************************************  
 *  Purpose:Adapter design Pattern
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   20-03-2018
 ******************************************************************************/
public class AdapterPatternTest 
{
	public static void main(String[] args) 
	{
			
			testClassAdapter();
			System.out.println("==================================== ");
			testObjectAdapter();
	}

	private static void testObjectAdapter()
	{
		SocketAdapter sockAdapter = new SocketObjectAdapterImplementation();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Object Adapter="+v3.getVolts());
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
	}

	private static void testClassAdapter() 
	{
		SocketAdapter sockAdapter = new SocketClassAdapterImplementation();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Class Adapter="+v3.getVolts());
		System.out.println("v12 volts using Class Adapter="+v12.getVolts());
		System.out.println("v120 volts using Class Adapter="+v120.getVolts());
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) 
	{
		switch (i)
		{
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}
	}
}
