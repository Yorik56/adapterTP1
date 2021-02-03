package com.tactfactory.designpattern.adapter.tp1;

public class MediaAdapter implements MediaPlayer {
	
	public  String audioType;
	private AudioPlayer audioplayer = new AudioPlayer();
//	private AdapteeV2 adapteeV2 = new AdapteeV2();
  
	public MediaAdapter(String audioType) {
		this.audioType = audioType;
	}

	public void play(String audioType, String fileName) {

		switch (audioType) {
	    case "mp4":
	    	audioplayer.play(audioType, fileName );
	      break;

	    case "mp3":
	    	audioplayer.play(audioType, fileName );
	      break;
	    }
		  
	  }
}
