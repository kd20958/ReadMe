/**
 * 
 * @author Kevin
 * 
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class ReadMe {

	public static void main(String[] args) throws IOException {
	
		try {
			RandomAccessFile pledge = new RandomAccessFile("C:/Users/Kevin/Desktop/pledge.txt","rw");
			pledge.seek(124);
			System.out.println(pledge.readLine());
			pledge.seek(135);
			System.out.println(pledge.readLine());
			pledge.close();
		} catch (FileNotFoundException e) {
			System.out.println("Having problem opening the file.");
			
		} catch (IOException e) {
			System.out.println("Having problem accessing the file.");
		}
	}

}