package com.counter.tasbeeh.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.counter.tasbeeh.Database.FavouriteAppDatabase;
import com.counter.tasbeeh.Model.Favourite;
import com.counter.tasbeeh.Model.FavouriteDao;
import com.counter.tasbeeh.R;

import java.util.List;

public class myfavadapter extends RecyclerView.Adapter<myfavadapter.myviewholder> {
    List<Favourite> favourite;
    TextView rateview;

    public myfavadapter(List<Favourite> favourite, TextView rateview) {
        this.favourite = favourite;
        this.rateview= rateview;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.favourite_dikar,parent,false);
        return new myviewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull myfavadapter.myviewholder holder, @SuppressLint("RecyclerView") int position) {

        holder.recid.setText(String.valueOf(favourite.get(position).getPid()));

        holder.recpname.setText(favourite.get(position).getPname());

        holder.favdelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
    FavouriteAppDatabase db = Room.databaseBuilder(holder.recid.getContext(),
            FavouriteAppDatabase.class, "cart_dbb").allowMainThreadQueries().build();
    FavouriteDao productDao = db.FavouriteDao();

//    productDao.deleteById(favourite.get(position).getPid());
                int i=favourite.get(position).getPid();

productDao.deleteById(i);

                productDao.deleteById(i);

    favourite.remove(position);

    notifyItemRemoved(position);

                notifyDataSetChanged();


            }

        });

    }

    @Override
    public int getItemCount() {
        return favourite.size();
    }

    public class myviewholder  extends RecyclerView.ViewHolder{

       TextView recid, recpname;
       ImageButton favdelbtn;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            recid=itemView.findViewById(R.id.recid);

            recpname=itemView.findViewById(R.id.recpname);

            favdelbtn=itemView.findViewById(R.id.favdelb);
        }

    }
}
