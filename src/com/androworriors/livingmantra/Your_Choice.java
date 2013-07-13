package com.androworriors.livingmantra;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Your_Choice extends Activity implements OnClickListener {

	Button b1,b2,b3,b4;
	TextView tv1,tv2;
	ImageButton ib1,ib2,ib3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
		b2=(Button)findViewById(R.id.button2);
		b2.setOnClickListener(this);
		b3=(Button)findViewById(R.id.button3);
		b3.setOnClickListener(this);
		b4=(Button)findViewById(R.id.button4);
		b4.setOnClickListener(this);
		tv1=(TextView)findViewById(R.id.textView1);
		tv1.setOnClickListener(this);
		tv2=(TextView)findViewById(R.id.textView2);
		tv2.setOnClickListener(this);
		ib1=(ImageButton)findViewById(R.id.imageButton1);
		ib1.setOnClickListener(this);
		ib2=(ImageButton)findViewById(R.id.imageButton2);
		ib2.setOnClickListener(this);
		ib3=(ImageButton)findViewById(R.id.imageButton3);
		ib3.setOnClickListener(this);
		
		
	}

	public void onBackpressed()
	{
		Intent i=new Intent(this,Start.class);
		startActivity(i);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.settings, menu);
		return true;
	}
	Context context;
	@SuppressLint("ShowToast") @Override
	public void onClick(View v) {
	
		// TODO Auto-generated method stub
		switch(v.getId()){
	
		case R.id.button1:
			Intent i1=new Intent(this,Student.class);
			startActivity(i1);
			break;
		case R.id.button2:
			 Intent i2=new Intent(this,BusinessMan.class);
			startActivity(i2);
			break;
		case R.id.button3:
			Intent i3=new Intent(this,RetiredPerson.class);
			startActivity(i3);
			break;
		case R.id.button4:
			Intent i4=new Intent(this,SickPerson.class);
			startActivity(i4);
			break;
		case R.id.textView1:
			Intent i5=new Intent(this,WebSearch.class);
			startActivity(i5);
			break;
		case R.id.textView2:
			Intent i6=new Intent(this,Query.class);
			startActivity(i6);
			
			break;
			
		case R.id.imageButton1:
		Intent facebook=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com/pages/Livingmantras/582996031710949"));
		startActivity(facebook);
		break;
		
		case R.id.imageButton2:
			Intent twitter=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.twitter.com/livingmantras"));
			startActivity(twitter);
			break;
			
		case R.id.imageButton3:
			Intent music=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.itunes.com"));
			startActivity(music);
			break;
			default:
			{
				Toast.makeText(getApplicationContext(), "Wrong Choice", Toast.LENGTH_SHORT).toString();
			}
		}
	}

}
