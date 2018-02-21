package com.example.malai_pt1882.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {

        //get the data from the edit text view
        EditText editText = (EditText) findViewById(R.id.editText);
        String text = editText.getText().toString();

        //Make a toast
        if(text.isEmpty()){
            text = "please enter a value";
        }
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }
}
