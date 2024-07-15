package com.rebrith.netflixremake_1_0.adapters;


import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rebrith.netflixremake_1_0.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.Holder> {
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_item_adapter, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
holder.bind();
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class Holder extends  RecyclerView.ViewHolder{

        public Holder(@NonNull View itemView) {
            super(itemView);
        }
        public void bind(){
            Button btnRandom = itemView.findViewById(R.id.img_item_view_item_adapter);
            TextView txtLetter = itemView.findViewById(R.id.txtLetter_item_view_item_adapter);
            txtLetter.setText(String.valueOf(generateLetter()));

            //imageView.setImageResource(R.drawable.ic_launcher_foreground);

            Random random = new Random();

            int r = random.nextInt(255);
            int g = random.nextInt(255);
            int b = random.nextInt(255);

            btnRandom.setBackgroundColor(Color.rgb(r,g,b));
        }
    }
    char generateLetter(){
        //65 a 90  ----   25 diferença para pegar de A a Z (Tabela ASCII)
        Random gerador = new Random();
        int getGenerator = gerador.nextInt(25);


        List<Character> charLetters = new ArrayList<Character>();
        for(int i = 65; i< 91; i++){
            charLetters.add((char) i);
        }
        return (char ) charLetters.get(getGenerator);
    }
}


