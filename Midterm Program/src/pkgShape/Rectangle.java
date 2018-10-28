package pkgShape;

import pkgShape.Shape;

public class Rectangle extends Shape{
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength) {
		this.iWidth=iWidth;
		this.iLength=iLength;
	}
	
	public int getiWidth() {
		return this.iWidth;
	}
	
	public void setiWidth(int iWidth) {
		this.iWidth=iWidth;
	}
	
	public int getiLength() {
		return this.iLength;
	}
	
	public void setiLength(int iLength) {
		this.iLength=iLength;
	}
	
	public double area() {
		return this.iWidth*this.iLength;
	}
	
	public double perimeter() {
		return 2*this.iWidth + 2*this.iLength;
	}
	
	public int compareTo(Rectangle r2){
	    if(this.area()>r2.area()) {
	    	return 1;
	    }
	    else if(this.area()<r2.area()) {
	    	return -1;
	    }
	    else {
	    	return 0;
	    }
	}
	
}
