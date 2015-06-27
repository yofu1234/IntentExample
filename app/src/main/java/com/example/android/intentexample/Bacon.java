package com.example.android.intentexample;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;



public class Bacon extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        Bundle applesData = getIntent().getExtras(); //allow Bacon class to accept info from Apples.java
            if(applesData==null) { //if no text is typed, don't change anything
                return;
            }
            String appleMessage = applesData.getString("appleMessage"); //stores appleMessage in variable
            final TextView baconText = (TextView) findViewById(R.id.baconText); //turns to input on Bacon class activity page
            baconText.setText(appleMessage);
    }

    public void onClick(View view) { //Click starts Apples class
        Intent o = new Intent(this, Apples.class);
        startActivity(o);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bacon, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
