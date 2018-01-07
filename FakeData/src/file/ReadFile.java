package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile {
	private File file;
	/**
	 * 
	 * @param path
	 * @return 
	 * @throws IOException
	 */
	public  String readFromFileByByte(String pathAndName) throws IOException{
		file=new File(pathAndName);
		if(!file.exists()) {
			file.createNewFile();
		}
		InputStream inputStream=new FileInputStream(file);
		byte [] bs=new byte[(int) file.length()];
		inputStream.read(bs);
		inputStream.close();
		return new String(bs);
	}
}
