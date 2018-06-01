package learning;

import java.io.*;
public class Fileio {

   public static void main(String args[])throws IOException {
   
    /*  try {
         int bWrite [] = {11, 21, 3, 40, 5};
         OutputStream os = new FileOutputStream("test.txt");
         for(int x = 0; x < bWrite.length ; x++) {
            os.write( bWrite[x] );   // writes the bytes
         }
         os.close();
         os.flush();
         InputStream is = new FileInputStream("test.txt");
         int size = is.available();

         for(int i = 0; i < size; i++) {
            System.out.print((char)is.read() + "  ");
         }
         is.close();
      } catch (IOException e) {
         System.out.print("Exception");
      }	
   }*/
	   FileInputStream in = null;
	   FileOutputStream out = null;

	      try {
	         in = new FileInputStream("input.txt");
	         out = new FileOutputStream("output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }catch (IOException i){
	    	  System.out.println("File Not Found");
	    	  i.printStackTrace();
	       }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	}
}
   
   
 

