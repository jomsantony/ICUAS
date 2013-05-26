package com.example.icudirect;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
public class MainActivity extends Activity {
	
	String serverip="http://192.168.2.8:8080/ICUASProj/jmmc";
	int bedno;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
public void onClick(View v){}
	public void getBed1Data(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		WebView b01View=(WebView)findViewById(R.id.webView1);
		b01View.loadUrl(serverip+"/Vitals.jsp?bedID=1");
			
	}
	
	public void getBed2Data(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		WebView b01View=(WebView)findViewById(R.id.webView1);
		b01View.loadUrl(serverip+"/Vitals.jsp?bedID=2");
			
	}
	
	public void getBed3Data(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		WebView b01View=(WebView)findViewById(R.id.webView1);
		b01View.loadUrl(serverip+"/Vitals.jsp?bedID=3");
			
	}
	
	public void getBed4Data(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		WebView b01View=(WebView)findViewById(R.id.webView1);
		b01View.loadUrl(serverip+"/Vitals.jsp?bedID=4");
			
	}
	
	public void getBed5Data(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		WebView b01View=(WebView)findViewById(R.id.webView1);
		b01View.loadUrl(serverip+"/Vitals.jsp?bedID=5");
			
	}
	
	public void bedEmpty(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		WebView b01View=(WebView)findViewById(R.id.webView1);
		b01View.loadUrl(serverip+"/emptybed.html");
			
	}
	
	
	
	
	
	
	
	//Activity invocation for Patient Views
	
	public void getPatientData(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		Intent intent; 
		intent = new Intent(this, PatientDataActivity.class);
	     startActivity(intent); 
			
	}
	
	public void getCharts(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		Intent intent; 
		intent = new Intent(this, ChartsActivity.class);
	     startActivity(intent); 
			
	}
	
	public void getClinicalOrders(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		Intent intent; 
		intent = new Intent(this,ClinicalOrdersActivity.class);
	     startActivity(intent); 
			
	}
	public void getImages(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		Intent intent; 
		intent = new Intent(this, ImagesActivity.class);
	     startActivity(intent); 
			
	}
	public void getLabResults(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		Intent intent; 
		intent = new Intent(this, LabResultsActivity.class);
	     startActivity(intent); 
			
	}
	public void getProgNotes(View v)
	{
		//Toast.makeText(this, "BED 01 DETAILS", 500);
		Intent intent; 
		intent = new Intent(this, ProgressNotesActivity.class);
	     startActivity(intent); 
			
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		WebView b01View=(WebView)findViewById(R.id.webView1);
		b01View.loadUrl(serverip+"/welcome.html");
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
