

public class Tune {

	
	private int x;
	private String title, altTitle, notation;
	
	
	// Setter & getter x
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	// Setter & getter Title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	// Setter & getter AltTitle
	public String getAltTitle() {
		return altTitle;
	}
	public void setAltTitle(String altTitle) {
		this.altTitle = altTitle;
	}
	
	// Setter & getter Notation
	public String getNotation() {
		return notation;
	}
	public void setNotation(String notation) {
		this.notation = notation;
	}
	
	
	// to string method
	 public String toString()
	    {
	        StringBuffer tu = new StringBuffer();
	        for(String tune:tunes)
	        {
	            tu.append(tune + ", ");
	        }

	        return tu.toString();

	    }	
}	

