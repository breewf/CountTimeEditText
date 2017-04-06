package com.ghy.timeedittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ghy.counttimeedittext.CountTimeEditText;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private CountTimeEditText mCountTimeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textView);
        mCountTimeEditText = (CountTimeEditText) findViewById(R.id.time_edit_text);

        mCountTimeEditText.setEnterTimeCountListener(new CountTimeEditText.EnterTimeCountCallBack() {
            @Override
            public void inputTime(int inputTime) {
                mTextView.setText("本次输入时长：" + inputTime + "s");
            }
        });

    }
}
