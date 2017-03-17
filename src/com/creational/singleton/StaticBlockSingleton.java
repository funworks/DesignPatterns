package com.creational.singleton;

/**
 * Instance is created at the time of loading using a static block. 
 * Pros:
 * + It is easy to create singleton this way
 * 
 * Cons:
 * - It is not thread safe.
 * - It is not a realistic way for creating singleton objects because singletons are generally used
 *   for resources such as File System, DB connections etc. and such singletons are not required to be
 *   created at load time.
 */
public class StaticBlockSingleton {
	
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			//Handle Exception
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}

}
