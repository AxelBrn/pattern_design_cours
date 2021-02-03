package fr.mds.axel.java.tp4;

public class VlcPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {

	    if(audioType.toLowerCase().equalsIgnoreCase("vlc")) {
	    	System.out.println("Playing vlc file. Name: " + fileName);
	    } else {
	    	System.out.println("Invalid media. " + audioType + " format not supported");
	    }
	  }
	
}
