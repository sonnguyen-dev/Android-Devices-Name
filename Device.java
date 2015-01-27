import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Device
{
	private HashMap<String, String> devices = new HashMap<>();

	public Device(InputStream stream) throws FileNotFoundException, IOException
	{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(stream));
		String line = reader.readLine();
		while (line != null)
		{
			String[] values = line.split("->");
			if (devices.get(values[0]) == null)
			{
				devices.put(values[0], values[1]);
			}
			line = reader.readLine();
		}
		reader.close();
	}

	public String getDeviceName(String deviceSlashModel)
	{
		return devices.get(deviceSlashModel);
	}
}
