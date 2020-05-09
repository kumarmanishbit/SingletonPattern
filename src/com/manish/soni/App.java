package com.manish.soni;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Downloader downloader  = Downloader.getInstance();
		
		downloader.startDownloading();
		
		
		System.out.println(SingletonClass.INSTANCE.getCounter());
	}

}
