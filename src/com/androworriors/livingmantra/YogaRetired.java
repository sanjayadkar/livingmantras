package com.androworriors.livingmantra;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class YogaRetired extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_yoga_retired);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.yoga_retired, menu);
		return true;
	}

}