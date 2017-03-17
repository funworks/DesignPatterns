package com.creational.singleton;

/**
 * Instance is created at the time of loading using a static final instance variable
 * Pros:
 * + It is easy to create singleton this way
 * 
 * Cons:
 * - It is not thread safe.
 * - It is not a realistic way for creating singleton objects because singletons are generally used
 *   for resources such as File System, DB connections etc. and such singletons are not required to be
 *   created at load time.
 * - It does not provide for any opportunity to handle exceptions that might get thrown at the time of
 *   instance creation.
 */
public class InitalizedOnLoadSingleton {
	
	private static final InitalizedOnLoadSingleton instance = new InitalizedOnLoadSingleton();
	
	private InitalizedOnLoadSingleton() {}
	
	public static InitalizedOnLoadSingleton getInstance() {
		return instance;
	}

}
