package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Confirm button */
    public void copyText(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        TextView textToReplace = (TextView) findViewById(R.id.helloText);
        textToReplace.setText(message);
    }
}
