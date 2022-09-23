package com.hfad.watch;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    //number of seconds displayed on the watch
    private int seconds = 0;

    //is the watch running?
    private boolean running;

    //recording whether the stop watch was running before the onStop method
    private boolean wasRunning;
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null){
            //retrieve the value of the seconds and running variables from the bundle
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            //restore the state of the wasRunning variable if the activity is re-created
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        runTimer();
    }
    @Override
    //if the activity is stopped, stop the watch
    protected void onPause(){
        super.onPause();
        wasRunning= running;
        running = false;
    }
    @Override
    //if the activity is resumed, start the watch again if it was running previously
    protected void onResume(){
        super.onResume();
        if(wasRunning){
            running = true;
        }
    }
    @Override
    //save tthe state of the watch if its about to be destroyed
    public void onSaveInstanceState(Bundle savedInstanceState){
        //the the values of the seconds and the running variables to bundle
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        //save the state of the was running variable
        savedInstanceState.putBoolean("wasRunning", wasRunning);
    }

    //start the watch when the start button is clicked
    public void onClickStart(View view){
        running = true;
    }
    //stop the watch from running
    public void onClickStop(View view){
        running = false;
    }
    //Reset the watch
    public void onClickReset(View view){
        running = false;
        seconds = 0;
    }
    //setting the number of seconds on the timer
    private void runTimer(){
        final TextView timeView = (TextView) findViewById(R.id.text_view);
        final Handler handler= new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int sec = seconds%60;
                String time = String.format("%d:%02d:%02d", hours, minutes, sec);
                timeView.setText(time);
                if (running){
                    seconds++;
                }
                handler.postDelayed(this, 1000);
            }
        });
    }
}