package com.counter.tasbeeh;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.text.SimpleDateFormat;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Date;

import yuku.ambilwarna.AmbilWarnaDialog;


public class Digital_Tasbeeh extends AppCompatActivity {

    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;

    Button save_link, No, Yes, reset_No, reset_Yes;

    EditText editname, edit_name2;
    int mDefaultColor;

    TextView value, arabic_text;
    AudioManager audioManager;
    int pro_status_hund = 0;

    LinearLayout linearLayout;

    ImageView count_button, save_to_history, reset_it, theme, speaker, no_speaker;

    NavigationView navmenu;

    private SoundPool sp;

    RadioButton radaiobtn;

    private int music;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";

    public String text;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_digital_tasbeeh);
        toolbar = findViewById(R.id.toolbar);
        mDefaultColor = ContextCompat.getColor(Digital_Tasbeeh.this, R.color.text_color_green);
        navmenu = findViewById(R.id.navmenu);

        linearLayout = findViewById(R.id.linearLayout);
        reset_it = findViewById(R.id.reset_it);

        speaker = findViewById(R.id.speaker);

        final MediaPlayer mp = new MediaPlayer();

        radaiobtn = findViewById(R.id.radio1);

        radaiobtn.setChecked(true);

        radaiobtn.setChecked(false);

        no_speaker = findViewById(R.id.no_speaker);

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);


        theme = findViewById(R.id.theme);
        count_button = findViewById(R.id.count_button);
        arabic_text = findViewById(R.id.arabic_word);

        save_to_history = findViewById(R.id.btn_save);

        value = findViewById(R.id.text);
        if(value.getText().toString().equals("")){

            value.setText("0000");

        }
        else{

        }

        sp = new SoundPool(10, AudioManager.STREAM_SYSTEM, 5);
        music = sp.load(this, R.raw.mouse_click, 1);


        drawerLayout = findViewById(R.id.drawerlayout);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);

        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

        navmenu.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menuhistory:
                        Intent intent = new Intent(Digital_Tasbeeh.this, History.class);
                        startActivity(intent);
                        finish();
                        break;

                    case R.id.mentheme:
                        theme();
                        break;

                    case R.id.menufavourite:
                        startActivity(new Intent(Digital_Tasbeeh.this, Favourite_Dikhar.class));
                        finish();

                        break;

                    case R.id.menuremove_add:
                        Toast.makeText(Digital_Tasbeeh.this,"Ads Already Removed", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.menurate_us:
                        Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.sythertech.islamic_app"); // missing 'http://' will cause crashed
                        Intent inten = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(inten);
                        break;

                    case R.id.menushare:
                        Intent inte = new Intent(android.content.Intent.ACTION_SEND);
                        /*The type of the content is text, obviously.*/
                        inte.setType("text/plain");
                        /*Applying information Subject and Body.*/
                        inte.putExtra(android.content.Intent.EXTRA_SUBJECT, "Share the app now");

                        inte.putExtra(android.content.Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.sythertech.islamic_app");


                        startActivity(Intent.createChooser(inte, "https://play.google.com/store/apps/details?id=com.sythertech.islamic_app"));
                        break;
                }

                return false;

            }

        });

        arabic_text.setText("");

        Intent intent = getIntent();

        String Image = intent.getStringExtra("image");

        arabic_text.setText(Image);

        save_to_history.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                goback();

            }
        });

        theme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                theme();
            }
        });
    }

    private void theme() {
//        LayoutInflater inflater = LayoutInflater.from(this);
//        View view = inflater.inflate(R.layout.theme, null);
//
//        AlertDialog alertDialog = new AlertDialog.Builder(Digital_Tasbeeh.this).setView(view).create();
//
//        alertDialog.show();

        AmbilWarnaDialog colorPicker = new AmbilWarnaDialog(this, mDefaultColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {

            ArrayList<String> colors = new ArrayList<>();


            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                mDefaultColor = color;
                linearLayout.setBackgroundColor(mDefaultColor);
            }
        });
        colorPicker.show();

