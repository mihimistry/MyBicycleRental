package com.example.mybicyclerental.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mybicyclerental.R;
import com.example.mybicyclerental.model.BookingModel;

import java.util.List;

public class UpcomingAdapter extends RecyclerView.Adapter<UpcomingAdapter.UpcomingViewHolder> {
     Context context;
     List<BookingModel>list;
     OnBicycleSelectedListener listener;

     public UpcomingAdapter(Context context, List<BookingModel> list) {
        this.context = context;
        this.list = list;
    }
     @NonNull
     @Override
    public UpcomingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View Upcoming= LayoutInflater.from(context).inflate(R.layout.custom_item_view,parent,false);
        return new UpcomingViewHolder(Upcoming);
    }

     @Override
     public void onBindViewHolder(@NonNull UpcomingViewHolder holder, int position) {
         holder.tvname.setText(list.get(position).getBicycleModel().getBicycleName());
         Glide.with(context).load(list.get(position).getBicycleModel().getBicycleImage()).into(holder.imageView);
         holder.btnchoose.setOnClickListener(view -> {
             listener.getSelectedBicycle(list.get(position).getBicycleModel());
         });
     }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UpcomingViewHolder extends RecyclerView.ViewHolder{
         TextView tvname;
         Button btnchoose;
         ImageView imageView;

        public UpcomingViewHolder(@NonNull View Upcoming) {
            super(Upcoming);

            tvname=itemView.findViewById(R.id.tv_text1);
            btnchoose=itemView.findViewById(R.id.btn_choose);
            imageView=itemView.findViewById(R.id.image_item);
        }

    }
}
