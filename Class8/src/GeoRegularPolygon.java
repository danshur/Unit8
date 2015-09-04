

/**
 *
 * @author jack
 */
public class GeoRegularPolygon extends GeoShape
{
    private double side;
    private int    numSides;
    
    public void setSide( double side )
    {
        this.side = side;
    }
    
    public double getSide()
    {
        return side;
    }
    
    public void setNumSides( int num )
    {
        numSides = num;
    }
    
    public int getNumSides()
    {
        return numSides;
    }

	public void drawShape() {
		System.out.println("Drawing a regular polygon");
	}
}