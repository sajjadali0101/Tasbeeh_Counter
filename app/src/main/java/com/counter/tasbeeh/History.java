package com.counter.tasbeeh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.counter.tasbeeh.Adapter.myadapter;
import com.counter.tasbeeh.Database.AppDatabase;
import com.counter.tasbeeh.Model.Product;
import com.counter.tasbeeh.Model.ProductDao;

import java.util.List;

public class History extends AppCompatActivity {

Button save_link, No, Yes;
    RecyclerView recview;
    TextView rateview;
ImageView image_history;
    LinearLayout linearLayout;
    ImageView deleteimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        deleteimage=findViewById(R.id.imagdelete);

image_history=findViewById(R.id.Image_history);

image_history.setVisibility(View.VISIBLE);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "cart_db").allowMainThreadQueries().build();
        ProductDao productDao = db.ProductDao();


            getroomdata();

        deleteimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             clear();
            }
        });

//

    }

    public void clear(){
        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.clear_tasbeeh, null);

        AlertDialog alertDialog = new AlertDialog.Builder(this).setView(view).create();

        No=view.findViewById(R.id.clear_No);

        Yes=view.findViewById(R.id.Clear_Yes);

        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
alertDialog.cancel();
            }
        });

        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                        AppDatabase.class, "cart_db").allowMainThreadQueries().build();
                ProductDao productDao = db.ProductDao();

                productDao.deleteAll();

                Toast.makeText(History.this, "All Item Deleted", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(History.this, Digital_Tasbeeh.class));
                finish();
                alertDialog.cancel();
            }
        });
alertDialog.show();

    }

    public void onBackPressed() {
        super.onBackPressed();

        finish();
    }

    public void getroomdata() {

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "cart_db").allowMainThreadQueries().build();
        ProductDao productDao = db.ProductDao();

        recview = findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        List<Product> products = productDao.getallproduct();

        myadapter adapter = new myadapter(products, rateview);
        recview.setAdapter(adapter);

        int k=products.size();

        if(k==0){
            image_history.setVisibility(View.VISIBLE);

        }
        else{

            image_history.setVisibility(View.INVISIBLE);
        }


//    }
    }


    public void goback(View view) {
      onBackPressed();
        finish();
    }
}