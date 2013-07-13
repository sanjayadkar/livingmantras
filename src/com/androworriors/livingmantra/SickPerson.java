package com.androworriors.livingmantra;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class SickPerson extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sick_person);
		
TabHost tbhost1= getTabHost();
		
		
		

		// tab for yoga
		TabSpec yogaspec=tbhost1.newTabSpec("Yoga");
		 yogaspec.setIndicator("Yoga",getResources().getDrawable(R.drawable.yoga_tab) );
		Intent yogaIntent=new Intent(this,YogaSick.class);
		yogaspec.setContent(yogaIntent);
		
		
		//tab for health
		TabSpec healthspec=tbhost1.newTabSpec("Health");
		 healthspec.setIndicator("Health", getResources().getDrawable(R.drawable.health_tab));
		Intent healthIntent=new Intent(this,HealthSick.class);
		healthspec.setContent(healthIntent);
		
		//tab for Meditation
				TabSpec meditationspec=tbhost1.newTabSpec("Meditation");
				 meditationspec.setIndicator("Meditation", getResources().getDrawable(R.drawable.meditation_tab));
				Intent meditationIntent=new Intent(this,MeditationSick.class);
				meditationspec.setContent(meditationIntent);
				
				//tab for relaxation
				TabSpec relaxationspec=tbhost1.newTabSpec("Relaxation");
				 relaxationspec.setIndicator("Relaxation", getResources().getDrawable(R.drawable.relaxation_tab));
				Intent relaxationIntent=new Intent(this,RelaxationSick.class);
				relaxationspec.setContent(relaxationIntent);
				
				// adding all tabs to tabhost
				tbhost1.addTab(yogaspec);
				tbhost1.addTab(healthspec);
				tbhost1.addTab(meditationspec);
				tbhost1.addTab(relaxationspec);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sick_person, menu);
		return true;
	}

}
