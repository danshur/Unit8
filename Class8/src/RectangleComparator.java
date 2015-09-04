

import java.util.Comparator;

public class RectangleComparator implements Comparator<GeoRectangle> {

	@Override
	public int compare(GeoRectangle o1, GeoRectangle o2) {
		double area1 = computeArea(o1);
		double area2 = computeArea(o2);
		return compareTo(area1, area2);
	}
	
	private int compareTo(double area1, double area2) {
		return (int) Math.ceil(area1 - area2);
	}
	
	private double computeArea(GeoRectangle r) {
		return r.getHeight() * r.getWidth();
	}

}
