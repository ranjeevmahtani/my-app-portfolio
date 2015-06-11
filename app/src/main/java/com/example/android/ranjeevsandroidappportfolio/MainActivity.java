package com.example.android.ranjeevsandroidappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void launchSpotifyStreamer(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Spotify Streamer App! It isn't ready yet.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void launchScoresApp(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Scores App! It isn't ready yet.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void launchLibraryApp(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Library App! It isn't ready yet.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void launchBuildItBigger(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build It Bigger App! It isn't ready yet.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void launchXYZReader(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my XYZReader App! It isn't ready yet.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void launchMyCapstoneApp(View view)
    {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone App! It isn't ready yet.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

}
