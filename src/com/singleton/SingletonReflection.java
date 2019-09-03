package com.singleton;





class SingletonReflection 
{

	//static instance variable
static SingletonReflection singleton2 ;

//private constructor
private SingletonReflection()
{
	if(singleton2!=null)
	{
		try {
		//Use it
			//throw new Exception("No other Object Created");
		// Use	
			System.exit(0);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

//static Factory Method
static SingletonReflection getInstance()
{
	if(singleton2 ==null)
	{
		 singleton2 = new  SingletonReflection();
	}
	return singleton2;
}





}