//      final  ColorPicker colorPicker = new ColorPicker(Digital_Tasbeeh.this);
////      colorPicker.
//        colorPicker.setDefaultColorButton(Color.parseColor("#FDFDFD"));
////        colorPicker.setColorButtonSize()
//        ArrayList<String> colors=new ArrayList<>();
//        colors.add("#FFF100");
//        colors.add("#00A1F2");
//        colors.add("#A7F476");
//        colors.add("#000000");
//        colors.add("#EC1C24");
//        colors.add("#006838");
//        colors.add("#7F3F97");
//        colors.add("#14257C");
//        colors.add("#E59B25");
//
//
////        colorPicker.setColors(colors);
////
//    colorPicker.setColorButtonMargin(14,14,14,14);
//
//    colorPicker.setColorButtonDrawable(R.drawable.counter_shape);
//            colorPicker.setColors(colors).setColumns(3).setRoundColorButton(true);
//
////    colorPicker.setColorButtonSize(R.dimen.color_width, R.dimen.color_hieght);
//
////        colorPicker.setRoundColorButton(true);
//        colorPicker.show();
//
//        colorPicker.setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
//            @Override
//            public void onChooseColor(int position,int color) {
//                // put code
//                linearLayout.setBackgroundColor(color);
//
//            }
//
//            @Override
//            public void onCancel(){
//                // put code
//            }
//        });

    }


    public void press(View view) {
        startActivity(new Intent(Digital_Tasbeeh.this, Select_Dhikar.class));
    }

    public void history(View view) {

        Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.sythertech.islamic_app"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void increase_value(View view) {


        if (radaiobtn.isChecked() == true) {


            if(value.getText().toString().equals("")){

                pro_status_hund = 0;

            }
            else{
                pro_status_hund = Integer.parseInt(value.getText().toString());


            }
            pro_status_hund = Integer.parseInt(value.getText().toString());

            pro_status_hund += 1;
            value.setText("" + pro_status_hund);

            count_button.setVisibility(View.VISIBLE);

            if (pro_status_hund == 99999) {
                pro_status_hund = 0;
                value.setText("" + "0");
            } else if (pro_status_hund == 0) {
                count_button.setVisibility(View.INVISIBLE);
            }
        } else if (radaiobtn.isChecked() == false) {

            sp.play(music, 1, 1, 0, 0, 1);

            if(value.getText().toString().equals("")){

                pro_status_hund = 0;

            }
            else{
                pro_status_hund = Integer.parseInt(value.getText().toString());


            }
            pro_status_hund += 1;
            value.setText("" + pro_status_hund);

            count_button.setVisibility(View.VISIBLE);

            if (pro_status_hund == 99999) {
                pro_status_hund = 0;
                value.setText("" + "0");
            } else if (pro_status_hund == 0) {
                count_button.setVisibility(View.INVISIBLE);
            }

        }


    }

    public void goback() {

        LayoutInflater inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.save_to_tasbeeh, null);

        save_link = view.findViewById(R.id.Save_link);

        edit_name2 = (EditText) view.findViewById(R.id.edit_name2);

        AlertDialog alertDialog = new AlertDialog.Builder(this).setView(view).create();

        String count = value.getText().toString();

        editname = view.findViewById(R.id.edit_name);

        edit_name2.setText("" + count);

        save_link.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {

                alertDialog.cancel();
                newalert();

            }
        });

        alertDialog.show();
    }


    public void newalert() {

        LayoutInflater inflater = LayoutInflater.from(Digital_Tasbeeh.this);
        View view = inflater.inflate(R.layout.ask_for_save, null);
        AlertDialog alertDialog = new AlertDialog.Builder(Digital_Tasbeeh.this).setView(view).create();


        No = view.findViewById(R.id.No);
        Yes = view.findViewById(R.id.Yes);

        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.cancel();
            }
        });

        Yes.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {

                Intent in = new Intent(Digital_Tasbeeh.this, Activity_mainfine.class);

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

                Date date = new Date(); // Gregorian date

                String Date = sdf.format(date);

                String arabic_text_next = editname.getText().toString();

                String count = edit_name2.getText().toString();
                if (arabic_text_next.equals("")) {


                    Toast.makeText(Digital_Tasbeeh.this, "Enter the name of Tasbeeh", Toast.LENGTH_SHORT).show();

                    alertDialog.show();

                } else {

                    in.putExtra("arabictext", arabic_text_next);

                    in.putExtra("count", count);

                    in.putExtra("date", Date);

                    startActivity(in);

                    alertDialog.cancel();

                }


                //                String arabic_text_next = editname.getText().toString();



            }

        });

        alertDialog.show();

    }

    public void reset() {

        LayoutInflater inflater = LayoutInflater.from(Digital_Tasbeeh.this);
        View view = inflater.inflate(R.layout.reset, null);

        reset_No = view.findViewById(R.id.reset_No);

        reset_Yes = view.findViewById(R.id.reset_Yes);

        AlertDialog alertDialog = new AlertDialog.Builder(Digital_Tasbeeh.this).setView(view).create();

        reset_No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.cancel();
            }
        });
        reset_Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pro_status_hund = 0;
                value.setText("" + "00000");
                count_button.setVisibility(View.INVISIBLE);
                alertDialog.cancel();
            }
        });

        alertDialog.show();

    }

    public void fav(View view) {
        startActivity(new Intent(this, Favourite_Dikhar.class));
    }

    public void reset_it(View view) {

        reset();

    }

    public void speaker(View view) {

        radaiobtn.setChecked(true);


        no_speaker.setVisibility(View.VISIBLE);

        speaker.setVisibility(View.INVISIBLE);


    }

    public void no_speaker(View view) {
        sp.stop(0);

        radaiobtn.setChecked(false);


        no_speaker.setVisibility(View.INVISIBLE);
        speaker.setVisibility(View.VISIBLE);

    }


    @Override
    protected void onPause() {

        super.onPause();

        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        // write all the data entered by the user in SharedPreference and apply
        myEdit.putString("name", value.getText().toString());
        myEdit.apply();
    }

    protected void onResume() {
        super.onResume();

        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);

        String s1 = sh.getString("name", "0000");

        // Setting the fetched data
        // in the EditTexts
        value.setText(s1);
    }
}