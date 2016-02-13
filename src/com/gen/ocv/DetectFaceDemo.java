package com.gen.ocv;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.objdetect.CascadeClassifier;

public class DetectFaceDemo {
	
	private static String FOLDER = "C:\\csp\\iTemple\\VultusLabs\\test\\";
	private static String FILE_NAME = "test3";
	private static String EXTENSION = ".jpg";
	
	@SuppressWarnings("unused")
	public void run() throws Exception {
		System.out.println("\nRunning DetectFaceDemo");

	    // Create a face detector from the cascade file in the resources
	    // directory.
	    CascadeClassifier faceDetector = new CascadeClassifier(FOLDER+"lbpcascade_frontalface.xml");
	    
	    if(faceDetector == null)
	    	throw new Exception("xml file is null");
	    
	    //Mat image = Highgui.imread(FOLDER+FILE_NAME+EXTENSION);

	    // Detect faces in the image.
	    // MatOfRect is a special container class for Rect.
	    MatOfRect faceDetections = new MatOfRect();
	    //faceDetector.detectMultiScale(image, faceDetections);

	    System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));

	    // Draw a bounding box around each face.
	    for (Rect rect : faceDetections.toArray()) {
	        //Core.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));
	    }

	    // Save the visualized detection.
	    String filename = FOLDER+FILE_NAME+"_result"+EXTENSION;
	    System.out.println(String.format("Writing %s", filename));
	    //Highgui.imwrite(filename, image);
	}
}