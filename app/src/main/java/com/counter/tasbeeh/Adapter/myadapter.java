package com.counter.tasbeeh.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.counter.tasbeeh.Database.AppDatabase;
import com.counter.tasbeeh.Model.Product;
import com.counter.tasbeeh.Model.ProductDao;
import com.counter.tasbeeh.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder>
{
    List<Product> products;
    TextView rateview;


    public myadapter(List<Product> products, TextView rateview) {
        this.products = products;
        this.rateview= rateview;
    }

    @NonNull
    @NotNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.history,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull myadapter.myviewholder holder, @SuppressLint("RecyclerView") int position) {
       holder.recid.setText(String.valueOf(products.get(position).getPid()));

       holder.recpname.setText(products.get(position).getPname());

       String str=products.get(position).getCount();

       holder.num_count.setText(products.get(position).getCount());

       holder.date.setText(products.get(position).getDate());

       holder.delbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           AppDatabase db = Room.databaseBuilder(holder.recid.getContext(),

                   AppDatabase.class, "cart_db").allowMainThreadQueries().build();

           ProductDao productDao = db.ProductDao();
//
//           productDao.deleteById(products.get(position).getPid());
int i=products.get(position).getPid();


productDao.deleteById(i);
           products.remove(position);
       notifyItemRemoved(position);
               notifyDataSetChanged();

           }
       });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView recid,recpname, num_count,date;

        Button delbtn;

        public myviewholder(@NonNull @NotNull View itemView) {
            super(itemView);
            recid=itemView.findViewById(R.id.recid);

            recpname=itemView.findViewById(R.id.recpname);

         num_count=itemView.findViewById(R.id.recnum_count);

            date=itemView.findViewById(R.id.recDate_count);

            delbtn=itemView.findViewById(R.id.delbtn);

        }

    }

}
