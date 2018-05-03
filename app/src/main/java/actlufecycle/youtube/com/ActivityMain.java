package actlufecycle.youtube.com;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.PersistableBundle;
import android.speech.tts.Voice;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityMain extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = ActivityMain.class.getSimpleName();

    //private EditText editTextSampleText;
    private EditText editTextSampleText;
    private TextView sample;

    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "in method onCreate");

        dialog = new ProgressDialog(this);
        dialog.setMessage("Loading.....");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        sample = (TextView) findViewById(R.id.sample);
        editTextSampleText = (EditText) findViewById(R.id.editTextSampleText);

        editTextSampleText.setOnClickListener(this);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "in method onStart");
    }


    int value = 0;

    class Test extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //   dialog.setMessage("Loading..value is ");
            //  dialog.show();

        }

        @Override
        protected Void doInBackground(Void... voids) {
            for (int i = 0; i < 1000022222; i++) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        value++;

                        sample.setText("value is " + value);


                        // Toast.makeText(getApplicationContext(),"value is "+value,Toast.LENGTH_LONG).show();

                    }
                });


            }


            return null;
        }


        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            //  sample.setText("value is "+value);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();


        new Test().execute();
        Log.i(TAG, "in method onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "in method onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "in method onPause");
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
        Log.i(TAG, "in method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "in method onDestroy");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "in method onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "in method onRestoreInstanceState");
    }

    @Override
    public void onClick(View view) {
        AlertDialogBox();

    }

    public void AlertDialogBox() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //Uncomment the below code to Set the message and title from the strings.xml file
        //builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);

        //Setting message manually and performing action on button click
        builder.setMessage("Do you want to close this application ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for 'NO' Button
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.setTitle("AlertDialogExample");
        alert.show();


    }
}
