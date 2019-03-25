package draw;

public class Triangle 
{
	private String type;
	private int height;
	
	Triangle(String type){
		this.type =  type;
	}
	
	Triangle(int height){
		this.height =  height;
	}
	
	Triangle(String type,int height){
		this.type =  type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}
	public int getHeight() {
		return height;
	}
	
	public void draw()
	{
		System.out.println(getType()+" Triangle drawn successfully of height "+getHeight()+".");
	}
	
}
