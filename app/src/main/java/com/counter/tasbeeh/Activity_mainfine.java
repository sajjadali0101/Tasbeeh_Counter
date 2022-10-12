package com.counter.tasbeeh;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.counter.tasbeeh.Database.AppDatabase;
import com.counter.tasbeeh.Model.Product;
import com.counter.tasbeeh.Model.ProductDao;

import java.util.List;

public class Activity_mainfine extends AppCompatActivity {
    EditText t1,t2,t3,t4;
    Button b1,b2;
    TextView lbl;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainfine);
        int i = 0;

        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);

//        b1=findViewById(R.id.b1);

        Intent intent = getIntent();

        String text = intent.getStringExtra("arabictext");

        String count= intent.getStringExtra("count");

        int count_count=Integer.parseInt(count);

        String Date= intent.getStringExtra("date");

        String[] split = Date.split("", 10);

        String s9=split[9];
        String s8=split[8];
        String s7=split[7];
        String s6=split[6];
        String s4=split[4];
        String s3=split[3];

        String s2=split[1];
        String s1=split[0];

        String day=s1+s2;

        String mon=s3+s4;

        String yea=s6+s7+s8+s9;

        int datee=Integer.parseInt(day);
        int month=Integer.parseInt(mon);
        int year=Integer.parseInt(yea);

        if(month==1){
            month=month*200;


        }else if(month==2){

            month=month*60;

        }

        else if(month==3){

            month=month*30;

        }else if(month==4){

            month=month*25;

        }else if(month==5){

            month=month*15;

        }else if(month==6){

            month=month*10;
        }else if(month==7){

            month=month*6;
        }else if(month==8){

            month=month*5;

        }else if(month==9){

            month=month*4;
        }else if(month==10){

            month=month*3;
        }else if(month==11){

            month=month*2;
        }else if(month==12){

            month=month*1;
        }
        int l=(year-month)-datee;

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "cart_db").allowMainThreadQueries().build();

        ProductDao productDao = db.ProductDao();

        List<Product> products = productDao.getallproduct();

        int k=products.size();

            k++;
          i=l-k;


        t3.setText(count);

        t2.setText(text);

        t4.setText(Date);

        t1.setText(""+ i);

//        AppDatabase db= Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"cart_db").allowMainThreadQueries()
//                .fallbackToDestructiveMigration().build();
//        ProductDao productDao=db.ProductDao();

//        int num=productDao.is_exist(Integer.parseInt(t1.getText().toString()));

//        if(num!=0){
//            Toast.makeText(this, "enter another card id", Toast.LENGTH_SHORT).show();
//
//        } else{
////                Boolean check=productDao.is_exist(Integer.parseInt(t1.getText().toString()));
//                if(check==false)
//                {
            int pid=Integer.parseInt(t1.getText().toString());

            String pname=t2.getText().toString();

            String count_int=t3.getText().toString();

            String date=t4.getText().toString();

//            Boolean check=productDao.is_exist(Integer.parseInt())

            productDao.insertrecord(new Product(pid,pname,count_int,date));

            t1.setText("");

            t2.setText("");

            t3.setText("");

            t4.setText("");
//                    lbl.setText("Product Inserted Successfully");
//                }
//                else
//                {
//                    t1.setText("");
//                    t2.setText("");
//                    t3.setText("");
//                    t4.setText("");
//                    lbl.setText("Product Already in Cart");
//        }
        startActivity(new Intent(this,History.class));
        finish();
    }


}