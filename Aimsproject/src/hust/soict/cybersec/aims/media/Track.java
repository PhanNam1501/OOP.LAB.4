package hust.soict.cybersec.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	public String getTitle() {
	      return title;
	   }
	   
	   public int getLength() {
	      return length;
	   }

	   public Track() {
	   }

	   public Track(String title){
	      this.title = title;
	   }

	   public Track(String title, int length) {
	      this.title = title;
	      this.length = length;
	   }

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	public boolean equals(Object obj) {
		if (obj instanceof Track) {
			Track track = (Track) obj;
			if ((title == track.getTitle()) && (length == track.getLength())) {
				return true;
			}
		}
		return false;
	}

}
