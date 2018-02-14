import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;


public class TuneBook {

	//arrayList to store the objects Tune 
	ArrayList<Tune> tunes = new ArrayList<Tune>();
	
	
	
		//constructor
		public TuneBook(String songLibrary) {
		
			
			 BufferedReader inputStream = null;
	
		        try {
		            inputStream = new BufferedReader(new FileReader("hnj0.abc"));
		            
		            String l;
		            while ((l = inputStream.readLine()) != null) {
		                tunes.add(l);
		            }
		        }
		        catch (IOException e)
		        {
		            e.printStackTrace();
		        } 
		        finally 
		        {
		            if (inputStream != null) {
		                try
		                {
		                    inputStream.close();
		                }
		                catch(Exception e)
		                {
		                    e.printStackTrace();
		                }
		            }
		        }
			
			
		}
	

	
	
	
		 public static void main(String[] args){
		        TuneBook tb = new TuneBook("hnj0.abc");
		        System.out.println(tb);
	
		        Tune t = tb.findTune("Scotsman over the Border");
		        t.play();
		    }





		private Tune findTune(String string) {
			
			
			return null;
		}		
		
	}
