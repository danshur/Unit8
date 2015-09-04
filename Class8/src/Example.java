import java.util.Arrays;


public class Example {
	
	public static void main(String[] args) {
		GeoRectangle one = new GeoRectangle(10, 10);
		GeoRectangle two = new GeoRectangle(100, 100);
		GeoRectangle[] array = {two, one};
		
		ShapeComparator comparator = new ShapeComparator();
		Arrays.sort(array, comparator);
		
		for (GeoRectangle shape : array) {
			System.out.println(shape.getHeight());
		}
	}

}
