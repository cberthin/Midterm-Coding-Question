package pkgShapeTest;

import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


import pkgShape.Cuboid;
import pkgShape.Rectangle;

public class TestShapes {
	
	@Test
	public void Rectangle_test1() {
		Rectangle r1 = new Rectangle(3,2);
	}
	
	@Test
	public void getiWidth_test1() {
		Rectangle r1 = new Rectangle(3,2);
		assert(3==r1.getiWidth());
	}
	
	@Test
	public void getiLength_test1() {
		Rectangle r1 = new Rectangle(3,2);
		assert(2==r1.getiLength());
	}
	
	@Test
	public void setiWidth_test1() {
		Rectangle r1 = new Rectangle(3,2);
		r1.setiWidth(10);
		assert(10==r1.getiWidth());
	}
	
	@Test
	public void setiLength_test1() {
		Rectangle r1 = new Rectangle(3,2);
		r1.setiLength(4);
		assert(4==r1.getiLength());
	}
	
	@Test
	public void area_test1() {
		Rectangle r1 = new Rectangle(3,2);
		assert(6==r1.area());
	}
	
	@Test
	public void perimeter_test1() {
		Rectangle r1 = new Rectangle(3,2);
		assert(10==r1.perimeter());
	}
	
	@Test
	public void compareTo_test1() {
		Rectangle r1 = new Rectangle(3,2);
		Rectangle r2= new Rectangle(5,8);
		assert(-1==r1.compareTo(r2));
	}
	
	@Test
	public void Cuboid_test1() {
		Cuboid c1= new Cuboid(1,2,3);
	}
	
	@Test
	public void getiWidth_test2() {
		Cuboid c1= new Cuboid(1,2,3);
		assert(1==c1.getiWidth());
	}
	
	@Test
	public void getiLength_test2() {
		Cuboid c1= new Cuboid(1,2,3);
		assert(2==c1.getiLength());
	}
	
	@Test
	public void setiWidth_test2() {
		Cuboid c1= new Cuboid(1,2,3);
		c1.setiWidth(10);
		assert(10==c1.getiWidth());
	}
	
	@Test
	public void setiLength_test2() {
		Cuboid c1= new Cuboid(1,2,3);
		c1.setiLength(4);
		assert(4==c1.getiLength());
	}
	
	@Test
	public void getiDepth_test1() {
		Cuboid c1= new Cuboid(1,2,3);
		assert(3==c1.getiDepth());
	}
	
	@Test
	public void setiDepth_test1() {
		Cuboid c1= new Cuboid(1,2,3);
		c1.setiDepth(6);
		assert(6==c1.getiDepth());
	}
	
	@Test
	public void area_test2() {
		Cuboid c1= new Cuboid(1,2,3);
		assert(22==c1.area());
	}
	
	@Test
	public void volume_test2() {
		Cuboid c1= new Cuboid(1,2,3);
		assert(6==c1.volume());
	}
	
	@Test (expected = UnsupportedOperationException.class)
	public void perimeter_test2() {
		Cuboid c1= new Cuboid(1,2,3);
		c1.perimeter();
	}
	
	@Test
	public void sortByArea_test1() {
		Cuboid c1= new Cuboid(1,2,3); //22
		System.out.println(c1.area());
		Cuboid c2= new Cuboid(1,1,1); //6
		System.out.println(c2.area());
		Cuboid c3= new Cuboid(2,2,3); //32
		System.out.println(c3.area());
		
		ArrayList<Cuboid> cuboids = new ArrayList<Cuboid>();
		cuboids.add(c1);
		cuboids.add(c2);
		cuboids.add(c3);
		
		Collections.sort(cuboids, new Cuboid.SortByArea());
		for(int i=0; i<cuboids.size();i++) {
			System.out.println(cuboids.get(i).area());
		}
		
		assert(cuboids.get(0).area()==6);
		assert(cuboids.get(1).area()==22);
		assert(cuboids.get(2).area()==32);
	}
		
	@Test
	public void sortByVolume_test1() {
		System.out.println(
				);
		Cuboid c1= new Cuboid(1,2,3); //6
		System.out.println(c1.volume());
		Cuboid c2= new Cuboid(1,1,1); //1
		System.out.println(c2.volume());
		Cuboid c3= new Cuboid(2,2,3); //12
		System.out.println(c3.volume());
			
		ArrayList<Cuboid> cuboids = new ArrayList<Cuboid>();
		cuboids.add(c1);
		cuboids.add(c2);
		cuboids.add(c3);
			
		Collections.sort(cuboids, new Cuboid.SortByVolume());
		for(int i=0; i<cuboids.size();i++) {
			System.out.println(cuboids.get(i).volume());
		}		
		
		assert(cuboids.get(0).volume()==1);
		assert(cuboids.get(1).volume()==6);
		assert(cuboids.get(2).volume()==12);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
