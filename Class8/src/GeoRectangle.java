

public class GeoRectangle extends GeoShape {
	private double width;
	private double height;

	public GeoRectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void drawShape() {
		System.out.println("Drawing a rectangle");
	}
}