package com.creational.singleton;

import java.io.Serializable;

/**
 * This is a singleton implementation. And serialized and the deserialized objects are
 * same keeping the Singleton implementation in-tact. The readResolve function makes this happen.
 * This method ensures that the deserialized object is also same as the object returned by 
 * getInstance method.
 */
public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -8230271386020137237L;

	private SerializedSingleton() {}
	
	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}

}
