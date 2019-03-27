package android.example.minifransizcasozluk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numbersActivity(View view) {
        Intent i=new Intent(MainActivity.this,NumbersActivity.class);
        startActivity(i);
    }

    public void familyActivity(View view) {
        Intent i=new Intent(MainActivity.this,FamilyActivity.class);
        startActivity(i);
    }

    public void colorsActivity(View view) {
    }

    public void phrasesActivity(View view) {
    }
}
