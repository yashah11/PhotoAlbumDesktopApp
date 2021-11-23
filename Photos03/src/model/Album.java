/**
 * @author Yash Shah
 * @author Aaron Argueta
 */
package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Album implements Serializable {

	private static final long serialVersionUID = 1891567810783724951L;
	private String name, d1, d2;
	private ArrayList<Photo> photos;
	private Calendar earliestDate, latestDate;
	
	
	/**
	 * Constructor
	 * @param name
	 * takes the name of the album
	 */
	public Album(String name) {
		this.name = name;
		photos = new ArrayList<Photo>();
	}
	/**
	 * Sets the range of dates of this album
	 * 
	 */
	public void setDate() {
		if (!photos.isEmpty()) {
			this.earliestDate = photos.get(0).getDate();
			this.latestDate = photos.get(0).getDate();
			
			for ( Photo p : photos ) {
			if (earliestDate.after(p.getDate())) {
				this.earliestDate = p.getDate();
			}
			if (latestDate.before(p.getDate())) {
				this.latestDate = p.getDate();
			}
			}
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");	
			String formatted = format1.format(earliestDate.getTime());
			this.d1= formatted;
			formatted = format1.format(latestDate.getTime());
			this.d2= formatted;
		}
	}
	/**
	 * Gets the name of this album
	 * @return the name of this album
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets the name of this album
	 * @param name the new name of this album
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the photos in this album
	 * @return an arraylist of photos
	 */
	public ArrayList<Photo> getPhotos() {
		return this.photos;
	}
	
	/**
	 * Returns the number of photos in this album
	 * @return the number of photos in this album
	 */
	public int getPhotoCount() {
		return this.photos.size();
	}
	
	/**
	 * Compares this album to another
	 * @param other the album to be compared
	 * @return true if the albums are equal, false otherwise
	 */
	public boolean equals(Album other) {
		return name.equals(other.name);
	}
	
	/**
	 * Returns a string representation of this album
	 */
	public String toString() {
		this.setDate();
		String result = "Name: " + name + "\nNumber of Photos: " + photos.size() + "\nDates: " + d1 + " - " + d2 ; 
		return result;
	}
}
