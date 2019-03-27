package android.example.minifransizcasozluk;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final List<Word> words=new ArrayList<>();
        words.add(new Word("un","bir",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("deux","iki",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("trois","üç",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("quatre","dört",R.drawable.number_four,R.raw.number_one));
        words.add(new Word("cinq","beş",R.drawable.number_five,R.raw.number_one));
        words.add(new Word("six","altı",R.drawable.number_six,R.raw.number_one));
        words.add(new Word("sept","yedi",R.drawable.number_seven,R.raw.number_one));
        words.add(new Word("huit","sekiz",R.drawable.number_eight,R.raw.number_one));
        words.add(new Word("neuf","dokuz",R.drawable.number_nine,R.raw.number_one));
        words.add(new Word("dix","on",R.drawable.number_ten,R.raw.number_one));


        WordAdapter adapter=new WordAdapter(NumbersActivity.this,words,R.color.color_numbers);

        ListView liste=(ListView)findViewById(R.id.list);
        liste.setAdapter(adapter);
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(NumbersActivity.this, words.get(position).getMusic());
                mediaPlayer.start();

            }
        });

    }
}
