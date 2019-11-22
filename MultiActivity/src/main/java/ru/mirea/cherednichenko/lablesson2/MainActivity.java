package ru.mirea.cherednichenko.lablesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickNewActivity(View view) {

        final EditText Text = findViewById(R.id.text);
        String text = Text.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("text", text);
        startActivity(intent);
    }

}
