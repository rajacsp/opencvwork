package com.gen.ocv;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

public class App {

	static {		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		System.out.println("inside static");
	}
	
	public static void main(String[] args) {
		String filePath = "test3.jpg";
		
		Mat newImage = Imgcodecs.imread(filePath);
		
		if(newImage.dataAddr() == 0){
			System.out.println("Couldn't open file "+filePath);
		}else{
			LocalImageViewer imageViewer = new LocalImageViewer();
			imageViewer.show(newImage, "Loaded Image");
		}
	}
}
