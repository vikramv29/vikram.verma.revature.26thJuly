package mytasks5Aug;
import java.io.*;
public class CopyImageFileIO {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			
		
   FileInputStream in= new FileInputStream("D:\\ID Proof\\VIKRAM\\PASSPORTPHOTO.jpg");
   FileOutputStream o = new FileOutputStream("D:\\copy.jpg");
   BufferedInputStream B=new BufferedInputStream(in);
   BufferedOutputStream Bo= new BufferedOutputStream(o);
   
   int a =0;
   while(a!=-1) {
	   a=B.read();
	   Bo.write(a);
   }
   B.close();
   Bo.close();
		}
		 catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
 
      


