package com.creational.singleton;

/**
 * Instance is created when it is required by calling the public synchronized getInstance method
 *
 * Pros:
 * + It does not overload the initialization by creating singleton at load time
 * + It is Thread Safe
 * + It is an efficient way. It uses double-checked-locking (DCL) pattern so threads don't have to wait
 *   to get instance if the instance is already created
 *
 * Cons:
 * - It is not fool prood and guaranteed to work. For more information, read this
 *   http://www.javaworld.com/article/2074979/java-concurrency/double-checked-locking--clever--but-broken.html
 * - There is no way to fix DCL. So the best approach is either to use synchronization on getInstance method
 *   or to use eager loading or initializing instance on load method.
 */
public class DoubleCheckedLockingSingleton {
    private static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {}

    public DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
