package android.example.minifransizcasozluk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends BaseAdapter {

    Context con;
    List<Word> words;
    int backgroundcolor;

    public WordAdapter(Context con, List<Word> words, int backgroundcolor) {
        this.con = con;
        this.words = words;
        this.backgroundcolor = backgroundcolor;
    }

    @Override
    public int getCount() {
        return words.size();
    }

    @Override
    public Object getItem(int position) {
        return words.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=View.inflate(con,R.layout.list_item,null);
        ImageView image=(ImageView)v.findViewById(R.id.image);
        TextView fransizca=(TextView)v.findViewById(R.id.fransizca);
        TextView turkce=(TextView)v.findViewById(R.id.turkce);
        LinearLayout container=(LinearLayout)v.findViewById(R.id.text_container);

        image.setImageResource(words.get(position).getImage());
        fransizca.setText(words.get(position).getFransizca());
        turkce.setText(words.get(position).getTurkce());
        container.setBackgroundResource(backgroundcolor);

        return v;
    }
}
