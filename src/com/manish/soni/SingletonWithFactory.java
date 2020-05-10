package com.manish.soni;

/**
 * 
 * @author kumam8
 *
 *         Static fields are initialized at class loading time. Therefore, in
 *         this method, singleton instances are created even in a case
 *         we don't use them at runtime. This is not a problem as long as the
 *         singleton object is not too big and creating the instance is not too
 *         expensive.
 */
public class SingletonWithFactory {

	// eager way to create singleton.
	private static SingletonWithFactory instance = new SingletonWithFactory();

	private SingletonWithFactory() {

	}

	public SingletonWithFactory getInstance() {
		return instance;
	}

}
