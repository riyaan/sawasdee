package com.figa.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.TextView;

public class DisplayMessageActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText("Sawasdee Kap, Khun " + message);
		
		setContentView(textView);
	}
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.main, menu);
    	return super.onCreateOptionsMenu(menu);
    }
}
