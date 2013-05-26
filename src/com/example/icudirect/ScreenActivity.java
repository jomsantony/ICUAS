package com.example.icudirect;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class ScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screen);
	}
	
public void onClick(View v){}
	
	
public void getDemograph(View v){
			
	Toast.makeText(this, "WELCOME TO ICUAS", Toast.LENGTH_SHORT).show();
	Intent intent; 
	intent = new Intent(this, MainActivity.class);
     startActivity(intent);      
     
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_screen, menu);
		return true;
	}

}
