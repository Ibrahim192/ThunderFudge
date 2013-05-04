package com.example.thunderfudge;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

/*Activity class is imported from android packages to use stuff related to that class*/
public class Splash extends Activity {
// Declaring variable name mp which is media player type
MediaPlayer mp;
//On create bundle is one of the classes of Activity 	Package
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	// uses setContentView method to set the content view 
		setContentView(R.layout.splash);
		mp= MediaPlayer.create(Splash.this, R.raw.tbbt);
		mp.start();
		//Thread are used to perform multiple things simultaneously
		Thread t1 = new Thread() {
			// A new thread is created^^
			
			public void run() {
				// a method run is created
				try {
					sleep(8500);
					// here by 8500, we indicate the splash file to be loaded for around 8 to 9 seconds approximately
					mp.stop();
					// Defining a intent i
					
					
				} catch (InterruptedException e) {
//used to catch exceptions to overcome errors if try doesnt workout
					e.printStackTrace();
				} finally {
					Intent i = new Intent(Splash.this, MainActivity.class);
					startActivity(i);
					

				}
			}
		};
		
        t1.start();
     // starts the thread
        
	}//Finish is used to end the splash screen
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}