package com.hfad.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView cardHome;
    CardView cardChat;
    CardView cardWidget;
    CardView cardSettings;
    CardView cardLogout;
    CardView cardPerson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardHome = findViewById(R.id.cardHome);
        cardChat = findViewById(R.id.cardChat);
        cardPerson = findViewById(R.id.cardPerson);
        cardWidget = findViewById(R.id.cardWidget);
        cardSettings = findViewById(R.id.cardSettings);
        cardLogout = findViewById(R.id.cardLogout);

        cardHome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showToast("you have clicked home");
            }
        });
        cardChat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showToast("you have clicked chat");
            }
        });
        cardWidget.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showToast("you have clicked widget");
            }
        });
        cardPerson.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showToast("you have clicked Profile");
            }
        });
        cardSettings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showToast("you have clicked settings");
            }
        });
        cardLogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                showToast("you have clicked logout");
            }
        });

    }
    private void showToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}