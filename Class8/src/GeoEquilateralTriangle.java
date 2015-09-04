

public class GeoEquilateralTriangle extends GeoTriangle {
	public GeoEquilateralTriangle(double side) {
		super(side, side, side);
	}

	public double getSide() {
		return getSide1();
	}

	public void setSide(double side) {
		setSide1(side);
		setSide2(side);
		setSide3(side);
	}
}