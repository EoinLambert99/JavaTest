package ie.dit;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();

	public void loadSongs()
	{
		BufferedReader inputStream = null;

		try
		{
			inputStream = new BufferedReader(new FileReader("songs.txt"));
            
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
	
}