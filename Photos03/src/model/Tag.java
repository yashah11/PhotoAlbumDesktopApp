/**
 * @author Yash Shah
 * @author Aaron Argueta
 */
package model;

import java.io.Serializable;

public class Tag implements Serializable {
	
	private static final long serialVersionUID = -2310738753538431907L;
	private String name, value;
	
	/**
	 * Creates a new tag
	 * @param name the name of the tag
	 * @param value the value of the tag
	 */
	public Tag(String name, String value) {
		this.name = name; this.value = value;
	}
	
	/**
	 * Returns the name of this tag
	 * @return an name of tag
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the value of this tag
	 * @return an value of tag
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Compares this tag to another
	 * @param other the tag to be compared to
	 * @return true if the tag are equal, false otherwise
	 */
	public boolean equals(Tag other) {
		return name.equals(other.name) && value.equals(other.value);
	}
	
	/**
	 * Returns a string representation of this tag
	 * @return a string representation of this tag
	 */
	public String toString() {
		return name + " - " + value;
	}
}
