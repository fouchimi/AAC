package com.social.certificationproject;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ConstraintActivity extends AppCompatActivity {

    private static final String TAG = ConstraintActivity.class.getSimpleName();
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Log.d(TAG, "Constraint hello");
    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        Toast.makeText(context, R.string.toast_message, Toast.LENGTH_LONG).show();
    }

    public void countUp(View view) {
        if(mShowCount != null){
            mCount++;
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
