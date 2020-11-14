package com.example.counter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount =0 ;
    private TextView mShhowCount ;
    static final String STATE_COUNT = "Count";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShhowCount =(TextView) findViewById(R.id.text_count);

    }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mCount=savedInstanceState.getInt(STATE_COUNT);
    }


    public void countUp(View view) {
        ++mCount ;
        if (mShhowCount != null)
            mShhowCount.setText(Integer.toString(mCount));
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_COUNT, mCount);
        super.onSaveInstanceState(savedInstanceState);
    }


}
