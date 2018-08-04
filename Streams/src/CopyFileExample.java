import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyFileExample {
	static String sc="D:/vsc.exe";
		static	String ds="D:/vscf21.exe";
			@SuppressWarnings("resource")
			public static void main(String[] args) throws IOException {
				long startTime = System.currentTimeMillis();
				FileChannel in=null; 
				FileChannel de=null;
			try {	 in=new FileInputStream(sc).getChannel();
				 de=new FileOutputStream(ds).getChannel();
				de.transferFrom(in, 0, in.size());
			}
			finally {
				in.close();
				de.close();	
				System.out.println("Time : " + (System.currentTimeMillis() - startTime));
}
}}