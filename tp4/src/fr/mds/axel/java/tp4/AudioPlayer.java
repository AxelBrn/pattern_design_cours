package fr.mds.axel.java.tp4;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {
	
	  if (audioType.toLowerCase().equalsIgnoreCase("mp3")) {
	     System.out.println("Playing mp3 file. Name: " + fileName);
	  }  else {
		 MediaPlayer player = new MediaAdapter(audioType);
	     player.play(audioType, fileName);
	  }
	}
}
