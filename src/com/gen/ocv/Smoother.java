package com.gen.ocv;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;

public class Smoother {
	
	private static final String ROOT_FOLDER = "C";		
	public static final String IMG_FOLDER = ROOT_FOLDER+":\\csp\\iTemple\\VultusLabs\\test\\";
	
    public static void smooth(String filename) { 
        IplImage image = cvLoadImage(filename);
    
        cvSmooth(image, image);
        cvSaveImage(filename, image);
        cvReleaseImage(image);
    
        System.out.println("test");
    }
    
    public static void main(String[] args){
    	smooth(IMG_FOLDER+"v3.jpg");
    }
}