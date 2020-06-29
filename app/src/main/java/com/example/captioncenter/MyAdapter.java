package com.example.captioncenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private final String[] data;




    public MyAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.items, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyAdapter.MyViewHolder holder, int position) {

        final String mydata = data[position];
        holder.textView.setText(mydata);
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, mydata);
                intent.setType("text/plain");
                intent = Intent.createChooser(intent, "share by");
                holder.itemView.getContext().startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return data.length;

    }

//private void setBottomAnimation(View view) {
//
//        Animation zoomIn = AnimationUtils.loadAnimation(MyViewHolder, R.anim.item_from_botton);
//        view.startAnimation(zoomIn);
//    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        Button share;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
            share = itemView.findViewById(R.id.share_btn);
        }
    }
}
