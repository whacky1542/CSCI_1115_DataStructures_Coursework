package exercise21_07;

/*
 * Author: Alex Johnson
 * Date: 03-03-2020
 * 
 * Description: This class is for the instances of a hash map to then be sorted by count.
 */

public class WordOccurrence implements Comparable<WordOccurrence> {
	private String word;
	private int count;
	
	public WordOccurrence() {
		
	}
	
	public WordOccurrence(String word, int count) {
		this.word = word;
		this.count = count;
	}
	
	public String getWord() {
		return word;
	}
	
	public int getCount() {
		return count;
	}
	
	@Override
	public int compareTo(WordOccurrence o) {
		if (count > o.getCount())
			return 1;
		else if (count < o.getCount())
			return -1;
		else
			return 0;
	}
}
