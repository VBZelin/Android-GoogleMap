package com.example.zelin.geofencing_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button launch_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launch_button = (Button) findViewById(R.id.launch_button);

        launch_button.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.launch_button:
                startActivity(new Intent(this, Android_Test.class));
                break;
        }
    }

}
