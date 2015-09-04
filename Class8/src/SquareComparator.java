import java.util.Comparator;

public class SquareComparator implements Comparator<GeoSquare>{

	@Override
	public int compare(GeoSquare o1, GeoSquare o2) {
		Double area1 = o1.getHeight() * o1.getWidth();
		Double area2 = o2.getHeight() * o2.getWidth();
		return area1.compareTo(area2);
	}

}
