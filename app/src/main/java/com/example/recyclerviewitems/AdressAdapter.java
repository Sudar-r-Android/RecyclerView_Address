package com.example.recyclerviewitems;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdressAdapter extends RecyclerView.Adapter<AdressAdapter.ViewHolder> {
    private Context context;

    public AdressAdapter(Context context){
        this.context=context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adress_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.linearLayout.getLayoutAnimation();


    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
private TextView textView;
private LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayout=itemView.findViewById(R.id.address);

            textView=itemView.findViewById(R.id.sudar);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Sudar Address", Toast.LENGTH_SHORT).show();
                }
            });
            textView=itemView.findViewById(R.id.saran);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Saran Address", Toast.LENGTH_SHORT).show();
                }
            });
            textView=itemView.findViewById(R.id.arun);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Arun Address", Toast.LENGTH_SHORT).show();
                }
            });
            textView=itemView.findViewById(R.id.harris);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Harris Address", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
