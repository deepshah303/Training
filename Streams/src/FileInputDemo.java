import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputDemo {

	public static void main(String[] args) throws Exception {
		String file = "C:/Song/song.txt";
		FileInputStream istream = new FileInputStream(file);
		// Array of the size of available bytes in stream
		byte[] bar = new byte[istream.available()];
		istream.read(bar); // reading stream data into byte array
		String content = new String(bar); // converting byte array to string
		System.out.println(content);

		// int ch = 0;
		// while (true) {
		// ch = istream.read(); // reading a byte from the stream
		// if (ch == -1) // EOF break the loop
		// break; // printing character
		//
		// System.out.print((char) ch);
		// }
		//
		istream.close();
	}

}
