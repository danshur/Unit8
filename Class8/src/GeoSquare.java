

public class GeoSquare extends GeoRectangle {
	public GeoSquare(double side) {
		super(side, side);
	}

	public void setSide(double side) {
		setWidth(side);
		setHeight(side);
	}

	public double getSide() {
		return getWidth();
	}
}