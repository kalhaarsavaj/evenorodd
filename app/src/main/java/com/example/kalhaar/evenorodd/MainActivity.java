package com.example.kalhaar.evenorodd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText input;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button)findViewById(R.id.button);
        input = (EditText)findViewById(R.id.number);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (input.length() == 0) {
                    Toast.makeText(MainActivity.this, "Enter any number",
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                int value = Integer.valueOf(input.getText().toString());

                if (value % 2 == 0)
                    Toast.makeText(MainActivity.this, "EVEN NUMBER", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "ODD NUMBER", Toast.LENGTH_LONG).show();
            }



        });



    }

}
