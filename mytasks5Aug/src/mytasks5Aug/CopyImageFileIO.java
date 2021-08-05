package mytasks5Aug;
import java.io.*;
public class CopyImageFileIO {
 
        /* If file doesnot exist FileInputStream throws
           FileNotFoundException and read() write() throws
           IOException if I/O error occurs */
        FileInputStream fis = new FileInputStream(args[0]);
  
        /* assuming that the file exists and need not to be
           checked */
        FileOutputStream fos = new FileOutputStream(args[1]);
  
        
        while  ((b=fis.read()) != -1)
            fos.write(b);
  
        /* read() will readOnly next int so we used while
           loop here in order to read upto end of file and
           keep writing the read int into dest file */
        fis.close();
        fos.close();
    }


