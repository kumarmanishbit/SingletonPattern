package com.manish.soni;

public class Downloader {

	private static Downloader instance = null;

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

	protected Object readResolve() {
		return instance;
	}

	public void startDownloading() {
		System.out.println("Downloading....");
	}

}
