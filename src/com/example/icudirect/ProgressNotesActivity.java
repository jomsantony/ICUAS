package com.example.icudirect;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class ProgressNotesActivity extends Activity {
	
	String serverip="http://192.168.2.8:8080/ICUASProj/jmmc";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_progress_notes);
	}
	public void goHome(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		Intent intent; 
		intent = new Intent(this, MainActivity.class);
	     startActivity(intent); 
			
	}
	
	public void nextParam(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		Intent intent; 
		intent = new Intent(this, ClinicalOrdersActivity.class);
	     startActivity(intent); 
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		WebView progNotesView=(WebView)findViewById(R.id.webView1);
		progNotesView.loadUrl(serverip+"/pnotes.jsp");
		
		
		getMenuInflater().inflate(R.menu.activity_progress_notes, menu);
		return true;
	}

}
