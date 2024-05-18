package hust.soict.cybersec.aims.media;
import java.util.*;

public class PolymophismTest {
		 public static void main(String[] args) {
			ArrayList<Media> mediae = new ArrayList<Media>();
			
			Book book = new Book("Lionel Messi");
			CompactDisc cd = new CompactDisc("Goat");
			DigitalVideoDisc dvd = new DigitalVideoDisc("Barcalona");
			
			mediae.add(book);
			mediae.add(cd);
			mediae.add(dvd);
			
			for (Media element: mediae) {
				System.out.println(element.toString());
			}
		 
		 
	}

}
