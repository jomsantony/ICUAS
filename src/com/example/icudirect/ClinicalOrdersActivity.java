package com.example.icudirect;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class ClinicalOrdersActivity extends Activity {

	String serverip="http://192.168.2.8:8080/ICUASProj/jmmc";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clinical_orders);
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
		intent = new Intent(this, ImagesActivity.class);
	     startActivity(intent); 
			
	}
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		WebView cliOrdersView=(WebView)findViewById(R.id.webView1);
		cliOrdersView.loadUrl(serverip+"/cliorders.jsp");
		
		getMenuInflater().inflate(R.menu.activity_clinical_orders, menu);
		return true;
	}

}
