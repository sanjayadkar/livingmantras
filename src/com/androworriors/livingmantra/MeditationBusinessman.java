package com.androworriors.livingmantra;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MeditationBusinessman extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_meditation_businessman);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.meditation_businessman, menu);
		return true;
	}

}
