package com.creational.singleton;

/**
 * Instance is created when it is required by calling the public synchronized getInstance method
 *
 * Pros:
 * + It is easy to create singleton this way
 * + It does not overload the initialization by creating singleton at load time
 * + It is Thread Safe because the getInstance method is synchronized
 *
 * Cons:
 * - It is not an efficient way. The complete getInstance method is synchronized which means
 *   even after the instance is created, multiple threads operating upon this method need to wait
 *   in line to get the instance
 */
public class ThreadSafeLazyLoadSingleton {

    private static ThreadSafeLazyLoadSingleton instance;

    private ThreadSafeLazyLoadSingleton() {}

    public static synchronized ThreadSafeLazyLoadSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoadSingleton();
        }
        return instance;
    }
}
