package com.figa.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	public final static String EXTRA_MESSAGE = "com.figa.hello.MESSAGE";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {        
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.main, menu);
    	return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
    	switch(menuItem.getItemId())
    	{
    	case R.id.action_search:
    		return true;
    	case R.id.action_settings:
    		openSettings();
    		return true;
    		default:
    			return super.onOptionsItemSelected(menuItem);
    	}
    }
    
    private void openSettings() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, SettingsActivity.class);
		startActivity(intent);
	}

	public void sendMessage(View view)
    {
    	Intent intent = new Intent(this, DisplayMessageActivity.class);
    	EditText editText = (EditText) findViewById(R.id.edit_message);
    	String message = editText.getText().toString();
    	intent.putExtra(EXTRA_MESSAGE, message);
    	
    	startActivity(intent);
    }
    
}
