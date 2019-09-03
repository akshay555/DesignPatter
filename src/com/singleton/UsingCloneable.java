package com.singleton;

public class UsingCloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		SingletonCloneable singleton1 = SingletonCloneable.getInstance();
		System.out.println("Clonable Instance 1:"+singleton1);
		
		SingletonCloneable singleton2 = (SingletonCloneable) singleton1.clone();
		System.out.println("Clonable Instance 2:"+singleton2);
		
		
	}

}


class SingletonCloneable implements Cloneable
{

	//static instance variable
static SingletonCloneable singleton1 ;

//private constructor
private SingletonCloneable()
{
}

//static Factory Method
static SingletonCloneable getInstance()
{
	if(singleton1 ==null)
	{
		 singleton1 = new  SingletonCloneable();
	}
	return singleton1;
}

protected Object clone() throws CloneNotSupportedException
{
	return getInstance();
}



}