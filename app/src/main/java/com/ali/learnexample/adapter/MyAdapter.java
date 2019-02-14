package com.ali.learnexample.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ali.learnexample.R;
import com.ali.learnexample.activities.DetailsActivity;
import com.ali.learnexample.model.ListItem;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private List listItem;

    public MyAdapter(Context context, List listItem) {
        this.context = context;
        this.listItem = listItem;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row, viewGroup, false);
        return new ViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder viewHolder, int i) {
        ListItem item = (ListItem) listItem.get(i);
        viewHolder.title.setText(item.getTitle());
        viewHolder.desc.setText(item.getDesc());
        viewHolder.txt.setText((item.getTxt()));
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView title;
        private TextView desc;
        private TextView txt;
        private CardView cardView;
        private Context ctx;

        public ViewHolder(@NonNull View itemView, Context context) {
            super(itemView);
            ctx = context;
            title = itemView.findViewById(R.id.tvTitleID);
            desc = itemView.findViewById(R.id.tvDescID);
            txt = itemView.findViewById(R.id.tvTxtID);
            cardView = itemView.findViewById(R.id.cardViewID);
            cardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int pos = getAdapterPosition();
            ListItem item = (ListItem) listItem.get(pos);
            Toast.makeText(ctx, "" + item.getTitle() + "/" + item.getDesc(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(ctx, DetailsActivity.class);
            intent.putExtra("title", item.getTitle());
            intent.putExtra("desc", item.getDesc());
            ctx.startActivity(intent);
        }
    }
}
