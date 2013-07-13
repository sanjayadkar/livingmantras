package com.androworriors.livingmantra;



import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class RetiredPerson extends TabActivity {

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_retired_person);
		TabHost tbhost= getTabHost();
		
		
		

		// tab for yoga
		TabSpec yogaspec=tbhost.newTabSpec("Yoga");
		 yogaspec.setIndicator("Yoga",getResources().getDrawable(R.drawable.yoga_tab) );
		Intent yogaIntent=new Intent(this,YogaRetired.class);
		yogaspec.setContent(yogaIntent);
		
		
		//tab for health
		TabSpec healthspec=tbhost.newTabSpec("Health");
		 healthspec.setIndicator("Health", getResources().getDrawable(R.drawable.health_tab));
		Intent healthIntent=new Intent(this,HealthRetired.class);
		healthspec.setContent(healthIntent);
		
		//tab for Meditation
				TabSpec meditationspec=tbhost.newTabSpec("Meditation");
				 meditationspec.setIndicator("Meditation", getResources().getDrawable(R.drawable.meditation_tab));
				Intent meditationIntent=new Intent(this,MeditationRetired.class);
				meditationspec.setContent(meditationIntent);
				
				//tab for relaxation
				TabSpec relaxationspec=tbhost.newTabSpec("Relaxation");
				 relaxationspec.setIndicator("Relaxation", getResources().getDrawable(R.drawable.relaxation_tab));
				Intent relaxationIntent=new Intent(this,RelaxationRetired.class);
				relaxationspec.setContent(relaxationIntent);
				
				// adding all tabs to tabhost
				tbhost.addTab(yogaspec);
				tbhost.addTab(healthspec);
				tbhost.addTab(meditationspec);
				tbhost.addTab(relaxationspec);
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.retired_person, menu);
		return true;
	}*/

}
