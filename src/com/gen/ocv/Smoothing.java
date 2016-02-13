package com.gen.ocv;

import org.opencv.core.Mat;

public class Smoothing {
	
	/// Global Variables
	static int DELAY_CAPTION = 1500;
	static int DELAY_BLUR = 100;
	static int MAX_KERNEL_LENGTH = 31;

	Mat src; Mat dst;
	static String window_name = "Filter Demo 1";
	
	public static void main(String[] args){
		(new Smoothing()).test();
	}	
		
	public void test(){	
		//namedWindow( window_name, 11 );
	}
}
