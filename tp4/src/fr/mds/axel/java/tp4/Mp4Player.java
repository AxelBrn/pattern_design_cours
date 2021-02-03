package fr.mds.axel.java.tp4;

public class Mp4Player implements MediaPlayer {
	
	@Override
	public void play(String audioType, String fileName) {

	    if (audioType.toLowerCase().equalsIgnoreCase("mp4")) {
	    	System.out.println("Playing mp4 file. Name: " + fileName);
	    } else {
	    	System.out.println("Invalid media. " + audioType + " format not supported");
	    }
	  }
	
}
