package android.example.minifransizcasozluk;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final List<Word> words=new ArrayList<>();
        words.add(new Word("baba", "pere", R.drawable.family_father,R.raw.number_one));
        words.add(new Word("anne", "mere", R.drawable.family_mother,R.raw.number_one));
        words.add(new Word("erkek çocuk", "homme enfant", R.drawable.family_son,R.raw.number_one));
        words.add(new Word("kız çocuk", "fille enfant", R.drawable.family_daughter,R.raw.number_one));
        words.add(new Word("abi", "ugab", R.drawable.family_older_brother,R.raw.number_one));
        words.add(new Word("erkek kardeş", "frere", R.drawable.family_younger_brother,R.raw.number_one));
        words.add(new Word("abla", "soeur", R.drawable.family_older_sister,R.raw.number_one));
        words.add(new Word("kız kardeş", "soeurs", R.drawable.family_younger_sister,R.raw.number_one));
        words.add(new Word("annane ", "grand mere", R.drawable.family_grandmother,R.raw.number_one));
        words.add(new Word("dede", "grand pere", R.drawable.family_grandfather,R.raw.number_one));


        WordAdapter adapter=new WordAdapter(FamilyActivity.this,words,R.color.color_family);

        ListView liste=(ListView)findViewById(R.id.list);
        liste.setAdapter(adapter);
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(FamilyActivity.this, words.get(position).getMusic());
                mediaPlayer.start(); // no need to call prepare(); create() does that for you

            }
        });
    }
}
