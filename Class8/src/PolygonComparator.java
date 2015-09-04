

import java.util.Comparator;

public class PolygonComparator implements Comparator<GeoRegularPolygon> {

	@Override
	public int compare(GeoRegularPolygon o1, GeoRegularPolygon o2) {
		double area1 = computeArea(o1);
		double area2 = computeArea(o2);
		return compareTo(area1, area2);
	}

	private int compareTo(double area1, double area2) {
		return (int) Math.ceil(area1 - area2);
	}

	private double computeArea(GeoRegularPolygon r) {
		return Math.pow(r.getSide(), 2) * r.getNumSides() / (4 * Math.tan(180 / r.getNumSides()));
	}

}
