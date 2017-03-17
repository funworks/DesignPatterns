package com.creational.singleton;

/**
 * Instance is created at the time of loading using a static final instance variable and static inner class
 * Pros:
 * + It is easy to create singleton this way
 * + It works well with Java versions prior to Java 5 and other approaches might fail because of some Java
 *   Memory Model (JMM) issues
 *
 * Cons:
 * - It is not thread safe.
 * - It is not a realistic way for creating singleton objects because singletons are generally used
 *   for resources such as File System, DB connections etc. and such singletons are not required to be
 *   created at load time.
 */
public class InnerStaticClassSingleton {

    private InnerStaticClassSingleton() {}

    private static class SingletonHelper {
        private static final InnerStaticClassSingleton instance = new InnerStaticClassSingleton();
    }

    public InnerStaticClassSingleton getInstance() {
        return SingletonHelper.instance;
    }
}
