package com.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UsingReflection {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException {
		SingletonReflection singletonreflection = SingletonReflection.getInstance();
		System.out.println("Instance :" + singletonreflection);

		Constructor constructor = SingletonReflection.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		SingletonReflection singletonReflection1 = (SingletonReflection) constructor.newInstance();
		
		System.out.println("Value of :"+singletonReflection1);
		
		//System.out.println("Instance 2 nd :" + singletonreflection1);
	}

}
