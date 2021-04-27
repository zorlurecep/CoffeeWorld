package be.kuleuven.coffeeworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;

public class MainScreen extends AppCompatActivity {

    private ImageButton CappuccinoBtn;
    private ImageButton EspressoBtn;
    private ImageButton FreddoBtn;
    private ImageButton LatteMacciatoBtn;
    private ImageButton MochaBtn;
    private ImageButton CaffeAmericano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        CappuccinoBtn = (ImageButton) findViewById(R.id.CappuccinoBtn);
        EspressoBtn = (ImageButton) findViewById(R.id.EspressoBtn);
        FreddoBtn = (ImageButton) findViewById(R.id.FreddoBtn);
        LatteMacciatoBtn = (ImageButton) findViewById(R.id.LatteMacciatoBtn);
        MochaBtn = (ImageButton) findViewById(R.id.MochaBtn);
        CaffeAmericano = (ImageButton) findViewById(R.id.CaffeAmericanoBtn);
    }

    @Override
    public void onBackPressed() {}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu,menu);
        return true;
    }

    public void onCappuccinoBtnClicked(View caller){
        Intent intent = new Intent(this, CoffeeScreen.class);
        startActivity(intent);
    }

    public void onEspressoBtnClicked(View caller){
        Intent intent = new Intent(this, CoffeeScreen.class);
        startActivity(intent);
    }

    public void onFreddoBtnClicked(View caller){
        Intent intent = new Intent(this, CoffeeScreen.class);
        startActivity(intent);
    }

    public void onLatteMacciatoBtnClicked(View caller){
        Intent intent = new Intent(this, CoffeeScreen.class);
        startActivity(intent);
    }

    public void onMochaBtnClicked(View caller){
        Intent intent = new Intent(this, CoffeeScreen.class);
        startActivity(intent);
    }

    public void onCaffeAmericanoBtnClicked(View caller){
        Intent intent = new Intent(this, CoffeeScreen.class);
        startActivity(intent);
    }
}