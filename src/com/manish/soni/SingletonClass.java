package com.manish.soni;

/**
 * 
 * 
 * 
 * @author kumam8
 *
 *
 *         In order to serialize the singleton classes created from factory
 *         pattern , we must implement those classes with a Serializable
 *         interface. But doing that is not enough. When deserializing a class,
 *         new instances are created. Now it doesn't matter the constructor is
 *         private or not. Now there can be more than one instance of the same
 *         singleton class inside the JVM, violating the singleton property.
 * 
 *         This problem can be solved using enum approach.
 * 
 */
public enum SingletonClass {

	INSTANCE;

	private int counter;

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getCounter() {
		return this.counter;
	}
}
