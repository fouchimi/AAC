package com.social.certificationproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Log.d(TAG, "Hello Toast Project");
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_second:
                Intent relativeIntent = new Intent(this, RelativeActivity.class);
                startActivity(relativeIntent);
                return true;
            case R.id.action_third:
                Intent constraintIntent = new Intent(this, ConstraintActivity.class);
                startActivity(constraintIntent);
                return true;
            case R.id.action_fourth:
                Intent articleIntent = new Intent(this, ScrollViewActivity.class);
                startActivity(articleIntent);
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }


}
