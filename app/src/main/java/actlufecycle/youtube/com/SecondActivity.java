package actlufecycle.youtube.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/**
 * Created by shkumari on 5/3/18.
 */

public class SecondActivity extends AppCompatActivity  {

    private static final String TAG=ActivityMain.class.getSimpleName();

    //private EditText editTextSampleText;
    private TextView editTextSampleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG,"in method onCreate2");

//        editTextSampleText = (TextView) findViewById(R.id.editTextSampleText);

//        editTextSampleText.setOnClickListener(this);

        //editTextSampleText=(EditText)findViewById(R.id.editTextSampleText);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"in method onStart2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"in method onResume2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"in method onRestart2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"in method onPause2");
    }

    /*@Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"in method onSaveInstanceState");
        outState.putString("samplekey",editTextSampleText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"in method onRestoreInstanceState");
        editTextSampleText.setText(savedInstanceState.getString("samplekey"));
    }*/

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"in method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"in method onDestroy");
    }


}
