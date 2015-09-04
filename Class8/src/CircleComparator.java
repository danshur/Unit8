

import java.util.Comparator;

public class CircleComparator implements Comparator<GeoCircle> {
	
	@Override
	public int compare(GeoCircle o1, GeoCircle o2) {
		double area1 = computeArea(o1);
		double area2 = computeArea(o2);
		return compareTo(area1, area2);
	}
	
	private int compareTo(double area1, double area2) {
		return (int) Math.ceil(area1 - area2);
	}
	
	private double computeArea(GeoCircle r) {
		return Math.PI * Math.pow(r.getRadius(), 3);
	}

}
