package ru.mirea.cherednichenko.lablesson2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        final TextView textView = findViewById(R.id.key);

        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){
            String Text = arguments.get("text").toString();
            textView.setText(Text);
            }
        }

    public void onClickNewActivity(View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

}
