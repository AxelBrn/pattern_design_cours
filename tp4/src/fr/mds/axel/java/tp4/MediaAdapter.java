package fr.mds.axel.java.tp4;

public class MediaAdapter implements MediaPlayer {
	
	private MediaPlayer player;
	
	public MediaAdapter(String mediaType) {
		if (mediaType.toLowerCase().equalsIgnoreCase("mp3")) {
		     this.player = new AudioPlayer();
		} else if (mediaType.toLowerCase().equalsIgnoreCase("mp4")) {
			this.player = new Mp4Player();
		} else if(mediaType.toLowerCase().equalsIgnoreCase("vlc")) {
			this.player = new VlcPlayer();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if(this.player == null) {
			System.out.println("Invalid media. " + audioType + " format not supported");
		} else {
			this.player.play(audioType, fileName);
		}
		
	}

	
	
}
