package com.mycompany.sp;

public class ImageProxy extends AbstractElement {
	private String fileName;
	private Image realImage = null;
	
	ImageProxy(String fileName, Image realImage) {
		this.fileName = fileName;
		this.realImage = realImage;
	}
	
	public void print() {
		if (realImage == null) {
			realImage = new Image(fileName);
		}
		realImage.print();
	}

}
