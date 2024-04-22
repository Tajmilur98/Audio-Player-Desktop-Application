

import java.io.IOException;
import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioPlayer implements LineListener {
	
	private boolean playCompleted;
	
	private boolean isStopped;
	private boolean isPaused;
	private Clip audioClip;
	
	public void load(String audioFilePath)
	                 throws UnsupportedAudioFileException, IOException,
	     			 LineUnavailableException {
	             		File audioFile = new File(audioFilePath);
	             		
	             		AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
	             		

	            		AudioFormat format = audioStream.getFormat();

	            		DataLine.Info info = new DataLine.Info(Clip.class, format);

	            		audioClip = (Clip) AudioSystem.getLine(info);

	            		audioClip.addLineListener(this);

	            		audioClip.open(audioStream);
	}
	
	public long getClipSecondLength() {
		return audioClip.getMicrosecondLength() / 1_000_000;
	}
	
	public String getClipLengthString() {
		String length = "";
		long hour = 0;
		long minute = 0;
		long seconds = audioClip.getMicrosecondLength() / 1_000_000;
		
		System.out.println(seconds);
		
		if (seconds >= 3600) {
			hour = seconds / 3600;
			length = String.format("%02d:", hour);
		} else {
			length += "00:";
		}
		
		minute = seconds - hour * 3600;
		if (minute >= 60) {
			minute = minute / 60;
			length += String.format("%02d:", minute);
			
		} else {
			minute = 0;
			length += "00:";
		}
		
		long second = seconds - hour * 3600 - minute * 60;
		
		length += String.format("%02d", second);
		
		return length;
	}
	
	void play() throws IOException {

		audioClip.start();

		playCompleted = false;
		isStopped = false;

		while (!playCompleted) {
			// wait for the play_back completes
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
				if (isStopped) {
					audioClip.stop();
					break;
				}
				if (isPaused) {
					audioClip.stop();// but do not break
				} else {
					System.out.println("!!!!");
					audioClip.start();
				}
			}
		}

		audioClip.close();

	}

	

	public void stop() {
		isStopped = true;
	}

	public void pause() {
		isPaused = true;
	}

	public void resume() {
		isPaused = false;
	}

//Implementing LineListener
	public Clip getAudioClip() {
		
		return audioClip;
	}
	@Override
	public void update(LineEvent event) {
		LineEvent.Type type = event.getType();
		
		if(type == LineEvent.Type.STOP) {
			System.out.println("STOP EVENT");
			if (isStopped || !isPaused) {
				playCompleted = true;
			}
		}
		
	}

}
