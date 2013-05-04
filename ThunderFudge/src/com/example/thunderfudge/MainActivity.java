package com.example.thunderfudge;


import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	// Declaring the required variables, button names, etc
	int sum,click,i;
	boolean flag=true;
	String con,bin,oct;
	char ch;
	SoundPool sp;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,b12,o,h,b,s;
	TextView button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp= new SoundPool(5,AudioManager.STREAM_MUSIC,0);
        click = sp.load(this ,R.raw.click,1);
        //Soundpool is used to play sound on clicking buttons
        
        sum=0;
        // sum is assigned to zero initially
        s=(Button) findViewById(R.id.sound);
        button10=(TextView) findViewById(R.id.button10);
        
        b12=(Button) findViewById(R.id.button12);
        b=(Button) findViewById(R.id.button13);
        h=(Button) findViewById(R.id.button14);
        o=(Button) findViewById(R.id.button15);
        
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
			// Start performing basic calculation by assigning values..
       //...to variables as they're clicked
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		sum=sum+1;
		button10.setText("Sum = "+sum);
		//the above command changes the sum value on click
		
		//Function call is made using check(); which checks if the sum is odd or even and it also converts the sum to bin,oct,hex
		check();
		
			
			}
		});
        
        b2 = (Button) findViewById(R.id.button2);
b2.setOnClickListener(new View.OnClickListener() {
	// Start performing basic calculation by assigning values..
    //...to variables as they're clicked by on click listener function
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		sum=sum+2;
		button10.setText("Sum = "+sum);
		
		
		//the above command changes the sum value on click
		
		//Function call is made using check(); which checks if the sum is odd or even and it also converts the sum to bin,oct,hex
		check();

			}
		});

b3 = (Button) findViewById(R.id.button3);
b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		sum=sum+3;
		button10.setText("Sum = "+sum);
		
		
		check();

			}
		});

b4 = (Button) findViewById(R.id.button4);
b4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		sum=sum+4;
		button10.setText("Sum = "+sum);
		
		check();

			}
		});

b5 = (Button) findViewById(R.id.button5);
b5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		sum=sum+5;
		button10.setText("Sum = "+sum);

		
		check();
			}
		});

       
b6 = (Button) findViewById(R.id.button6);
b6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		sum=sum+6;
		button10.setText("Sum = "+sum);
        check();
		
			}
		});
b7 = (Button) findViewById(R.id.button7);
b7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		sum=sum+7;
		button10.setText("Sum = "+sum);
		
		check();
			}
		});

b8 = (Button) findViewById(R.id.button8);
b8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		sum=sum+8;
		button10.setText("Sum = "+sum);
		
		check();

			}
		});
b9 = (Button) findViewById(R.id.button9);
b9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		sum=sum+9;
		button10.setText("Sum = "+sum);

		
		check();
			}
		});
b0 = (Button) findViewById(R.id.button0);
b0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
		sum=sum+0;
		button10.setText("Sum = "+sum);

		
		check();
			}
		});
b11 = (Button) findViewById(R.id.button11);
b11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
	// this button is used to make the sum value as deafult i.e. 0
		sum=0;
	// Hence sum is set to 0 on clicking on it..
		button10.setText("Sum = "+sum);
		
		
		check();

			}
		});

s.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		// Boolean method is used to set mute and unmute by negating on each press..
flag=!flag;
if(flag==false){
	s.setText("Unmute");
}
else 
	s.setText("Mute");

	






	}
});


 




    

    
    }
// Here is the function definition of check which was called earlier
    private void check() {
		// TODO Auto-generated method stub
    	if(flag==true){
    		sp.play(click, 1, 1,0,0,1);
    		}
    	// the above thing evaluates if mute button is true to play sound, if not, it doesnt play..
    	// we use predefined functions to perform number conversion
    	con = Integer.toHexString(sum);
		h.setText(con);
		bin = Integer.toBinaryString(sum);
		b.setText(bin);
		oct=Integer.toOctalString(sum);
		o.setText(oct);
		// con, bin and oct are stored the hexadecimal, binary and octal value of sum respectively
		// these converted values are set into button representing bin, hex, oct
		if(sum%2==0)
			b12.setText("Even");
		else
			b12.setText("Odd");
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
