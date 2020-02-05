package com.example.middaymeal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

   private java.util.List<List> lists;

    public Adapter(java.util.List<List> lists, Context context) {
        this.lists = lists;
        this.context = context;
    }

    private Context context;

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitems,parent,false);
        return  new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        final List list = lists.get(position);
        holder.textViewhead.setText(list.getHead());
        holder.textViewdesc.setText(list.getDesc());
        holder.imageView.setImageResource(list.get(position).getImgId());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "click on item: " + list.getDescription(), Toast.LENGTH_LONG).show();
            }

        });

    }

    @Override
    public int getItemCount() {
        return lists.size();
    }


    public class ViewHolder  extends RecyclerView.ViewHolder{


         public TextView textViewhead;
        public TextView textViewdesc;
        public LinearLayout linearLayout;
        public ImageView imageView;


        public ViewHolder(View itemView){
            super(itemView);

            this.imageView = (ImageView) itemView.findViewById(R.id.imageview);

            textViewhead = (TextView) itemView.findViewById(R.id.textviewhead);
            textViewdesc = (TextView) itemView.findViewById(R.id.textviewdesc);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearlayout);
        }

    }
}
