/// YDavis_Module_3_Lab_042521 
// Will display array index error - out of range
import java.util.logging.Logger; 
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

 
public class lab4GITcommit  {
 
    private static final Logger LOGGER = Logger.getLogger(lab4GITcommit.class.getName());  // Define Logger
    
    public void procindxerr()  {                                                        // Pass index error flag for logging error
    	
    	String sndflagerr;	
    	
		LOGGER.info("Logger Name: "+LOGGER.getName());
         
        LOGGER.warning("ArrayIndexOutOfBoundsException");
         
        //An array of size 7
        int []a = {1,2,3,4,5,6,7};
        int index = 8;
                
      
          // Array has no issues
        try{
        	sndflagerr 	= "N";                                                           // Error flag - Error does not exists
        	System.out.println(a[index]);
            System.out.println("Array looks great!" );
            
       // Array has an index issue     
        }catch(ArrayIndexOutOfBoundsException ex){
            LOGGER.log(Level.SEVERE, "Exception occur", ex);
            sndflagerr  = "Y";                                                           // Error flag - Error exists
                     
        }                                                                                // catch end bracket
        
         
		    
    }                                                                                    // process index error end bracket  
  
}                                                                                        // Log example class end bracket    