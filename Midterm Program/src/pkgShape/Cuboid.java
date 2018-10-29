package pkgShape;

import pkgShape.Rectangle;
import java.util.Comparator;

public class Cuboid extends Rectangle{
	private int iDepth;
	
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth=iDepth;
	}
	
	public int getiDepth() {
		return this.iDepth;
	}
	
	public void setiDepth(int iDepth) {
		this.iDepth=iDepth;
	}
	
	public double volume() {
		return this.getiLength()*this.getiWidth()*this.iDepth;
	}
	
	@Override
	public double area() {
		return 2*(super.getiWidth()*super.getiLength() + super.getiWidth()*iDepth + super.getiLength()*iDepth);
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException("This method is not supported for Cuboids");
	}
		
	public static class SortByArea implements Comparator<Cuboid>{		
		public int compare(Cuboid c1, Cuboid c2){
			if(c1.area()>c2.area()) {
				return 1;
			}
			else if(c1.area()<c2.area()) {
				return -1;
			}
			else {
				return 0;
			}
		
		}
	}
	
	public static class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid c1, Cuboid c2){
			if(c1.volume()>c2.volume()) {
				return 1;
			}
			else if(c1.volume()<c2.volume()) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}
}
	
