package be.kuleuven.coffeeworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class welcomescreen extends AppCompatActivity  {
    private Button GetStartedBtn ;
    private String prevStarted = "yes";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.welcomescreen);
        GetStartedBtn = (Button) findViewById(R.id.GetStartedBtn);

        getSupportActionBar().hide();
    }

    @Override
   protected void onResume() {
        super.onResume();
        SharedPreferences sharedpreferences = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
        if (!sharedpreferences.getBoolean(prevStarted, false)) {
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putBoolean(prevStarted, Boolean.TRUE);
            editor.apply();
        } else {
            moveToMainScreen();
        }
    }

    public void moveToMainScreen(){
        Intent i = new Intent(this, MainScreen.class);
        startActivity(i);
    }

    public void onGetStartedBtnClicked (View caller){
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
        finish();
    }
}