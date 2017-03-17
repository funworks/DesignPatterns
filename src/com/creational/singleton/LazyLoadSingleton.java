package com.creational.singleton;

/**
 * Instance is created when it is required by calling the public getInstance method
 * 
 * Pros:
 * + It is easy to create singleton this way
 * + It does not overload the initialization by creating singleton at load time
 * 
 * Cons:
 * - It is not thread safe.
 */
public class LazyLoadSingleton {
	
	private static LazyLoadSingleton instance;
	
	private LazyLoadSingleton() {}
	
	public static LazyLoadSingleton getInstance() {
		if (instance == null) {
			try {
				instance = new LazyLoadSingleton();
			} catch (Exception e) {
				//Handle Exception
			}
		}
		return instance;
	}

}
