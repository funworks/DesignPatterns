package com.creational.singleton;

import java.io.Serializable;

/**
 * This is a singleton implementation. However, the serialized and the deserialized objects are
 * different which defeats the purpose of Singleton Implementation.
 */
public class SerializedNotSingleton implements Serializable {

	private static final long serialVersionUID = 2786309969837359160L;
	
	private SerializedNotSingleton() {}
	
	private static class SingletonHelper {
		private static final SerializedNotSingleton instance = new SerializedNotSingleton();
	}
	
	public static SerializedNotSingleton getInstance() {
		return SingletonHelper.instance;
	}

}
