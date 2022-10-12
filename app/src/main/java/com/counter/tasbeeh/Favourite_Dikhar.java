package com.counter.tasbeeh;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.counter.tasbeeh.Adapter.myfavadapter;
import com.counter.tasbeeh.Database.FavouriteAppDatabase;
import com.counter.tasbeeh.Model.Favourite;
import com.counter.tasbeeh.Model.FavouriteDao;


import java.util.List;

public class Favourite_Dikhar extends AppCompatActivity {

    RecyclerView recview;

    TextView rateview;

    ImageView image_favourite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_dikhar);
        recview = findViewById(R.id.recview);

        image_favourite=findViewById(R.id.Image_fav);

        getroomdata();
    }

    public void Press(View view) {
    }


    public void goback(View view) {
       onBackPressed();
       finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent i=new Intent(this, Digital_Tasbeeh.class);
        finish();
    }

    public void getroomdata() {
        FavouriteAppDatabase dbb_bd = Room.databaseBuilder(getApplicationContext(),FavouriteAppDatabase.class, "cart_dbb").allowMainThreadQueries().build();

        FavouriteDao favDao = dbb_bd.FavouriteDao();

        recview.setLayoutManager(new LinearLayoutManager(this));

        List<Favourite> favourites = favDao.getallproduct();

        myfavadapter myfavadapter = new myfavadapter(favourites, rateview);

        recview.setAdapter(myfavadapter);

    int k=favourites.size();

    if(k==0){
        image_favourite.setVisibility(View.VISIBLE);
    }
else{
        image_favourite.setVisibility(View.INVISIBLE);
    }


    }
}



