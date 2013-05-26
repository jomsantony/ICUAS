package com.example.icudirect;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class ChartsActivity extends Activity {

	String serverip="http://192.168.2.8:8080/ICUASProj/jmmc";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_charts);
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
		intent = new Intent(this, LabResultsActivity.class);
	     startActivity(intent); 
			
	}
	
	
	
	
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		WebView chartView=(WebView)findViewById(R.id.webView1);
		chartView.loadUrl(serverip+"/charts.html");
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_charts, menu);
		return true;
	}

}
