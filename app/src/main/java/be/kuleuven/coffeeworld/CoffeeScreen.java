package be.kuleuven.coffeeworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import be.kuleuven.coffeeworld.MainScreen;
import be.kuleuven.coffeeworld.MapScreen;
import be.kuleuven.coffeeworld.R;

public class CoffeeScreen extends AppCompatActivity {

    private ImageButton MapBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_screen);
        MapBtn = (ImageButton) findViewById(R.id.MapBtn);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
        finish();
    }

   public void onMapBtnClicked(View caller){
        Intent intent = new Intent(this, MapScreen.class);
        startActivity(intent);
    }




}
