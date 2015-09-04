import java.util.Comparator;


public class ShapeComparator implements Comparator<GeoShape>{

	@Override
	public int compare(GeoShape o1, GeoShape o2) {
		if (o1 instanceof GeoRectangle && o2 instanceof GeoRectangle) {
			GeoRectangle one = (GeoRectangle) o1;
			GeoRectangle two = (GeoRectangle) o2;
			Double area1 = one.getHeight() * one.getWidth();
			Double area2 = two.getHeight() * two.getWidth();
			return area1.compareTo(area2);
		} else if (o1 instanceof GeoCircle && o2 instanceof GeoCircle) {
			GeoCircle one = (GeoCircle) o1;
			GeoCircle two = (GeoCircle) o2;
			Double area1 = Math.PI * Math.pow(one.getRadius(), 3);
			Double area2 = Math.PI * Math.pow(two.getRadius(), 3);
			return area1.compareTo(area2);
		} else if (o1 instanceof GeoTriangle && o2 instanceof GeoTriangle) {
			GeoTriangle one = (GeoTriangle) o1;
			GeoTriangle two = (GeoTriangle) o2;
			Double area1 = computeTriangleArea(one);
			Double area2 = computeTriangleArea(two);
			return area1.compareTo(area2);
		} else if (o1 instanceof GeoRegularPolygon && o2 instanceof GeoRegularPolygon) {
			GeoRegularPolygon one = (GeoRegularPolygon) o1;
			GeoRegularPolygon two = (GeoRegularPolygon) o2;
			Double area1 = Math.pow(one.getSide(), 2) * one.getNumSides() / ( 4 * Math.tan(180 / one.getNumSides()));
			Double area2 = Math.pow(two.getSide(), 2) * two.getNumSides() / ( 4 * Math.tan(180 / two.getNumSides()));
			return area1.compareTo(area2);
		} else {
			// Unknown shape
			return 0;
		}
	}
		
	public Double computeTriangleArea(GeoTriangle triangle) {
		double hp = (triangle.getSide1() + triangle.getSide2() + triangle.getSide3()) / 2;
		double side1 = triangle.getSide1();
		double side2 = triangle.getSide2();
		double side3 = triangle.getSide3();
		return Math.sqrt( hp *  (hp - side1) * (hp - side2) * (hp - side3) );
	}

}
