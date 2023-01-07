package dispatcher;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Program {

	public static void main(String[] args) {
		Dispatcher dispatcher = new Dispatcher();
		try {
			//txt dosyasından veriler alınır.
			BufferedReader reader = new BufferedReader(new FileReader("giriş.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
			String[] values = line.split(", ");
			int arrival = Integer.parseInt(values[0]);
			int priority = Integer.parseInt(values[1]);
			int burst = Integer.parseInt(values[2]);
			//alınan veriler ile bir proses sıraya eklenir.
			dispatcher.addProcess(new Process(arrival, priority, burst));
			
			}
			reader.close();
			dispatcher.run();
			} catch (IOException e) {
			e.printStackTrace();
			}

	}

}
