package com.example.internship_project.Adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.internship_project.DataObject.AWSData;
import com.example.internship_project.R;

import java.util.ArrayList;

public class pinCodeAdapter extends RecyclerView.Adapter<pinCodeAdapter.ViewHolder> {
    private final ArrayList<AWSData> arrayList;
    private final Context context;

    public pinCodeAdapter(ArrayList<AWSData> arrayList, Context context) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.pinlist_item,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idnum.setText(arrayList.get(position).getAwbno());
        holder.pincode.setText(arrayList.get(position).getPincode());
        holder.wgt.setText(arrayList.get(position).getWeight());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView idnum;
        private final TextView pincode;
        private final TextView wgt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idnum = itemView.findViewById(R.id.tvIdNumber);
            pincode = itemView.findViewById(R.id.tvpinCode);
            wgt = itemView.findViewById(R.id.tvWeight);
        }
    }
}