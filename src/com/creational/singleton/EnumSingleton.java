package com.creational.singleton;

/**
 * Instance is created by use of Enum
 *
 * Pros:
 * + It is the simplest way.
 * + It is the default behavior of Enum that Java ensures every enum gets created only once.
 * + It is Thread Safe 
 * 
 * Cons:
 * - Though it is Thread Safe but any methods that you add to this enum will not be thread safe, so 
 *   synchronization will be required
 * - It is not flexible in a way that it does not provide any facility for lazy initialization  
 */
public enum EnumSingleton {	
	INSTANCE;
}
