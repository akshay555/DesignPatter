package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UsingSerializable {

	public static void main(String[] args) {
		Singleton singleObj = Singleton.getInstance();
		System.out.println("1 st obj  :"+Singleton.getInstance());
		
		
		ObjectOutputStream object;
		try {
			object = new ObjectOutputStream(new FileOutputStream("object.ser"));
			object.writeObject(singleObj);
			object.close();
			
			ObjectInputStream onjectInput = new ObjectInputStream(new FileInputStream("object.ser"));
			Singleton singleObj2 =	(Singleton) onjectInput.readObject();
			onjectInput.close();
			
			System.out.println("2 nd obj  :"+singleObj2);
		} catch (IOException | ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}

}

/* Lazy Initialization of Singleton

Implementing the  Serializable we can break the Singleton .
*/
class Singleton implements Serializable{
	
	static Singleton singleton ;
	
	private Singleton()
	{
		
	}
	
	// readResolve is used for replacing the object read from the stream. The only use I've ever seen for this is enforcing singletons; when an object is read, replace it with the singleton instance. This ensures that nobody can create another instance by serializing and deserializing the singleton
private	Object readResolve()
	{
		return singleton;
		
	}
	static Singleton getInstance()
	{
		if(singleton==null)
		{
			singleton = new Singleton();
		}
		return singleton;
		
	}
}