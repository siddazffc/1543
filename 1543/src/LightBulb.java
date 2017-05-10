
public class LightBulb {

	int watts;
	String type;
	String color;

	
	public LightBulb(int watts, String color, String type) {
		// TODO Auto-generated constructor stub
		this.watts=watts;
		this.color=color;
		this.type=type;
		
	}
	
	int getWattage()
	{
		return watts;
	}
	
	String getColor()
	{
		return color;
	}
	
	String getType()
	{
		return type;
	}
	
}
