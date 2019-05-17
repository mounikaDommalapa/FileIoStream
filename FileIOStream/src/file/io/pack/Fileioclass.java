package file.io.pack;
import java.io.*;

public class Fileioclass {
	
	public static void main(String[] args) throws IOException
	{
	File f= new File("muni.txt");
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));//BufferedReader reads the inputstream data
	System.out.println("enter your name");
	while(!br.readLine().contentEquals("stop"))
	{
		System.out.println("enter data");
		System.out.println(br.readLine());
	}
	br.close();
	
	}
}
