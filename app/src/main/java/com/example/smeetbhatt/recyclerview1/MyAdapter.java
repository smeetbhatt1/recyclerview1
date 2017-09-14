package com.example.smeetbhatt.recyclerview1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by smeetbhatt on 13/09/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<ListItem> listItems;
    Context context;

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final ListItem listItem = listItems.get(position);
        holder.head.setText(listItem.getHead());
        holder.desc.setText(listItem.getDesc());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,ItemPageActivity.class);
                i.putExtra("head", listItem.getHead());
                i.putExtra("desc", listItem.getDesc());
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView head;
        TextView desc;
        LinearLayout linearLayout;
        public MyViewHolder(View itemView) {
            super(itemView);
            head = (TextView) itemView.findViewById(R.id.textViewHead);
            desc = (TextView) itemView.findViewById(R.id.textViewDesc );
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout );

        }
    }
}
