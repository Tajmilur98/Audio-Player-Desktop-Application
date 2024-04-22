import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.sound.sampled.Clip;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class PlayingTimer extends Thread{
	private DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	private boolean isRunning = false;
	private boolean isPaused = false;
	private boolean isReset  = false;
	
	private long startTime;
	private long pauseTime;
	
	private JLabel labelRecordTime;
	private JSlider slider;
	private Clip audioClip;
	
	public void setAudioClip(Clip audioClip) {
		this.audioClip = audioClip;
	}
	
	PlayingTimer(JLabel labelRecordTime, JSlider slider){
		this.labelRecordTime = labelRecordTime;
		this.slider = slider;
	}
	
        @Override
	public void run() {
		isRunning = true;
		
		startTime = System.currentTimeMillis();
		
		while(isRunning == true) {
			try {
				Thread.sleep(100);
				if(isPaused == false) {
					if(audioClip!=null && audioClip.isRunning()) {
						labelRecordTime.setText(toTimeString());
						int currentSecond = (int) audioClip.getMicrosecondPosition()/1_000_000;
						slider.setValue(currentSecond);
					}
				}else {
					pauseTime += 100;
				}
			}catch(InterruptedException ex) {
				
				if(isReset) {
					slider.setValue(0);
					labelRecordTime.setText("00:00:00");
					isRunning = false;
					break;
				}
			}
		}
	}
	
	//RESET 
	void reset() {
		isReset = true;
		isRunning = false;
	}
	//PAUSE TIMER
	void pauseTimer() {
		isPaused = true;
	}
	//RESUME TIMER
	void resumeTimer() {
		isPaused = false;
	}
	
	//get Time as string
	private String toTimeString() {
		long now = System.currentTimeMillis();
		Date current = new Date(now - startTime - pauseTime);
		dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		String timeCounter = dateFormat.format(current);
		
		return timeCounter;
		
	}
}
