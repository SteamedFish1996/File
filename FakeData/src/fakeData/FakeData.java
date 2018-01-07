package fakeData;

import java.io.IOException;

import file.ReadFile;
import file.WriteToFile;

/**
 * 
 * @author Zhao Zhengyu
 * @version 2018年1月7日 下午8:36:34
 */
public class FakeData {

	public static void main(String[] args) {
		ReadFile rfile=new ReadFile ();
		String pro = null;
		try {
			pro=rfile.readFromFileByByte(new String("profession.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String[] out=pro.split(new String("“，”"));
		WriteToFile wfile=new WriteToFile();
		try {
			wfile.WriteToFileByByte("test.txt",out[0]+"\r\n");
			for(int i=1;i<out.length;i++) {
				wfile.AddToFileByByte("test.txt",out[i]+"\r\n");
			}
			
			//wfile.AddToFileByByte("test.txt",pro);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
