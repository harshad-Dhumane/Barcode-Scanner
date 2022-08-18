package com.example.internship_project.Adaptor;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.internship_project.EditActivity;
import com.example.internship_project.R;

import java.util.ArrayList;

public class awsAdaptor extends RecyclerView.Adapter<awsAdaptor.ViewHolder> {
    private final ArrayList<String> arrayList;
    private final Context context;

    public awsAdaptor(ArrayList<String> arrayList, Context context) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.awslist_item,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.awsTv.setText(arrayList.get(position));
        holder.awsTv.setOnClickListener(view -> {
            Intent intent = new Intent(context, EditActivity.class);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView awsTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            awsTv = itemView.findViewById(R.id.awsId);
        }
    }
}



