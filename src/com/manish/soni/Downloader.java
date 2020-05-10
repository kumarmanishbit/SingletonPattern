package com.manish.soni;

/**
 * 
 * @author kumam8
 *
 */
public class Downloader {

	private static Downloader instance = null;

	/*
	 * 
	 * Note :- using reflection can make this public. Constructor constructor =
	 * singleton.getClass().getDeclaredConstructor(new Class[0]);
	 * constructor.setAccessible(true);
	 */
	private Downloader() {

	}

	public static Downloader getInstance() {

		if (instance == null) {

			/*
			 * synchronized block to remove overhead. This is class level lock Every class
			 * in java has a unique lock which is nothing but class level lock. If a thread
			 * wants to execute a static synchronized method, then thread requires class
			 * level lock. Once a thread got the class level lock, then it is allowed to
			 * execute any static synchronized method of that class. Once method execution
			 * completes automatically thread releases the lock
			 */
			synchronized (Downloader.class) {
				instance = new Downloader();
			}

		}

		return instance;

	}

	/**
	 * 
	 * 
	 * @return Here, singleton and singleton2 are two different instances having two
	 *         different values as their field variables. This violates the
	 *         singleton property. The solution is that we have to implement the
	 *         readResolve method, which is called when preparing the deserialized
	 *         object before returning it to the caller.
	 */

	protected Object readResolve() {
		return instance;
	}

	public void startDownloading() {
		System.out.println("Downloading....");
	}

}
