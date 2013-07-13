package com.androworriors.livingmantra;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class WebSearch extends Activity implements OnClickListener {
	TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_search);
		tv1=(TextView)findViewById(R.id.textView2);
		tv1.setOnClickListener(this);
		tv2=(TextView)findViewById(R.id.textView3);
		tv2.setOnClickListener(this);
		tv3=(TextView)findViewById(R.id.textView4);
		tv3.setOnClickListener(this);
		tv4=(TextView)findViewById(R.id.textView6);
		tv4.setOnClickListener(this);
		tv5=(TextView)findViewById(R.id.textView7);
		tv5.setOnClickListener(this);
		tv6=(TextView)findViewById(R.id.textView8);
		tv6.setOnClickListener(this);
		tv7=(TextView)findViewById(R.id.textView10);
		tv7.setOnClickListener(this);
		tv8=(TextView)findViewById(R.id.textView11);
		tv8.setOnClickListener(this);
		tv9=(TextView)findViewById(R.id.textView12);
		tv9.setOnClickListener(this);
		tv10=(TextView)findViewById(R.id.textView14);
		tv10.setOnClickListener(this);
		tv11=(TextView)findViewById(R.id.textView15);
		tv11.setOnClickListener(this);
		tv12=(TextView)findViewById(R.id.textView16);
		tv12.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.web_search, menu);
		return true;
	}

	
	@Override
	public void onClick(View v){
		// TODO Auto-generated method stub
		
switch(v.getId())
{
case  R.id.textView2:
	Intent i1=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.himalayahealthcare.com"));
	
	startActivity(i1);
	break;
case  R.id.textView3:
	Intent i2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.globalhealth.com"));
	startActivity(i2);
	break;
case  R.id.textView4:
	Intent i3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.justforheart.com"));
	startActivity(i3);
	break;
case  R.id.textView6:
	Intent i4=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.laughteryoga.org"));
	startActivity(i4);
	break;
case  R.id.textView7:
	Intent i5=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.yogajournal.com"));
	startActivity(i5);
	break;
case  R.id.textView8:
	Intent i6=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.a2zyoga.com"));
	startActivity(i6);
	break;
case  R.id.textView10:
	Intent i7=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.artofliving.org"));
	startActivity(i7);
	break;
case  R.id.textView11:
	Intent i8=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.freemeditation.com"));
	startActivity(i8);
	break;
case  R.id.textView12:
	Intent i9=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.speakingtree.in/spiritual"));
	startActivity(i9);
	break;
case  R.id.textView14:
	Intent i10=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.moodturn.com"));
	startActivity(i10);
	break;
case  R.id.textView15:
	Intent i11=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.selfgrowth.com/relaxation"));
	startActivity(i11);
	break;
case  R.id.textView16:
	Intent i12=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.webmd.com"));
	startActivity(i12);
	break;
}
	}
	//default:
	//	Toast.makeText(getApplicationContext(),"Choose proper link", Toast.LENGTH_SHORT).toString();
	
 /*   case  R.id.textView2:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.globalhealth.com"));
	 break;
	
case  R.id.textView3:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.justforheart.com"));
	 break;
case  R.id.textView4:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("www.himalayahealthcare.com"));
	 break;
case  R.id.textView6:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("www.laughteryoga.org"));
	 break;
case  R.id.textView7:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("www.yogajournal.com"));
	 break;
case  R.id.textView8:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("www.a2zyoga.com"));
	 break;
case  R.id.textView10:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("www.artofliving.org"));
	 break;
case  R.id.textView11:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("www.freemeditation.com"));
	 break;
case  R.id.textView12:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("www.speakingtree.in/spiritual"));
	 break;
case  R.id.textView14:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("www.moodturn.com"));
	 break;
case  R.id.textView15:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("www.selfgrowth.com/relaxation"));
 break;
case  R.id.textView16:
	 i=new Intent(Intent.ACTION_VIEW,Uri.parse("www.webmd.com"));
	break;
}
if(i!=null)
startActivity(i); */
 

}

