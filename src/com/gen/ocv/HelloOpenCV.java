package com.gen.ocv;

import org.opencv.core.Core;

public class HelloOpenCV {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello, OpenCV");

		// Load the native library.
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		new DetectFaceDemo().run();
	}
}
