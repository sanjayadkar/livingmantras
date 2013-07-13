package com.androworriors.livingmantra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Query extends Activity implements OnClickListener {

	TextView To,tv2,tv3,tv4; 
	EditText txtCc,txtSubject,txtQuery;
	Button btnSend;
	String to="livingmantras.LM@gmail.com";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_query);
		To=(TextView)findViewById(R.id.textView2);
		txtCc=(EditText)findViewById(R.id.editText1);
		txtSubject=(EditText)findViewById(R.id.editText2);
		txtQuery=(EditText)findViewById(R.id.editText3);
		btnSend=(Button)findViewById(R.id.button1);
		btnSend.setOnClickListener(this);
		To.setText(to);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.query, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		// to="bhalchandraambre@gmail.com";
		String cc=txtCc.getText().toString();
		String subject=txtSubject.getText().toString();
		String query=txtQuery.getText().toString();
		
		//To.setText(to);
		Intent Qemail=new Intent(Intent.ACTION_SEND);
		Qemail.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
		Qemail.putExtra(Intent.EXTRA_CC, new String[]{ cc});
		Qemail.putExtra(Intent.EXTRA_SUBJECT, subject);
		Qemail.putExtra(Intent.EXTRA_TEXT, query);
		
		Qemail.setType("message/rfc822");
		
		startActivity(Intent.createChooser(Qemail, "Choose your client:"));
	}

}
