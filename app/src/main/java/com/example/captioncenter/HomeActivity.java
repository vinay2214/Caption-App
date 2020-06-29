package com.example.captioncenter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void attitude(View v) {
        Intent intent = new Intent(this, AttitudeActivity.class);
        startActivity(intent);
    }

    public void scenery(View v) {
        Intent intent = new Intent(this, Scenery.class);
        startActivity(intent);
    }

    public void beach(View v) {
        Intent intent = new Intent(this, Beach.class);
        startActivity(intent);
    }

    public void coffee(View v) {
        Intent intent = new Intent(this, Coffee.class);
        startActivity(intent);
    }

    public void travel(View v) {
        Intent intent = new Intent(this, Travel.class);
        startActivity(intent);
    }

    public void friendship(View v) {
        Intent intent = new Intent(this, Friendship.class);
        startActivity(intent);
    }

    public void birthday(View v) {
        Intent intent = new Intent(this, Birthday.class);
        startActivity(intent);
    }
}
