package com.rebrith.netflixremake_1_0.adapters;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rebrith.netflixremake_1_0.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.Holder> {

    private  Context context;

    public MainAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_main, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
holder.bind(context);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class Holder extends  RecyclerView.ViewHolder{

        public Holder(@NonNull View itemView) {
            super(itemView);
        }
        public void bind(Context context){
            TextView txtCategory = itemView.findViewById(R.id.txtCategory_item_view_main);
            txtCategory.setText("Category - "+(getAdapterPosition()+1));
            RecyclerView recyclerView = itemView.findViewById(R.id.rv_item_view_main);

            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            recyclerView.setAdapter(new ItemAdapter());
        }

        }
    }


