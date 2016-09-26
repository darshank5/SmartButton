package com.example.darshank5.smartbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button razorButton = (Button)findViewById(R.id.razorButton);

        razorButton.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        TextView razorTest = (TextView)findViewById(R.id.razorTest);
                        razorTest.setText("Good job Boss!");
                    }
                }
        );

        razorButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    @Override
                    public boolean onLongClick(View v) {
                        TextView razorTest = (TextView)findViewById(R.id.razorTest);
                        razorTest.setText("Holy Crap, that was a Long one");
                        return false;
                    }
                }
        );
    }
}
