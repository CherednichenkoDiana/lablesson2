package ru.mirea.cherednichenko.dialog;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        LOL dialogFragment = new LOL ();
        dialogFragment.show(getSupportFragmentManager(), "dialog");
    }
}
