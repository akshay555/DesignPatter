package com.factory;

public class OSFactory {
	
	
	public OSInterface getOS(String str)
	{
		OSInterface obj = null;
		if("OPEN".equalsIgnoreCase(str))
		{
		 obj = new Android();
		System.out.println( obj.getOSVersion("Android"));
	
		}
		else if("CLOSED".equalsIgnoreCase(str))
		{
			 obj = new IOS();
			 obj.getOSVersion("IOS");
		}
		else {
			 obj = new windows();
			 obj.getOSVersion("WINDOWS");
		}
		return obj;
		
	}

}
