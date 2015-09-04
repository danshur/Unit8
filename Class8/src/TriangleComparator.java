

import java.util.Arrays;
import java.util.Comparator;

public class TriangleComparator implements Comparator<GeoTriangle> {
	
	public static void main(String[] args) {
		GeoTriangle t1 = new GeoTriangle(1, 1, 1.4); // area 4.9
		GeoEquilateralTriangle t2 = new GeoEquilateralTriangle(2); // area 1.7
		GeoEquilateralTriangle t3 = new GeoEquilateralTriangle(3); // area 3.9
		GeoTriangle[] triangles = {t1, t3, t2};
		
		System.out.println("before");
		printTriangles(triangles);
		Arrays.sort(triangles, new TriangleComparator());
		System.out.println("after");
		printTriangles(triangles);
	}
	
	public static void printTriangles(GeoTriangle[] triangles) {
		for (GeoTriangle t : triangles) {
			System.out.println("side1=" + t.getSide1() + ", side2=" + t.getSide2() + ", side3=" + t.getSide3());
		}
	}
	

	/**
	 * returns a negative integer, zero, or a positive integer as the first
	 * argument is less than, equal to, or greater than the second.
	 */
	public int compare(GeoTriangle o1, GeoTriangle o2) {
		double area1 = computeArea(o1);
		double area2 = computeArea(o2);
		return compareTo(area1, area2);
	}
	
	private int compareTo(double area1, double area2) {
		return (int) Math.ceil(area1 - area2);
	}
	
	private double computeArea(GeoTriangle o) {
		double hp = halfPerimeter(o);
		double area = Math.sqrt(hp * 
				(hp - o.getSide1()) * 
				(hp - o.getSide2()) * 
				(hp - o.getSide3())
		);
		return area;
	}

	private double halfPerimeter(GeoTriangle t) {
		double perimeter = t.getSide1() + t.getSide2() + t.getSide3();
		return perimeter / 2;
	}

}
