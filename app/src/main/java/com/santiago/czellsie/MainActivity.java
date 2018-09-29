package com.santiago.czellsie;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Cycle" , "onStart was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Cycle" , "onResume was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Cycle" , "onPause was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Cycle" , "onStop was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Cycle" , "onRestart was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Cycle" , "onDestroy");
    }
    
    public void back(View v){
        Toast.makeText(this, "BACK not available", Toast.LENGTH_SHORT).show();
    }

    public void next(View v){
        Snackbar.make(v, "NEXT not available",Snackbar.LENGTH_SHORT).show();
    }
}
