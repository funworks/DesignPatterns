package com.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * This Main class shows how to make Serialization work with Singleton implementation
 */
public class SerializedSingletonMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializedNotSingleton instance1 = SerializedNotSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.obj"));
		out.writeObject(instance1);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("file.obj"));
		SerializedNotSingleton instance2 = (SerializedNotSingleton) in.readObject();
		in.close();
		
		System.out.println("Singleton does not work in this case...");
		System.out.println("Not Singleton Instance 1 hash code: " + instance1.hashCode());
		System.out.println("Not Singleton Instance 2 hash code: " + instance2.hashCode());
		
		SerializedSingleton instance3 = SerializedSingleton.getInstance();
		ObjectOutput out2 = new ObjectOutputStream(new FileOutputStream("file2.obj"));
		out2.writeObject(instance3);
		out2.close();
		
		ObjectInput in2 = new ObjectInputStream(new FileInputStream("file2.obj"));
		SerializedSingleton instance4 = (SerializedSingleton) in2.readObject();
		in2.close();
		
		System.out.println("\n\nSingleton works in this case...");
		System.out.println("Singleton Instance 3 hash code: " + instance3.hashCode());
		System.out.println("Singleton Instance 4 hash code: " + instance4.hashCode());
	}

}
