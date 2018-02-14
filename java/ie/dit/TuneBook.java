package ie.dit;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();

	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		for(String tune:tunes)
		{
			sb.append(tune + ", ");
		}

		return sb.toString();

	}
/*
	public void out()
	{
		System.out.println();
	}*/

	public void loadSongs()
	{
		BufferedReader inputStream = null;

		try
		{
			inputStream = new BufferedReader(new FileReader("hnj0.abc.txt"));
            
            String l;
            while ((l = inputStream.readLine()) != null)
            {
                tunes.add(l);
            }
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(inputStream != null)
			{
				try
				{
					inputStream.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
		}
	}

	//Trying to retunr first matching tune from array list that contains parameter title in title of tune
	/*public Tune findTune(String title)
	{

		if(title == tunes)
		{
			return title;
		}
		else 
		{
			count++;
		}

	}
	*/
	

	public static void main(String[] args)
	{
		/*System.out.println(tunes + ", ");
		
		TuneBook tb = new TuneBook("hnj0.abc");
		System.out.println(tb);
		*/
	}


}