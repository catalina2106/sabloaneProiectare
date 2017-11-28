package com.mycompany.sp;

public class Image extends AbstractElement {
	private String fileName;
	
	Image(String fileName) {
		this.fileName = fileName;
	}

	public void print() {
		System.out.print(fileName);
	}

}
