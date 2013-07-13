package com.androworriors.livingmantra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Start extends Activity {

 ProgressBar p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        p1=(ProgressBar)findViewById(R.id.progressBar1);
     //  Typeface font=Typeface.createFromAsset(getAssets(), "MTCORSVA");
   TextView tv1=new TextView(this);
       tv1=(TextView)findViewById(R.id.textView1);
     // tv1.setTypeface(font);
        Thread th1=new Thread()
        {
        	public void run(){
        		
        			try{
        				Thread.sleep(5000);
        			}catch(InterruptedException e){
        				e.printStackTrace();
        			
        		
        		}finally{
        			Intent intent=new Intent("com.androworriors.livingmantra1.YOUR_CHOICE");
        			startActivity(intent);
        		}
        	}
        };
        th1.start();
        
        //Typeface font=Typeface.createFromAsset(getAssets(), "MTCORSVA.ttf");
       // tv1.setTypeface(font);
    }
    
    
   
   /* public void onBackPressed()
    {
    
    	 setContentView(R.layout.activity_start);
         p1=(ProgressBar)findViewById(R.id.progressBar1);
         Thread th1=new Thread()
         {
         	public void run(){
         		try{
         			try{
         				Thread.sleep(1000);
         			}catch(InterruptedException e){
         				e.printStackTrace();
         			}
         		
         		}finally{
         			Intent intent=new Intent("com.androworriors.livingmantra1.YOUR_CHOICE");
         			startActivity(intent);
         		}
         	}
         };
         th1.start();
    }*/

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            return true; //not sure this is needed
        }
        return super.onKeyDown(keyCode, event);
    }


	
    
}
