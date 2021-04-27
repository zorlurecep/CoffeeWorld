package be.kuleuven.coffeeworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class welcomescreen extends AppCompatActivity {
    private Button GetStartedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.welcomescreen);
        GetStartedBtn = (Button) findViewById(R.id.GetStartedBtn);
        getSupportActionBar().hide();
    }

    public void onGetStartedBtnClicked (View caller){
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
        finish();
    }



}