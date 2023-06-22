package atm;

public class FileManager {

	private File file;
	private FileWriter fileWriter;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	
	private FileManager() {}
	private static FileManager instance = new FileManager();
	public static FileManager getInstace() {
		return instance;
	}
}
