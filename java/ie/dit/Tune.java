package ie.dit;

public class Tune
{

	private int x;
	private String title;
	private String altTitle;
	private String notation;

	public String getTitle()
	{
		return title;
	}

	public String getAltTitle()
	{
		return altTitle;
	}

	public String getNotation()
	{
		return notation;
	}

	public int getX()
	{
		return x;
	}

	public void setTitle(String title, String altTitle, String notation, int x)
	{
		this.title = title;
		this.altTitle = altTitle;
		this.notation = notation;
		this.x = x;
	}

	public Tune(String title, String altTitle, String notation, int x)
	{
		setTitle(title, altTitle, notation, x);
	}


	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		for (String tune:tunes)
		{
			sb.append(tune + ", ");	
		}

		return sb.toString();

	}


}