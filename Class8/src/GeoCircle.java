

/**
 *
 * @author jack
 */
public class GeoCircle extends GeoShape
{
    private double radius;

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

	public void drawShape() {
		System.out.println("Drawing a circle");
	}
}