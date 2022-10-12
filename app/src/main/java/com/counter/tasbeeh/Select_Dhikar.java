package com.counter.tasbeeh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.counter.tasbeeh.Database.FavouriteAppDatabase;
import com.counter.tasbeeh.Model.Favourite;
import com.counter.tasbeeh.Model.FavouriteDao;

import java.util.Random;

public class Select_Dhikar extends AppCompatActivity {
    TextView azeem, Subhan_Allah,Wabihumdi,alhumdulillah,Allah_huakbar,lahulawalaquwata,Wabihumdihi,SheeinQadir,lailahaillahhu,Astagfirullah,Astagfirullah_2,sallahlahu,Bismillahhi,Astagfirullah_rabi,Rabigfirli,ZanubiKala,AllahhumainiAoozbika,Allahhumamagfirli;
    TextView recid,recid2,recid3,recid4,recid5,recid6,recid7,recid8,recid9,recid10,recid11,recid12,recid13,recid14,recid15,recid16,recid17,recid18,
            recid101,recid102,recid103,recid104,recid105,recid106,recid107,recid108,recid109,recid110,recid111,recid112,recid113,recid114,recid115,recid116,recid117,recid118,
    recid119,recid120,recid121,recid122,recid123,recid124,recid125,recid126,recid127,recid128,recid129,recid130,recid131,recid132,recid133,recid134,recid135,recid136,recid137,recid138,
            recid139,recid140,recid141,recid142,recid143,recid144,recid145,recid146,recid147,recid148,recid149,recid150,recid151,recid152,recid153,recid154,recid155,recid156,recid157,recid158,
            recid159, recid160,recid161,recid162,recid163,recid164,recid165,recid166,recid167,recid168, recid170, recid169,recid171,recid172,recid173,recid174,recid175,recid176,recid177,recid178,
            recid179,recid180,recid181,recid182,recid183,recid184,recid185,recid186,recid187,recid188,recid189,recid190,recid191,recid192,recid193,recid194,recid195,recid196,recid197,recid198,recid199;





    ImageView addtofav, btn_fav,btn_fav2,btn_fav3,btn_fav4,btn_fav5,btn_fav6,btn_fav7,btn_fav8,btn_fav9,btn_fav10,btn_fav11,btn_fav12,btn_fav13,btn_fav14,btn_fav15,btn_fav16,btn_fav17,btn_fav18,addtofav2,addtofav3,addtofav4,addtofav5,addtofav6,addtofav7,addtofav8,addtofav9,addtofav10,addtofav11,addtofav12,addtofav13,addtofav14,addtofav15,addtofav16,addtofav17,addtofav18;
         ImageView   btn_fav101, btn_fav102,btn_fav103,btn_fav104,btn_fav105,btn_fav106,btn_fav107,btn_fav108,btn_fav109,btn_fav110
                 ,btn_fav111,btn_fav112,btn_fav113,btn_fav114,btn_fav115,btn_fav116,btn_fav117,btn_fav118,btn_fav119, btn_fav120
                 ,btn_fav121,btn_fav122,btn_fav123,btn_fav125,btn_fav126,btn_fav127,btn_fav128,btn_fav129,btn_fav130,
                 btn_fav131,btn_fav134,btn_fav124, btn_fav135,btn_fav136,btn_fav137,btn_fav138,btn_fav139,btn_fav132, btn_fav133,
                 btn_fav140,btn_fav144,btn_fav145,btn_fav146,btn_fav147,btn_fav148,btn_fav149,btn_fav150,btn_fav141,btn_fav142,btn_fav143,
                 btn_fav154,btn_fav155,btn_fav156,btn_fav157,btn_fav158,btn_fav159,btn_fav151, btn_fav152,btn_fav153,
                 btn_fav160,btn_fav161,btn_fav162,btn_fav163,btn_fav164,btn_fav165,btn_fav166,btn_fav167,btn_fav168,btn_fav169,
                 btn_fav170,btn_fav171, btn_fav172,btn_fav173,btn_fav174,btn_fav175,btn_fav176,btn_fav177,btn_fav178,btn_fav189,
                 btn_fav180,btn_fav181,btn_fav182,btn_fav183,btn_fav184,btn_fav185,btn_fav186,btn_fav187,btn_fav188,
                 btn_fav190, btn_fav191, btn_fav192,btn_fav193,btn_fav194,btn_fav195,btn_fav196,btn_fav197,btn_fav198,btn_fav199,btn_fav179;


 ImageView  addtofav101,  addtofav102, addtofav103, addtofav104, addtofav105, addtofav106, addtofav107, addtofav108, addtofav109, addtofav110 ,
         addtofav111 , addtofav112 , addtofav113 , addtofav114 , addtofav115 , addtofav116 , addtofav117 , addtofav118 , addtofav119 , addtofav120
         ,addtofav121,addtofav122,addtofav123,addtofav124,addtofav125,addtofav126,addtofav127,addtofav128,addtofav129,addtofav130,
         addtofav131,addtofav132,addtofav133,addtofav134,addtofav135,addtofav136,addtofav137,addtofav138,addtofav139,addtofav140,

    addtofav141,addtofav142,addtofav143,addtofav144,addtofav145,addtofav146,addtofav147,addtofav148,addtofav149,addtofav150,

    addtofav151,addtofav152,addtofav153,addtofav154,addtofav155,addtofav156,addtofav157,addtofav158,addtofav159,addtofav160,

    addtofav161,addtofav162,addtofav163,addtofav164,addtofav165,addtofav166,addtofav167,addtofav168,addtofav169,addtofav170,

    addtofav171,addtofav172,addtofav173,addtofav174,addtofav175,addtofav176,addtofav177,addtofav178,addtofav179,addtofav180,

    addtofav181,addtofav182,addtofav183,addtofav184,addtofav185,addtofav186,addtofav187,addtofav188,addtofav189,addtofav190,

    addtofav191,addtofav192,addtofav193,addtofav194,addtofav195,addtofav196,addtofav197,addtofav198,addtofav199;



    TextView Allah_name101,Allah_name102,Allah_name103,Allah_name104,Allah_name105,Allah_name106,Allah_name107,Allah_name108,Allah_name1090,Allah_name110,Allah_name111,Allah_name112,

            Allah_name113,Allah_name114,Allah_name115,Allah_name116,Allah_name117,Allah_name118,Allah_name119,Allah_name120,
            Allah_name1210,Allah_name122,Allah_name123,Allah_name124,Allah_name125,Allah_name126,Allah_name127,Allah_name128,Allah_name129,Allah_name130,
            Allah_name131,Allah_name132,Allah_name133,Allah_name134,Allah_name135,Allah_name136,Allah_name137,Allah_name138,Allah_name139,
            Allah_name140,Allah_name141,Allah_name142,Allah_name143,Allah_name144,Allah_name145,Allah_name146,Allah_name147,Allah_name148,Allah_name149,Allah_name150,
    Allah_name151,Allah_name152,Allah_name153,Allah_name154,Allah_name155,Allah_name156,Allah_name157,Allah_name158,Allah_name159,Allah_name160,
            Allah_name161,Allah_name162,Allah_name163,Allah_name164,Allah_name165,Allah_name166,Allah_name167,Allah_name168,Allah_name169,Allah_name170,
            Allah_name171,Allah_name172,Allah_name173,Allah_name174,Allah_name175,Allah_name176,Allah_name177,Allah_name178,Allah_name179,Allah_name180,
            Allah_name181,Allah_name182,Allah_name183,Allah_name184,Allah_name185,Allah_name186,Allah_name187,Allah_name188,Allah_name189,Allah_name190,
            Allah_name191,Allah_name192,Allah_name193,Allah_name194,Allah_name195,Allah_name196,Allah_name197,Allah_name198,Allah_name199;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_dhikar);

        Allah_name101=findViewById(R.id.Allah_name101);

        Allah_name102=findViewById(R.id.Allah_name102);
        Allah_name103=findViewById(R.id.Allah_name103);
        Allah_name104=findViewById(R.id.Allah_name104);
        Allah_name105=findViewById(R.id.Allah_name105);
        Allah_name106=findViewById(R.id.Allah_name106);
        Allah_name107=findViewById(R.id.Allah_name107);
        Allah_name108=findViewById(R.id.Allah_name108);
        Allah_name1090=findViewById(R.id.Allah_name1090);
        Allah_name110=findViewById(R.id.Allah_name110);
        Allah_name111=findViewById(R.id.Allah_name111);
        Allah_name112=findViewById(R.id.Allah_name112);
        Allah_name113=findViewById(R.id.Allah_name113);
        Allah_name114=findViewById(R.id.Allah_name114);
        Allah_name115=findViewById(R.id.Allah_name115);
        Allah_name116=findViewById(R.id.Allah_name116);
        Allah_name117=findViewById(R.id.Allah_name117);
        Allah_name118=findViewById(R.id.Allah_name118);
        Allah_name119=findViewById(R.id.Allah_name119);

        Allah_name1210=findViewById(R.id.Allah_name1210);
        Allah_name122=findViewById(R.id.Allah_name122);
        Allah_name123=findViewById(R.id.Allah_name123);
        Allah_name124=findViewById(R.id.Allah_name124);
        Allah_name125=findViewById(R.id.Allah_name125);
        Allah_name126=findViewById(R.id.Allah_name126);
        Allah_name127=findViewById(R.id.Allah_name127);
        Allah_name128=findViewById(R.id.Allah_name128);
        Allah_name129=findViewById(R.id.Allah_name129);
        Allah_name130=findViewById(R.id.Allah_name130);
        Allah_name131=findViewById(R.id.Allah_name131);
        Allah_name132=findViewById(R.id.Allah_name132);
        Allah_name133=findViewById(R.id.Allah_name133);
        Allah_name134=findViewById(R.id.Allah_name134);
        Allah_name135=findViewById(R.id.Allah_name135);
        Allah_name136=findViewById(R.id.Allah_name136);
        Allah_name137=findViewById(R.id.Allah_name137);
        Allah_name138=findViewById(R.id.Allah_name138);
        Allah_name139=findViewById(R.id.Allah_name139);
        Allah_name140=findViewById(R.id.Allah_name140);
//        Allah_name141=findViewById(R.id.Allah_name141);
        Allah_name142=findViewById(R.id.Allah_name142);
        Allah_name143=findViewById(R.id.Allah_name143);
        Allah_name144=findViewById(R.id.Allah_name144);
        Allah_name145=findViewById(R.id.Allah_name145);
        Allah_name146=findViewById(R.id.Allah_name146);
        Allah_name147=findViewById(R.id.Allah_name147);
        Allah_name148=findViewById(R.id.Allah_name148);
        Allah_name149=findViewById(R.id.Allah_name149);
        Allah_name150=findViewById(R.id.Allah_name150);
        Allah_name151=findViewById(R.id.Allah_name151);
        Allah_name152=findViewById(R.id.Allah_name152);
        Allah_name153=findViewById(R.id.Allah_name153);
        Allah_name154=findViewById(R.id.Allah_name154);
        Allah_name155=findViewById(R.id.Allah_name155);
        Allah_name156=findViewById(R.id.Allah_name156);
        Allah_name157=findViewById(R.id.Allah_name157);
        Allah_name158=findViewById(R.id.Allah_name158);
        Allah_name159=findViewById(R.id.Allah_name159);
        Allah_name160=findViewById(R.id.Allah_name160);

        Allah_name161=findViewById(R.id.Allah_name161);

        Allah_name162=findViewById(R.id.Allah_name162);

        Allah_name163=findViewById(R.id.Allah_name163);
        Allah_name164=findViewById(R.id.Allah_name164);

        Allah_name165=findViewById(R.id.Allah_name165);

        Allah_name166=findViewById(R.id.allah_name166);

        Allah_name167=findViewById(R.id.Allah_name167);

        Allah_name168=findViewById(R.id.allah_name168);
        Allah_name169=findViewById(R.id.allah_name169);

        Allah_name170=findViewById(R.id.allah_name170);
        Allah_name171=findViewById(R.id.allah_name171);
        Allah_name172=findViewById(R.id.allah_name172);
        Allah_name173=findViewById(R.id.allah_name173);
        Allah_name174=findViewById(R.id.allah_name174);
        Allah_name175=findViewById(R.id.allah_name175);
        Allah_name176=findViewById(R.id.allah_name176);
        Allah_name177=findViewById(R.id.allah_name177);
        Allah_name178=findViewById(R.id.allah_name178);
        Allah_name179=findViewById(R.id.allah_name179);
        Allah_name181=findViewById(R.id.allah_name181);
        Allah_name182=findViewById(R.id.allah_name182);
        Allah_name183=findViewById(R.id.allah_name183);
        Allah_name184=findViewById(R.id.allah_name184);
        Allah_name185=findViewById(R.id.allah_name185);
        Allah_name186=findViewById(R.id.allah_name186);
        Allah_name187=findViewById(R.id.allah_name187);
        Allah_name188=findViewById(R.id.allah_name188);
        Allah_name189=findViewById(R.id.allah_name189);
        Allah_name190=findViewById(R.id.allah_name190);
        Allah_name191=findViewById(R.id.allah_name191);

        Allah_name192=findViewById(R.id.allah_name192);
        Allah_name193=findViewById(R.id.allah_name193);
        Allah_name194=findViewById(R.id.allah_name194);
        Allah_name195=findViewById(R.id.allah_name195);
        Allah_name196=findViewById(R.id.allah_name196);
        Allah_name197=findViewById(R.id.allah_name197);
        Allah_name198=findViewById(R.id.allah_name198);
        Allah_name199=findViewById(R.id.allah_name199);





        btn_fav= findViewById(R.id.btn_fav);
        azeem = findViewById(R.id.azeem);

        Subhan_Allah=findViewById(R.id.Subhan_Allah);

        Wabihumdi=findViewById(R.id.Wabihumdi);

        Allah_huakbar=findViewById(R.id.Allah_huakbar);

        lahulawalaquwata=findViewById(R.id.lahulawalaquwata);

        Wabihumdihi=findViewById(R.id.Wabihumdihi);

        alhumdulillah=findViewById(R.id.alhumdulillah);

        Astagfirullah_rabi=findViewById(R.id.Astagfirullah_rabi);

        SheeinQadir=findViewById(R.id.SheeinQadir);

        lailahaillahhu=findViewById(R.id.lailahaillahhu);

        Astagfirullah=findViewById(R.id.Astagfirullah);


        Astagfirullah_2=findViewById(R.id.Astagfirullah_2);


        sallahlahu=findViewById(R.id.sallahlahu);


        Bismillahhi=findViewById(R.id.Bismillahhi);


        Rabigfirli=findViewById(R.id.Rabigfirli);

        AllahhumainiAoozbika=findViewById(R.id.AllahhumainiAoozbika);

        recid=findViewById(R.id.recid);

        recid2=findViewById(R.id.recid2);
        recid3=findViewById(R.id.recid3);
        recid4=findViewById(R.id.recid4);
        recid5=findViewById(R.id.recid5);
        recid6=findViewById(R.id.recid6);
        recid7=findViewById(R.id.recid7);
        recid8=findViewById(R.id.recid8);
        recid9=findViewById(R.id.recid9);
        recid10=findViewById(R.id.recid10);
        recid11=findViewById(R.id.recid11);
        recid12=findViewById(R.id.recid12);
        recid13=findViewById(R.id.recid13);

        recid14=findViewById(R.id.recid14);
        recid15=findViewById(R.id.recid15);
        recid16=findViewById(R.id.recid16);

        recid17=findViewById(R.id.recid17);
        recid18=findViewById(R.id.recid18);



        recid101=findViewById(R.id.recid101);


        recid101=findViewById(R.id.recid102);
        recid102=findViewById(R.id.recid103);
        recid103=findViewById(R.id.recid104);
        recid104=findViewById(R.id.recid105);
        recid105=findViewById(R.id.recid106);
        recid106=findViewById(R.id.recid107);
        recid107=findViewById(R.id.recid108);
        recid108=findViewById(R.id.recid109);
        recid109=findViewById(R.id.recid110);

        recid110=findViewById(R.id.recid110);

        recid111=findViewById(R.id.recid111);
        recid112=findViewById(R.id.recid112);
        recid113=findViewById(R.id.recid113);
        recid114=findViewById(R.id.recid114);
        recid115=findViewById(R.id.recid115);
        recid116=findViewById(R.id.recid116);
        recid117=findViewById(R.id.recid117);
        recid118=findViewById(R.id.recid118);
        recid119=findViewById(R.id.recid119);
        recid120=findViewById(R.id.recid120);
        recid121=findViewById(R.id.recid121);
        recid122=findViewById(R.id.recid122);
        recid123=findViewById(R.id.recid123);
        recid124=findViewById(R.id.recid124);
        recid125=findViewById(R.id.recid125);
        recid126=findViewById(R.id.recid126);
        recid127=findViewById(R.id.recid127);
        recid128=findViewById(R.id.recid128);
        recid129=findViewById(R.id.recid129);
        recid130=findViewById(R.id.recid130);
        recid131=findViewById(R.id.recid131);
        recid132=findViewById(R.id.recid132);
        recid133=findViewById(R.id.recid133);
        recid134=findViewById(R.id.recid134);
        recid135=findViewById(R.id.recid135);
        recid136=findViewById(R.id.recid136);
        recid137=findViewById(R.id.recid137);
        recid138=findViewById(R.id.recid138);
        recid139=findViewById(R.id.recid139);
        recid140=findViewById(R.id.recid140);
        recid141=findViewById(R.id.recid140);
        recid142=findViewById(R.id.recid142);
        recid143=findViewById(R.id.recid143);
        recid144=findViewById(R.id.recid144);
        recid145=findViewById(R.id.recid145);
        recid146=findViewById(R.id.recid146);
        recid147=findViewById(R.id.recid147);
        recid148=findViewById(R.id.recid148);
        recid149=findViewById(R.id.recid149);
        recid150=findViewById(R.id.recid150);
        recid151=findViewById(R.id.recid151);
        recid152=findViewById(R.id.recid152);
        recid153=findViewById(R.id.recid153);
        recid154=findViewById(R.id.recid154);
        recid155=findViewById(R.id.recid155);
        recid156=findViewById(R.id.recid156);
        recid157=findViewById(R.id.recid157);
        recid158=findViewById(R.id.recid158);
        recid159=findViewById(R.id.recid159);
        recid160=findViewById(R.id.recid160);
        recid161=findViewById(R.id.recid161);
        recid162=findViewById(R.id.recid162);
        recid163=findViewById(R.id.recid163);
        recid164=findViewById(R.id.recid164);
        recid165=findViewById(R.id.recid165);
        recid166=findViewById(R.id.recid166);
        recid167=findViewById(R.id.recid167);
        recid168=findViewById(R.id.recid168);
        recid169=findViewById(R.id.recid169);
        recid170=findViewById(R.id.recid170);
        recid171=findViewById(R.id.recid171);
        recid172=findViewById(R.id.recid172);
        recid173=findViewById(R.id.recid173);
        recid174=findViewById(R.id.recid174);
        recid175=findViewById(R.id.recid175);
        recid176=findViewById(R.id.recid176);
        recid177=findViewById(R.id.recid177);
        recid178=findViewById(R.id.recid178);
        recid179=findViewById(R.id.recid179);
        recid180=findViewById(R.id.recid180);
        recid181=findViewById(R.id.recid181);
        recid182=findViewById(R.id.recid182);
        recid183=findViewById(R.id.recid183);
        recid184=findViewById(R.id.recid184);
        recid185=findViewById(R.id.recid185);
        recid186=findViewById(R.id.recid186);
        recid187=findViewById(R.id.recid187);
        recid188=findViewById(R.id.recid188);
        recid189=findViewById(R.id.recid189);
        recid190=findViewById(R.id.recid190);
        recid191=findViewById(R.id.recid191);
        recid192=findViewById(R.id.recid192);
        recid193=findViewById(R.id.recid193);
        recid194=findViewById(R.id.recid194);
        recid195=findViewById(R.id.recid195);
        recid196=findViewById(R.id.recid196);
        recid197=findViewById(R.id.recid197);
        recid198=findViewById(R.id.recid198);
        recid199=findViewById(R.id.recid199);

        ZanubiKala=findViewById(R.id.ZanubiKala);

        Allahhumamagfirli=findViewById(R.id.Allahhumamagfirli);

        addtofav = findViewById(R.id.btn_unfav);

        addtofav2 = findViewById(R.id.btn_unfav2);
        addtofav3 = findViewById(R.id.btn_unfav3);
        addtofav4 = findViewById(R.id.btn_unfav4);
        addtofav5 = findViewById(R.id.btn_unfav5);
        addtofav6 = findViewById(R.id.btn_unfav6);
        addtofav7 = findViewById(R.id.btn_unfav7);
        addtofav8 = findViewById(R.id.btn_unfav8);
        addtofav9 = findViewById(R.id.btn_unfav9);
        addtofav10 = findViewById(R.id.btn_unfav10);
        addtofav11 = findViewById(R.id.btn_unfav11);
        addtofav12 = findViewById(R.id.btn_unfav12);
        addtofav13 = findViewById(R.id.btn_unfav13);
        addtofav14 = findViewById(R.id.btn_unfav14);
        addtofav15 = findViewById(R.id.btn_unfav15);
        addtofav16 = findViewById(R.id.btn_unfav16);
        addtofav17 = findViewById(R.id.btn_unfav17);
        addtofav18 = findViewById(R.id.btn_unfav18);

        btn_fav2 = findViewById(R.id.btn_fav2);
        btn_fav3 = findViewById(R.id.btn_fav3);
        btn_fav4 = findViewById(R.id.btn_fav4);
        btn_fav5 = findViewById(R.id.btn_fav5);
        btn_fav6 = findViewById(R.id.btn_fav6);
        btn_fav7 = findViewById(R.id.btn_fav7);
        btn_fav8 = findViewById(R.id.btn_fav8);
        btn_fav9 = findViewById(R.id.btn_fav9);
        btn_fav10 = findViewById(R.id.btn_fav10);
        btn_fav11 = findViewById(R.id.btn_fav11);
        btn_fav12 = findViewById(R.id.btn_fav12);
        btn_fav13 = findViewById(R.id.btn_fav13);
        btn_fav14 = findViewById(R.id.btn_fav14);
        btn_fav15 = findViewById(R.id.btn_fav15);
        btn_fav16 = findViewById(R.id.btn_fav16);
        btn_fav17 = findViewById(R.id.btn_fav17);
        btn_fav18 = findViewById(R.id.btn_fav18);

        addtofav101=findViewById(R.id.btn_unfav101);
        addtofav103=findViewById(R.id.btn_unfav103);
        addtofav104=findViewById(R.id.btn_unfav104);
        addtofav105=findViewById(R.id.btn_unfav105);
        addtofav106=findViewById(R.id.btn_unfav106);
        addtofav102=findViewById(R.id.btn_unfav102);
        addtofav107=findViewById(R.id.btn_unfav107);
        addtofav108=findViewById(R.id.btn_unfav108);
        addtofav109=findViewById(R.id.btn_unfav109);
        addtofav110=findViewById(R.id.btn_unfav110);
        addtofav111=findViewById(R.id.btn_unfav111);
        addtofav112=findViewById(R.id.btn_unfav112);
        addtofav113=findViewById(R.id.btn_unfav113);
        addtofav114=findViewById(R.id.btn_unfav114);
        addtofav115=findViewById(R.id.btn_unfav115);
        addtofav116=findViewById(R.id.btn_unfav116);
        addtofav117=findViewById(R.id.btn_unfav117);
        addtofav118=findViewById(R.id.btn_unfav118);
        addtofav119=findViewById(R.id.btn_unfav119);
        addtofav120=findViewById(R.id.btn_unfav120);
        addtofav121=findViewById(R.id.btn_unfav121);
        addtofav122=findViewById(R.id.btn_unfav122);
        addtofav123=findViewById(R.id.btn_unfav123);
        addtofav124=findViewById(R.id.btn_unfav124);
        addtofav125=findViewById(R.id.btn_unfav125);
        addtofav126=findViewById(R.id.btn_unfav126);
        addtofav127=findViewById(R.id.btn_unfav127);
        addtofav128=findViewById(R.id.btn_unfav128);
        addtofav129=findViewById(R.id.btn_unfav129);
        addtofav130=findViewById(R.id.btn_unfav130);
        addtofav131=findViewById(R.id.btn_unfav131);
        addtofav132=findViewById(R.id.btn_unfav132);
        addtofav133=findViewById(R.id.btn_unfav133);
        addtofav134=findViewById(R.id.btn_unfav134);
        addtofav135=findViewById(R.id.btn_unfav135);
        addtofav136=findViewById(R.id.btn_unfav136);
        addtofav137=findViewById(R.id.btn_unfav137);
        addtofav138=findViewById(R.id.btn_unfav138);
        addtofav139=findViewById(R.id.btn_unfav139);
        addtofav140=findViewById(R.id.btn_unfav140);

        addtofav142=findViewById(R.id.btn_unfav142);

        addtofav143=findViewById(R.id.btn_unfav143);
        addtofav144=findViewById(R.id.btn_unfav144);
        addtofav145=findViewById(R.id.btn_unfav145);
        addtofav146=findViewById(R.id.btn_unfav146);
        addtofav147=findViewById(R.id.btn_unfav147);
        addtofav148=findViewById(R.id.btn_unfav148);
        addtofav149=findViewById(R.id.btn_unfav149);
        addtofav150=findViewById(R.id.btn_unfav150);
        addtofav151=findViewById(R.id.btn_unfav151);
        addtofav152=findViewById(R.id.btn_unfav152);
        addtofav153=findViewById(R.id.btn_unfav153);

        addtofav154=findViewById(R.id.btn_unfav154);
        addtofav155=findViewById(R.id.btn_unfav155);
        addtofav156=findViewById(R.id.btn_unfav156);
        addtofav157=findViewById(R.id.btn_unfav157);
        addtofav158=findViewById(R.id.btn_unfav158);
        addtofav159=findViewById(R.id.btn_unfav159);
        addtofav160=findViewById(R.id.btn_unfav160);
        addtofav161=findViewById(R.id.btn_unfav161);
        addtofav162=findViewById(R.id.btn_unfav162);
        addtofav163=findViewById(R.id.btn_unfav163);
        addtofav164=findViewById(R.id.btn_unfav164);
        addtofav165=findViewById(R.id.btn_unfav165);
        addtofav166=findViewById(R.id.btn_unfav166);
        addtofav167=findViewById(R.id.btn_unfav167);
        addtofav168=findViewById(R.id.btn_unfav168);
        addtofav169=findViewById(R.id.btn_unfav169);
        addtofav170=findViewById(R.id.btn_unfav170);
        addtofav171=findViewById(R.id.btn_unfav171);
        addtofav172=findViewById(R.id.btn_unfav172);
        addtofav173=findViewById(R.id.btn_unfav173);
        addtofav174=findViewById(R.id.btn_unfav174);
        addtofav175=findViewById(R.id.btn_unfav175);
        addtofav176=findViewById(R.id.btn_unfav176);
        addtofav177=findViewById(R.id.btn_unfav177);
        addtofav178=findViewById(R.id.btn_unfav178);
        addtofav179=findViewById(R.id.btn_unfav179);
        addtofav180=findViewById(R.id.btn_unfav180);
        addtofav181=findViewById(R.id.btn_unfav181);
        addtofav182=findViewById(R.id.btn_unfav182);
        addtofav183=findViewById(R.id.btn_unfav183);
        addtofav184=findViewById(R.id.btn_unfav184);
        addtofav185=findViewById(R.id.btn_unfav185);
        addtofav186=findViewById(R.id.btn_unfav186);
        addtofav187=findViewById(R.id.btn_unfav187);
        addtofav188=findViewById(R.id.btn_unfav188);
        addtofav189=findViewById(R.id.btn_unfav189);
        addtofav190=findViewById(R.id.btn_unfav190);
        addtofav191=findViewById(R.id.btn_unfav191);
        addtofav192=findViewById(R.id.btn_unfav192);
        addtofav193=findViewById(R.id.btn_unfav193);
        addtofav194=findViewById(R.id.btn_unfav194);
        addtofav195=findViewById(R.id.btn_unfav195);
        addtofav196=findViewById(R.id.btn_unfav196);
        addtofav197=findViewById(R.id.btn_unfav197);
        addtofav198=findViewById(R.id.btn_unfav198);
        addtofav199=findViewById(R.id.btn_unfav199);
        btn_fav101=findViewById(R.id.btn_fav101);
        btn_fav103=findViewById(R.id.btn_fav103);
        btn_fav104=findViewById(R.id.btn_fav104);
        btn_fav105=findViewById(R.id.btn_fav105);
        btn_fav106=findViewById(R.id.btn_fav106);
        btn_fav102=findViewById(R.id.btn_fav102);
        btn_fav107=findViewById(R.id.btn_fav107);
        btn_fav108=findViewById(R.id.btn_fav108);
        btn_fav109=findViewById(R.id.btn_fav109);
        btn_fav110=findViewById(R.id.btn_fav110);
        btn_fav111=findViewById(R.id.btn_fav111);
        btn_fav112=findViewById(R.id.btn_fav112);
        btn_fav113=findViewById(R.id.btn_fav113);
        btn_fav114=findViewById(R.id.btn_fav114);
        btn_fav115=findViewById(R.id.btn_fav115);
        btn_fav116=findViewById(R.id.btn_fav116);
        btn_fav117=findViewById(R.id.btn_fav117);
        btn_fav118=findViewById(R.id.btn_fav118);
        btn_fav119=findViewById(R.id.btn_fav119);
        btn_fav120=findViewById(R.id.btn_fav120);
        btn_fav121=findViewById(R.id.btn_fav121);
        btn_fav122=findViewById(R.id.btn_fav122);
        btn_fav123=findViewById(R.id.btn_fav123);
        btn_fav124=findViewById(R.id.btn_fav124);
        btn_fav125=findViewById(R.id.btn_fav125);
        btn_fav126=findViewById(R.id.btn_fav126);
        btn_fav127=findViewById(R.id.btn_fav127);
        btn_fav128=findViewById(R.id.btn_fav128);
        btn_fav129=findViewById(R.id.btn_fav129);
        btn_fav130=findViewById(R.id.btn_fav130);
        btn_fav131=findViewById(R.id.btn_fav131);
        btn_fav132=findViewById(R.id.btn_fav132);
        btn_fav133=findViewById(R.id.btn_fav133);
        btn_fav134=findViewById(R.id.btn_fav134);
        btn_fav135=findViewById(R.id.btn_fav135);
        btn_fav136=findViewById(R.id.btn_fav136);
        btn_fav137=findViewById(R.id.btn_fav137);
        btn_fav138=findViewById(R.id.btn_fav138);
        btn_fav139=findViewById(R.id.btn_fav139);
        btn_fav140=findViewById(R.id.btn_fav140);
        btn_fav141=findViewById(R.id.btn_fav140);
        btn_fav142=findViewById(R.id.btn_fav142);

        btn_fav143=findViewById(R.id.btn_fav143);
        btn_fav144=findViewById(R.id.btn_fav144);
        btn_fav145=findViewById(R.id.btn_fav145);
        btn_fav146=findViewById(R.id.btn_fav146);
        btn_fav147=findViewById(R.id.btn_fav147);
        btn_fav148=findViewById(R.id.btn_fav148);
        btn_fav149=findViewById(R.id.btn_fav149);
        btn_fav150=findViewById(R.id.btn_fav150);
        btn_fav151=findViewById(R.id.btn_fav151);
        btn_fav152=findViewById(R.id.btn_fav152);
        btn_fav153=findViewById(R.id.btn_fav153);

        btn_fav154=findViewById(R.id.btn_fav154);
        btn_fav155=findViewById(R.id.btn_fav155);
        btn_fav156=findViewById(R.id.btn_fav156);
        btn_fav157=findViewById(R.id.btn_fav157);
        btn_fav158=findViewById(R.id.btn_fav158);
        btn_fav159=findViewById(R.id.btn_fav159);
        btn_fav160=findViewById(R.id.btn_fav160);
        btn_fav161=findViewById(R.id.btn_fav161);
        btn_fav162=findViewById(R.id.btn_fav162);
        btn_fav163=findViewById(R.id.btn_fav163);
        btn_fav164=findViewById(R.id.btn_fav164);
        btn_fav165=findViewById(R.id.btn_fav165);
        btn_fav166=findViewById(R.id.btn_fav166);
        btn_fav167=findViewById(R.id.btn_fav167);
        btn_fav168=findViewById(R.id.btn_fav168);
        btn_fav169=findViewById(R.id.btn_fav169);
        btn_fav170=findViewById(R.id.btn_fav170);
        btn_fav171=findViewById(R.id.btn_fav171);
        btn_fav172=findViewById(R.id.btn_fav172);
        btn_fav173=findViewById(R.id.btn_fav173);
        btn_fav174=findViewById(R.id.btn_fav174);
        btn_fav175=findViewById(R.id.btn_fav175);
        btn_fav176=findViewById(R.id.btn_fav176);
        btn_fav177=findViewById(R.id.btn_fav177);
        btn_fav178=findViewById(R.id.btn_fav178);
        btn_fav179=findViewById(R.id.btn_fav179);
        btn_fav180=findViewById(R.id.btn_fav180);
        btn_fav181=findViewById(R.id.btn_fav181);
        btn_fav182=findViewById(R.id.btn_fav182);
        btn_fav183=findViewById(R.id.btn_fav183);
        btn_fav184=findViewById(R.id.btn_fav184);
        btn_fav185=findViewById(R.id.btn_fav185);
        btn_fav186=findViewById(R.id.btn_fav186);
        btn_fav187=findViewById(R.id.btn_fav187);
        btn_fav188=findViewById(R.id.btn_fav188);
        btn_fav189=findViewById(R.id.btn_fav189);
        btn_fav190=findViewById(R.id.btn_fav190);
        btn_fav191=findViewById(R.id.btn_fav191);
        btn_fav192=findViewById(R.id.btn_fav192);
        btn_fav193=findViewById(R.id.btn_fav193);
        btn_fav194=findViewById(R.id.btn_fav194);
        btn_fav195=findViewById(R.id.btn_fav195);
        btn_fav196=findViewById(R.id.btn_fav196);
        btn_fav197=findViewById(R.id.btn_fav197);
        btn_fav198=findViewById(R.id.btn_fav198);
        btn_fav199=findViewById(R.id.btn_fav199);





        recid = findViewById(R.id.recid);

        FavouriteAppDatabase dbb_bd = Room.databaseBuilder(getApplicationContext(), FavouriteAppDatabase.class, "cart_dbb").allowMainThreadQueries()
                .fallbackToDestructiveMigration().build();
        FavouriteDao favouriteDao = dbb_bd.FavouriteDao();

        Boolean check = favouriteDao.is_exist(Integer.parseInt(recid.getText().toString()));

        if(check==false){

            btn_fav.setVisibility(View.INVISIBLE);
            addtofav.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav.setVisibility(View.VISIBLE);
            addtofav.setVisibility(View.INVISIBLE);

        }

        Boolean check2 = favouriteDao.is_exist(Integer.parseInt(recid2.getText().toString()));

        if(check2==false){

            btn_fav2.setVisibility(View.INVISIBLE);
            addtofav2.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav2.setVisibility(View.VISIBLE);
            addtofav2.setVisibility(View.INVISIBLE);

        }



        Boolean check3 = favouriteDao.is_exist(Integer.parseInt(recid3.getText().toString()));

        if(check3==false){

            btn_fav3.setVisibility(View.INVISIBLE);
            addtofav3.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav3.setVisibility(View.VISIBLE);
            addtofav3.setVisibility(View.INVISIBLE);

        }


        Boolean check4 = favouriteDao.is_exist(Integer.parseInt(recid4.getText().toString()));

        if(check4==false){

            btn_fav4.setVisibility(View.INVISIBLE);
            addtofav4.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav4.setVisibility(View.VISIBLE);
            addtofav4.setVisibility(View.INVISIBLE);

        }


        Boolean check5 = favouriteDao.is_exist(Integer.parseInt(recid5.getText().toString()));

        if(check5==false){

            btn_fav5.setVisibility(View.INVISIBLE);
            addtofav5.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav5.setVisibility(View.VISIBLE);
            addtofav5.setVisibility(View.INVISIBLE);

        }


        Boolean check6 = favouriteDao.is_exist(Integer.parseInt(recid6.getText().toString()));

        if(check6==false){

            btn_fav6.setVisibility(View.INVISIBLE);
            addtofav6.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav6.setVisibility(View.VISIBLE);
            addtofav6.setVisibility(View.INVISIBLE);

        }


        Boolean check7 = favouriteDao.is_exist(Integer.parseInt(recid7.getText().toString()));

        if(check7==false){

            btn_fav7.setVisibility(View.INVISIBLE);
            addtofav7.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav7.setVisibility(View.VISIBLE);
            addtofav7.setVisibility(View.INVISIBLE);

        }


        Boolean check8 = favouriteDao.is_exist(Integer.parseInt(recid8.getText().toString()));

        if(check8==false){

            btn_fav8.setVisibility(View.INVISIBLE);
            addtofav8.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav8.setVisibility(View.VISIBLE);
            addtofav8.setVisibility(View.INVISIBLE);

        }

        Boolean check9 = favouriteDao.is_exist(Integer.parseInt(recid9.getText().toString()));

        if(check9==false){

            btn_fav9.setVisibility(View.INVISIBLE);
            addtofav9.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav9.setVisibility(View.VISIBLE);
            addtofav9.setVisibility(View.INVISIBLE);

        }

        Boolean check10 = favouriteDao.is_exist(Integer.parseInt(recid10.getText().toString()));

        if(check10==false){

            btn_fav10.setVisibility(View.INVISIBLE);
            addtofav10.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav10.setVisibility(View.VISIBLE);
            addtofav10.setVisibility(View.INVISIBLE);

        }

        Boolean check11 = favouriteDao.is_exist(Integer.parseInt(recid11.getText().toString()));

        if(check11==false){

            btn_fav11.setVisibility(View.INVISIBLE);
            addtofav11.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav11.setVisibility(View.VISIBLE);
            addtofav11.setVisibility(View.INVISIBLE);

        }

        Boolean check12 = favouriteDao.is_exist(Integer.parseInt(recid12.getText().toString()));

        if(check12==false){

            btn_fav12.setVisibility(View.INVISIBLE);
            addtofav12.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav12.setVisibility(View.VISIBLE);
            addtofav12.setVisibility(View.INVISIBLE);

        }

        Boolean check13 = favouriteDao.is_exist(Integer.parseInt(recid13.getText().toString()));

        if(check13==false){

            btn_fav13.setVisibility(View.INVISIBLE);
            addtofav13.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav13.setVisibility(View.VISIBLE);
            addtofav13.setVisibility(View.INVISIBLE);

        }

        Boolean check14 = favouriteDao.is_exist(Integer.parseInt(recid14.getText().toString()));

        if(check14==false){

            btn_fav14.setVisibility(View.INVISIBLE);
            addtofav14.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav14.setVisibility(View.VISIBLE);
            addtofav14.setVisibility(View.INVISIBLE);

        }

        Boolean check15 = favouriteDao.is_exist(Integer.parseInt(recid15.getText().toString()));

        if(check15==false){

            btn_fav15.setVisibility(View.INVISIBLE);
            addtofav15.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav15.setVisibility(View.VISIBLE);
            addtofav15.setVisibility(View.INVISIBLE);

        }

        Boolean check16 = favouriteDao.is_exist(Integer.parseInt(recid16.getText().toString()));

        if(check16==false){

            btn_fav16.setVisibility(View.INVISIBLE);
            addtofav16.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav16.setVisibility(View.VISIBLE);
            addtofav16.setVisibility(View.INVISIBLE);

        }

        Boolean check17 = favouriteDao.is_exist(Integer.parseInt(recid17.getText().toString()));

        if(check17==false){

            btn_fav17.setVisibility(View.INVISIBLE);
            addtofav17.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav17.setVisibility(View.VISIBLE);
            addtofav17.setVisibility(View.INVISIBLE);

        }

        Boolean check18 = favouriteDao.is_exist(Integer.parseInt(recid18.getText().toString()));

        if(check18==false){

            btn_fav18.setVisibility(View.INVISIBLE);
            addtofav18.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav18.setVisibility(View.VISIBLE);
            addtofav18.setVisibility(View.INVISIBLE);

        }


//        Boolean check = favouriteDao.is_exist(Integer.parseInt(recid.getText().toString()));
//        if(check==true) {
//
//        }else{
//
//        }

        Boolean check101 = favouriteDao.is_exist(Integer.parseInt(recid101.getText().toString()));

        if(check101==false){

            btn_fav101.setVisibility(View.INVISIBLE);
            addtofav101.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav101.setVisibility(View.VISIBLE);
            addtofav101.setVisibility(View.INVISIBLE);

        }
        Boolean check102 = favouriteDao.is_exist(Integer.parseInt(recid102.getText().toString()));

        if(check102==false){

            btn_fav102.setVisibility(View.INVISIBLE);
            addtofav102.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav102.setVisibility(View.VISIBLE);
            addtofav102.setVisibility(View.INVISIBLE);

        }        Boolean check103 = favouriteDao.is_exist(Integer.parseInt(recid103.getText().toString()));

        if(check103==false){

            btn_fav103.setVisibility(View.INVISIBLE);
            addtofav103.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav103.setVisibility(View.VISIBLE);
            addtofav103.setVisibility(View.INVISIBLE);

        }        Boolean check104 = favouriteDao.is_exist(Integer.parseInt(recid104.getText().toString()));

        if(check104==false){

            btn_fav104.setVisibility(View.INVISIBLE);
            addtofav104.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav104.setVisibility(View.VISIBLE);
            addtofav104.setVisibility(View.INVISIBLE);

        }        Boolean check105 = favouriteDao.is_exist(Integer.parseInt(recid105.getText().toString()));

        if(check105==false){

            btn_fav105.setVisibility(View.INVISIBLE);
            addtofav105.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav105.setVisibility(View.VISIBLE);
            addtofav105.setVisibility(View.INVISIBLE);

        }        Boolean check106 = favouriteDao.is_exist(Integer.parseInt(recid106.getText().toString()));

        if(check106==false){

            btn_fav106.setVisibility(View.INVISIBLE);
            addtofav106.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav106.setVisibility(View.VISIBLE);
            addtofav106.setVisibility(View.INVISIBLE);

        }        Boolean check107 = favouriteDao.is_exist(Integer.parseInt(recid107.getText().toString()));

        if(check107==false){

            btn_fav107.setVisibility(View.INVISIBLE);
            addtofav107.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav107.setVisibility(View.VISIBLE);
            addtofav107.setVisibility(View.INVISIBLE);

        }        Boolean check108 = favouriteDao.is_exist(Integer.parseInt(recid108.getText().toString()));

        if(check108==false){

            btn_fav108.setVisibility(View.INVISIBLE);
            addtofav108.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav108.setVisibility(View.VISIBLE);
            addtofav108.setVisibility(View.INVISIBLE);

        }        Boolean check109 = favouriteDao.is_exist(Integer.parseInt(recid109.getText().toString()));

        if(check109==false){

            btn_fav109.setVisibility(View.INVISIBLE);
            addtofav109.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav109.setVisibility(View.VISIBLE);
            addtofav109.setVisibility(View.INVISIBLE);

        }

        Boolean check110 = favouriteDao.is_exist(Integer.parseInt(recid110.getText().toString()));

        if(check110==false){

            btn_fav110.setVisibility(View.INVISIBLE);
            addtofav110.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav110.setVisibility(View.VISIBLE);
            addtofav110.setVisibility(View.INVISIBLE);

        }


        Boolean check111 = favouriteDao.is_exist(Integer.parseInt(recid111.getText().toString()));

        if(check111==false){

            btn_fav111.setVisibility(View.INVISIBLE);
            addtofav111.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav111.setVisibility(View.VISIBLE);
            addtofav111.setVisibility(View.INVISIBLE);

        }

        Boolean check112 = favouriteDao.is_exist(Integer.parseInt(recid112.getText().toString()));

        if(check112==false){

            btn_fav112.setVisibility(View.INVISIBLE);
            addtofav112.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav112.setVisibility(View.VISIBLE);
            addtofav112.setVisibility(View.INVISIBLE);

        }

        Boolean check113 = favouriteDao.is_exist(Integer.parseInt(recid113.getText().toString()));

        if(check113==false){

            btn_fav113.setVisibility(View.INVISIBLE);
            addtofav113.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav113.setVisibility(View.VISIBLE);
            addtofav113.setVisibility(View.INVISIBLE);

        }

        Boolean check114 = favouriteDao.is_exist(Integer.parseInt(recid114.getText().toString()));

        if(check114==false){

            btn_fav114.setVisibility(View.INVISIBLE);
            addtofav114.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav114.setVisibility(View.VISIBLE);
            addtofav114.setVisibility(View.INVISIBLE);

        }

        Boolean check115 = favouriteDao.is_exist(Integer.parseInt(recid115.getText().toString()));

        if(check115==false){

            btn_fav115.setVisibility(View.INVISIBLE);
            addtofav115.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav115.setVisibility(View.VISIBLE);
            addtofav115.setVisibility(View.INVISIBLE);

        }

        Boolean check116 = favouriteDao.is_exist(Integer.parseInt(recid116.getText().toString()));

        if(check116==false){

            btn_fav116.setVisibility(View.INVISIBLE);
            addtofav116.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav116.setVisibility(View.VISIBLE);
            addtofav116.setVisibility(View.INVISIBLE);

        }

        Boolean check117 = favouriteDao.is_exist(Integer.parseInt(recid117.getText().toString()));

        if(check117==false){

            btn_fav117.setVisibility(View.INVISIBLE);
            addtofav117.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav117.setVisibility(View.VISIBLE);
            addtofav117.setVisibility(View.INVISIBLE);

        }

        Boolean check118 = favouriteDao.is_exist(Integer.parseInt(recid118.getText().toString()));

        if(check118==false){

            btn_fav118.setVisibility(View.INVISIBLE);
            addtofav118.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav118.setVisibility(View.VISIBLE);
            addtofav118.setVisibility(View.INVISIBLE);

        }

        Boolean check119 = favouriteDao.is_exist(Integer.parseInt(recid119.getText().toString()));

        if(check119==false){

            btn_fav119.setVisibility(View.INVISIBLE);
            addtofav119.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav119.setVisibility(View.VISIBLE);
            addtofav119.setVisibility(View.INVISIBLE);

        }

        Boolean check120 = favouriteDao.is_exist(Integer.parseInt(recid120.getText().toString()));

        if(check120==false){

            btn_fav120.setVisibility(View.INVISIBLE);
            addtofav120.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav120.setVisibility(View.VISIBLE);
            addtofav120.setVisibility(View.INVISIBLE);

        }

        Boolean check121 = favouriteDao.is_exist(Integer.parseInt(recid121.getText().toString()));

        if(check121==false){

            btn_fav121.setVisibility(View.INVISIBLE);
            addtofav121.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav121.setVisibility(View.VISIBLE);
            addtofav121.setVisibility(View.INVISIBLE);

        }
        Boolean check122 = favouriteDao.is_exist(Integer.parseInt(recid122.getText().toString()));

        if(check122==false){

            btn_fav122.setVisibility(View.INVISIBLE);
            addtofav122.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav122.setVisibility(View.VISIBLE);
            addtofav122.setVisibility(View.INVISIBLE);

        }
        Boolean check123 = favouriteDao.is_exist(Integer.parseInt(recid123.getText().toString()));

        if(check123==false){

            btn_fav123.setVisibility(View.INVISIBLE);
            addtofav123.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav123.setVisibility(View.VISIBLE);
            addtofav123.setVisibility(View.INVISIBLE);

        }
        Boolean check124 = favouriteDao.is_exist(Integer.parseInt(recid124.getText().toString()));

        if(check124==false){

            btn_fav124.setVisibility(View.INVISIBLE);
            addtofav124.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav124.setVisibility(View.VISIBLE);
            addtofav124.setVisibility(View.INVISIBLE);

        }
        Boolean check125 = favouriteDao.is_exist(Integer.parseInt(recid125.getText().toString()));

        if(check125==false){

            btn_fav125.setVisibility(View.INVISIBLE);
            addtofav125.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav125.setVisibility(View.VISIBLE);
            addtofav125.setVisibility(View.INVISIBLE);

        }
        Boolean check126 = favouriteDao.is_exist(Integer.parseInt(recid126.getText().toString()));

        if(check126==false){

            btn_fav126.setVisibility(View.INVISIBLE);
            addtofav126.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav126.setVisibility(View.VISIBLE);
            addtofav126.setVisibility(View.INVISIBLE);

        }
        Boolean check127 = favouriteDao.is_exist(Integer.parseInt(recid127.getText().toString()));

        if(check120==false){

            btn_fav127.setVisibility(View.INVISIBLE);
            addtofav127.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav127.setVisibility(View.VISIBLE);
            addtofav127.setVisibility(View.INVISIBLE);

        }
        Boolean check128 = favouriteDao.is_exist(Integer.parseInt(recid128.getText().toString()));

        if(check128==false){

            btn_fav128.setVisibility(View.INVISIBLE);
            addtofav128.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav128.setVisibility(View.VISIBLE);
            addtofav128.setVisibility(View.INVISIBLE);

        }
        Boolean check129 = favouriteDao.is_exist(Integer.parseInt(recid129.getText().toString()));

        if(check129==false){

            btn_fav129.setVisibility(View.INVISIBLE);
            addtofav129.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav129.setVisibility(View.VISIBLE);
            addtofav129.setVisibility(View.INVISIBLE);

        }
        Boolean check130 = favouriteDao.is_exist(Integer.parseInt(recid130.getText().toString()));

        if(check130==false){

            btn_fav130.setVisibility(View.INVISIBLE);
            addtofav130.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav130.setVisibility(View.VISIBLE);
            addtofav130.setVisibility(View.INVISIBLE);

        }
        Boolean check131 = favouriteDao.is_exist(Integer.parseInt(recid131.getText().toString()));

        if(check131==false){

            btn_fav131.setVisibility(View.INVISIBLE);
            addtofav131.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav131.setVisibility(View.VISIBLE);
            addtofav131.setVisibility(View.INVISIBLE);

        }


        Boolean check132 = favouriteDao.is_exist(Integer.parseInt(recid132.getText().toString()));

        if(check132==false){

            btn_fav132.setVisibility(View.INVISIBLE);
            addtofav132.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav132.setVisibility(View.VISIBLE);
            addtofav132.setVisibility(View.INVISIBLE);

        }


        Boolean check133 = favouriteDao.is_exist(Integer.parseInt(recid133.getText().toString()));

        if(check133==false){

            btn_fav133.setVisibility(View.INVISIBLE);
            addtofav133.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav133.setVisibility(View.VISIBLE);
            addtofav133.setVisibility(View.INVISIBLE);

        }


        Boolean check134 = favouriteDao.is_exist(Integer.parseInt(recid134.getText().toString()));

        if(check134==false){

            btn_fav134.setVisibility(View.INVISIBLE);
            addtofav134.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav134.setVisibility(View.VISIBLE);
            addtofav134.setVisibility(View.INVISIBLE);

        }


        Boolean check135 = favouriteDao.is_exist(Integer.parseInt(recid135.getText().toString()));

        if(check135==false){

            btn_fav135.setVisibility(View.INVISIBLE);
            addtofav135.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav135.setVisibility(View.VISIBLE);
            addtofav135.setVisibility(View.INVISIBLE);

        }


        Boolean check136 = favouriteDao.is_exist(Integer.parseInt(recid136.getText().toString()));

        if(check136==false){

            btn_fav136.setVisibility(View.INVISIBLE);
            addtofav136.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav136.setVisibility(View.VISIBLE);
            addtofav136.setVisibility(View.INVISIBLE);

        }


        Boolean check137 = favouriteDao.is_exist(Integer.parseInt(recid137.getText().toString()));

        if(check137==false){

            btn_fav137.setVisibility(View.INVISIBLE);
            addtofav137.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav138.setVisibility(View.VISIBLE);
            addtofav138.setVisibility(View.INVISIBLE);

        }


        Boolean check139 = favouriteDao.is_exist(Integer.parseInt(recid138.getText().toString()));

        if(check139==false){

            btn_fav139.setVisibility(View.INVISIBLE);
            addtofav139.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav139.setVisibility(View.VISIBLE);
            addtofav139.setVisibility(View.INVISIBLE);

        }





        Boolean check140 = favouriteDao.is_exist(Integer.parseInt(recid140.getText().toString()));

        if(check140==false){

            btn_fav140.setVisibility(View.INVISIBLE);
            addtofav140.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav140.setVisibility(View.VISIBLE);
            addtofav140.setVisibility(View.INVISIBLE);

        }


//        Boolean check141 = favouriteDao.is_exist(Integer.parseInt(recid141.getText().toString()));
//
//        if(check141==false){
//
//            btn_fav141.setVisibility(View.INVISIBLE);
//            addtofav141.setVisibility(View.VISIBLE);
//
//        }
//        else{
//
//            btn_fav141.setVisibility(View.VISIBLE);
//            addtofav141.setVisibility(View.INVISIBLE);
//
//        }


        Boolean check142 = favouriteDao.is_exist(Integer.parseInt(recid142.getText().toString()));

        if(check142==false){

            btn_fav142.setVisibility(View.INVISIBLE);
            addtofav142.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav142.setVisibility(View.VISIBLE);
            addtofav142.setVisibility(View.INVISIBLE);

        }


        Boolean check143 = favouriteDao.is_exist(Integer.parseInt(recid143.getText().toString()));

        if(check143==false){

            btn_fav143.setVisibility(View.INVISIBLE);
            addtofav143.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav143.setVisibility(View.VISIBLE);
            addtofav143.setVisibility(View.INVISIBLE);

        }


        Boolean check144 = favouriteDao.is_exist(Integer.parseInt(recid144.getText().toString()));

        if(check144==false){

            btn_fav144.setVisibility(View.INVISIBLE);
            addtofav144.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav144.setVisibility(View.VISIBLE);
            addtofav144.setVisibility(View.INVISIBLE);

        }


        Boolean check145 = favouriteDao.is_exist(Integer.parseInt(recid145.getText().toString()));

        if(check145==false){

            btn_fav145.setVisibility(View.INVISIBLE);
            addtofav145.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav145.setVisibility(View.VISIBLE);
            addtofav145.setVisibility(View.INVISIBLE);

        }


        Boolean check146 = favouriteDao.is_exist(Integer.parseInt(recid146.getText().toString()));

        if(check146==false){

            btn_fav146.setVisibility(View.INVISIBLE);
            addtofav146.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav146.setVisibility(View.VISIBLE);
            addtofav146.setVisibility(View.INVISIBLE);

        }


        Boolean check147 = favouriteDao.is_exist(Integer.parseInt(recid147.getText().toString()));

        if(check147==false){

            btn_fav147.setVisibility(View.INVISIBLE);
            addtofav147.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav147.setVisibility(View.VISIBLE);
            addtofav147.setVisibility(View.INVISIBLE);

        }  Boolean check148 = favouriteDao.is_exist(Integer.parseInt(recid148.getText().toString()));

        if(check148==false){

            btn_fav148.setVisibility(View.INVISIBLE);
            addtofav148.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav148.setVisibility(View.VISIBLE);
            addtofav148.setVisibility(View.INVISIBLE);

        }  Boolean check149 = favouriteDao.is_exist(Integer.parseInt(recid149.getText().toString()));

        if(check149==false){

            btn_fav149.setVisibility(View.INVISIBLE);
            addtofav149.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav149.setVisibility(View.VISIBLE);
            addtofav149.setVisibility(View.INVISIBLE);

        }  Boolean check150 = favouriteDao.is_exist(Integer.parseInt(recid150.getText().toString()));

        if(check150==false){

            btn_fav150.setVisibility(View.INVISIBLE);
            addtofav150.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav150.setVisibility(View.VISIBLE);
            addtofav150.setVisibility(View.INVISIBLE);

        }


        Boolean check151 = favouriteDao.is_exist(Integer.parseInt(recid151.getText().toString()));

        if(check151==false){

            btn_fav151.setVisibility(View.INVISIBLE);
            addtofav151.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav151.setVisibility(View.VISIBLE);
            addtofav151.setVisibility(View.INVISIBLE);

        }

        Boolean check152 = favouriteDao.is_exist(Integer.parseInt(recid152.getText().toString()));

        if(check152==false){

            btn_fav152.setVisibility(View.INVISIBLE);
            addtofav152.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav152.setVisibility(View.VISIBLE);
            addtofav152.setVisibility(View.INVISIBLE);

        }

        Boolean check153 = favouriteDao.is_exist(Integer.parseInt(recid153.getText().toString()));

        if(check153==false){

            btn_fav153.setVisibility(View.INVISIBLE);
            addtofav153.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav153.setVisibility(View.VISIBLE);
            addtofav153.setVisibility(View.INVISIBLE);

        }

        Boolean check154 = favouriteDao.is_exist(Integer.parseInt(recid154.getText().toString()));

        if(check154==false){

            btn_fav154.setVisibility(View.INVISIBLE);
            addtofav154.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav155.setVisibility(View.VISIBLE);
            addtofav155.setVisibility(View.INVISIBLE);

        }

        Boolean check156 = favouriteDao.is_exist(Integer.parseInt(recid156.getText().toString()));

        if(check156==false){

            btn_fav156.setVisibility(View.INVISIBLE);
            addtofav156.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav156.setVisibility(View.VISIBLE);
            addtofav156.setVisibility(View.INVISIBLE);

        }

        Boolean check157 = favouriteDao.is_exist(Integer.parseInt(recid157.getText().toString()));

        if(check157==false){

            btn_fav157.setVisibility(View.INVISIBLE);
            addtofav157.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav157.setVisibility(View.VISIBLE);
            addtofav157.setVisibility(View.INVISIBLE);

        }

        Boolean check158 = favouriteDao.is_exist(Integer.parseInt(recid158.getText().toString()));

        if(check158==false){

            btn_fav158.setVisibility(View.INVISIBLE);
            addtofav158.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav158.setVisibility(View.VISIBLE);
            addtofav158.setVisibility(View.INVISIBLE);

        }

        Boolean check159 = favouriteDao.is_exist(Integer.parseInt(recid159.getText().toString()));

        if(check159==false){

            btn_fav159.setVisibility(View.INVISIBLE);
            addtofav159.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav159.setVisibility(View.VISIBLE);
            addtofav159.setVisibility(View.INVISIBLE);

        }

        Boolean check160 = favouriteDao.is_exist(Integer.parseInt(recid160.getText().toString()));

        if(check160==false){

            btn_fav160.setVisibility(View.INVISIBLE);
            addtofav160.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav160.setVisibility(View.VISIBLE);
            addtofav160.setVisibility(View.INVISIBLE);

        }

        Boolean check161 = favouriteDao.is_exist(Integer.parseInt(recid161.getText().toString()));

        if(check161==false){

            btn_fav161.setVisibility(View.INVISIBLE);
            addtofav161.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav161.setVisibility(View.VISIBLE);
            addtofav161.setVisibility(View.INVISIBLE);

        }


        Boolean check162 = favouriteDao.is_exist(Integer.parseInt(recid162.getText().toString()));

        if(check162==false){

            btn_fav162.setVisibility(View.INVISIBLE);
            addtofav162.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav162.setVisibility(View.VISIBLE);
            addtofav162.setVisibility(View.INVISIBLE);

        }


        Boolean check163 = favouriteDao.is_exist(Integer.parseInt(recid163.getText().toString()));

        if(check163==false){

            btn_fav163.setVisibility(View.INVISIBLE);
            addtofav163.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav163.setVisibility(View.VISIBLE);
            addtofav163.setVisibility(View.INVISIBLE);

        }


        Boolean check164 = favouriteDao.is_exist(Integer.parseInt(recid164.getText().toString()));

        if(check164==false){

            btn_fav164.setVisibility(View.INVISIBLE);
            addtofav164.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav164.setVisibility(View.VISIBLE);
            addtofav164.setVisibility(View.INVISIBLE);

        }


        Boolean check165 = favouriteDao.is_exist(Integer.parseInt(recid165.getText().toString()));

        if(check165==false){

            btn_fav165.setVisibility(View.INVISIBLE);
            addtofav165.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav165.setVisibility(View.VISIBLE);
            addtofav165.setVisibility(View.INVISIBLE);

        }


        Boolean check166 = favouriteDao.is_exist(Integer.parseInt(recid166.getText().toString()));

        if(check166==false){

            btn_fav166.setVisibility(View.INVISIBLE);
            addtofav166.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav166.setVisibility(View.VISIBLE);
            addtofav166.setVisibility(View.INVISIBLE);

        }


        Boolean check167 = favouriteDao.is_exist(Integer.parseInt(recid167.getText().toString()));

        if(check167==false){

            btn_fav167.setVisibility(View.INVISIBLE);
            addtofav167.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav167.setVisibility(View.VISIBLE);
            addtofav167.setVisibility(View.INVISIBLE);

        }


        Boolean check168 = favouriteDao.is_exist(Integer.parseInt(recid168.getText().toString()));

        if(check168==false){

            btn_fav168.setVisibility(View.INVISIBLE);
            addtofav168.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav168.setVisibility(View.VISIBLE);
            addtofav168.setVisibility(View.INVISIBLE);

        }


        Boolean check169 = favouriteDao.is_exist(Integer.parseInt(recid169.getText().toString()));

        if(check169==false){

            btn_fav169.setVisibility(View.INVISIBLE);
            addtofav169.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav169.setVisibility(View.VISIBLE);
            addtofav169.setVisibility(View.INVISIBLE);

        }


        Boolean check170 = favouriteDao.is_exist(Integer.parseInt(recid170.getText().toString()));

        if(check170==false){

            btn_fav170.setVisibility(View.INVISIBLE);
            addtofav170.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav170.setVisibility(View.VISIBLE);
            addtofav170.setVisibility(View.INVISIBLE);

        }


        Boolean check171 = favouriteDao.is_exist(Integer.parseInt(recid171.getText().toString()));

        if(check171==false){

            btn_fav171.setVisibility(View.INVISIBLE);
            addtofav171.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav171.setVisibility(View.VISIBLE);
            addtofav171.setVisibility(View.INVISIBLE);

        }

        Boolean check172 = favouriteDao.is_exist(Integer.parseInt(recid171.getText().toString()));

        if(check172==false){

            btn_fav172.setVisibility(View.INVISIBLE);
            addtofav172.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav172.setVisibility(View.VISIBLE);
            addtofav172.setVisibility(View.INVISIBLE);

        }    Boolean check173 = favouriteDao.is_exist(Integer.parseInt(recid173.getText().toString()));

        if(check173==false){

            btn_fav173.setVisibility(View.INVISIBLE);
            addtofav173.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav173.setVisibility(View.VISIBLE);
            addtofav173.setVisibility(View.INVISIBLE);

        }  Boolean check174 = favouriteDao.is_exist(Integer.parseInt(recid174.getText().toString()));

        if(check174==false){

            btn_fav174.setVisibility(View.INVISIBLE);
            addtofav174.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav174.setVisibility(View.VISIBLE);
            addtofav174.setVisibility(View.INVISIBLE);

        }  Boolean check175 = favouriteDao.is_exist(Integer.parseInt(recid175.getText().toString()));

        if(check171==false){

            btn_fav171.setVisibility(View.INVISIBLE);
            addtofav171.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav171.setVisibility(View.VISIBLE);
            addtofav171.setVisibility(View.INVISIBLE);

        }  Boolean check176 = favouriteDao.is_exist(Integer.parseInt(recid176.getText().toString()));

        if(check176==false){

            btn_fav176.setVisibility(View.INVISIBLE);
            addtofav176.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav176.setVisibility(View.VISIBLE);
            addtofav176.setVisibility(View.INVISIBLE);

        }  Boolean check177 = favouriteDao.is_exist(Integer.parseInt(recid177.getText().toString()));

        if(check177==false){

            btn_fav177.setVisibility(View.INVISIBLE);
            addtofav177.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav177.setVisibility(View.VISIBLE);
            addtofav177.setVisibility(View.INVISIBLE);

        }  Boolean check178 = favouriteDao.is_exist(Integer.parseInt(recid178.getText().toString()));

        if(check178==false){

            btn_fav178.setVisibility(View.INVISIBLE);
            addtofav178.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav178.setVisibility(View.VISIBLE);
            addtofav178.setVisibility(View.INVISIBLE);

        }  Boolean check179 = favouriteDao.is_exist(Integer.parseInt(recid179.getText().toString()));

        if(check179==false){

            btn_fav179.setVisibility(View.INVISIBLE);
            addtofav179.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav179.setVisibility(View.VISIBLE);
            addtofav179.setVisibility(View.INVISIBLE);

        }



        Boolean check180 = favouriteDao.is_exist(Integer.parseInt(recid180.getText().toString()));

        if(check180==false){

            btn_fav180.setVisibility(View.INVISIBLE);
            addtofav180.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav180.setVisibility(View.VISIBLE);
            addtofav180.setVisibility(View.INVISIBLE);

        }


        Boolean check181 = favouriteDao.is_exist(Integer.parseInt(recid181.getText().toString()));

        if(check181==false){

            btn_fav181.setVisibility(View.INVISIBLE);
            addtofav181.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav181.setVisibility(View.VISIBLE);
            addtofav181.setVisibility(View.INVISIBLE);

        }       Boolean check182 = favouriteDao.is_exist(Integer.parseInt(recid182.getText().toString()));

        if(check182==false){

            btn_fav182.setVisibility(View.INVISIBLE);
            addtofav182.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav182.setVisibility(View.VISIBLE);
            addtofav182.setVisibility(View.INVISIBLE);

        }       Boolean check183 = favouriteDao.is_exist(Integer.parseInt(recid183.getText().toString()));

        if(check183==false){

            btn_fav183.setVisibility(View.INVISIBLE);
            addtofav183.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav183.setVisibility(View.VISIBLE);
            addtofav183.setVisibility(View.INVISIBLE);

        }       Boolean check184 = favouriteDao.is_exist(Integer.parseInt(recid184.getText().toString()));

        if(check184==false){

            btn_fav184.setVisibility(View.INVISIBLE);
            addtofav184.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav184.setVisibility(View.VISIBLE);
            addtofav184.setVisibility(View.INVISIBLE);

        }       Boolean check186 = favouriteDao.is_exist(Integer.parseInt(recid186.getText().toString()));

        if(check186==false){

            btn_fav186.setVisibility(View.INVISIBLE);
            addtofav186.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav186.setVisibility(View.VISIBLE);
            addtofav186.setVisibility(View.INVISIBLE);

        }       Boolean check187 = favouriteDao.is_exist(Integer.parseInt(recid187.getText().toString()));

        if(check187==false){

            btn_fav187.setVisibility(View.INVISIBLE);
            addtofav187.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav187.setVisibility(View.VISIBLE);
            addtofav187.setVisibility(View.INVISIBLE);

        }       Boolean check188 = favouriteDao.is_exist(Integer.parseInt(recid188.getText().toString()));

        if(check188==false){

            btn_fav188.setVisibility(View.INVISIBLE);
            addtofav188.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav188.setVisibility(View.VISIBLE);
            addtofav188.setVisibility(View.INVISIBLE);

        }       Boolean check189 = favouriteDao.is_exist(Integer.parseInt(recid189.getText().toString()));

        if(check189==false){

            btn_fav189.setVisibility(View.INVISIBLE);
            addtofav189.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav189.setVisibility(View.VISIBLE);
            addtofav189.setVisibility(View.INVISIBLE);

        }       Boolean check190 = favouriteDao.is_exist(Integer.parseInt(recid190.getText().toString()));

        if(check190==false){

            btn_fav190.setVisibility(View.INVISIBLE);
            addtofav190.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav190.setVisibility(View.VISIBLE);
            addtofav190.setVisibility(View.INVISIBLE);

        }       Boolean check191 = favouriteDao.is_exist(Integer.parseInt(recid191.getText().toString()));

        if(check191==false){

            btn_fav191.setVisibility(View.INVISIBLE);
            addtofav191.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav191.setVisibility(View.VISIBLE);
            addtofav191.setVisibility(View.INVISIBLE);

        }


         Boolean check192 = favouriteDao.is_exist(Integer.parseInt(recid192.getText().toString()));

        if(check192==false){

            btn_fav192.setVisibility(View.INVISIBLE);
            addtofav192.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav192.setVisibility(View.VISIBLE);
            addtofav192.setVisibility(View.INVISIBLE);

        }   Boolean check193 = favouriteDao.is_exist(Integer.parseInt(recid193.getText().toString()));

        if(check193==false){

            btn_fav193.setVisibility(View.INVISIBLE);
            addtofav193.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav193.setVisibility(View.VISIBLE);
            addtofav193.setVisibility(View.INVISIBLE);

        }   Boolean check194 = favouriteDao.is_exist(Integer.parseInt(recid194.getText().toString()));

        if(check194==false){

            btn_fav194.setVisibility(View.INVISIBLE);
            addtofav194.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav195.setVisibility(View.VISIBLE);
            addtofav195.setVisibility(View.INVISIBLE);

        }   Boolean check196 = favouriteDao.is_exist(Integer.parseInt(recid196.getText().toString()));

        if(check196==false){

            btn_fav196.setVisibility(View.INVISIBLE);
            addtofav196.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav196.setVisibility(View.VISIBLE);
            addtofav196.setVisibility(View.INVISIBLE);

        }   Boolean check197 = favouriteDao.is_exist(Integer.parseInt(recid197.getText().toString()));

        if(check197==false){

            btn_fav197.setVisibility(View.INVISIBLE);
            addtofav197.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav197.setVisibility(View.VISIBLE);
            addtofav197.setVisibility(View.INVISIBLE);

        }   Boolean check198 = favouriteDao.is_exist(Integer.parseInt(recid198.getText().toString()));

        if(check198==false){

            btn_fav198.setVisibility(View.INVISIBLE);
            addtofav198.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav198.setVisibility(View.VISIBLE);
            addtofav198.setVisibility(View.INVISIBLE);

        }   Boolean check199 = favouriteDao.is_exist(Integer.parseInt(recid199.getText().toString()));

        if(check199==false){

            btn_fav199.setVisibility(View.INVISIBLE);
            addtofav199.setVisibility(View.VISIBLE);

        }
        else{

            btn_fav199.setVisibility(View.VISIBLE);
            addtofav199.setVisibility(View.INVISIBLE);

        }
        addtofav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = azeem.getText().toString();

                int i=Integer.parseInt(recid.getText().toString());

                Add_to_Favourite(pname, i);

             if(check==false){
                 addtofav.setVisibility(View.INVISIBLE);
                 btn_fav.setVisibility(View.VISIBLE);


             }
             else{

                 Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

             }

            }
        });

        addtofav101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name101.getText().toString();

                int i=Integer.parseInt(recid101.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav101.setVisibility(View.INVISIBLE);
                    btn_fav101.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name102.getText().toString();

                int i=Integer.parseInt(recid102.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav102.setVisibility(View.INVISIBLE);
                    btn_fav102.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name103.getText().toString();

                int i=Integer.parseInt(recid103.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav103.setVisibility(View.INVISIBLE);
                    btn_fav103.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name104.getText().toString();

                int i=Integer.parseInt(recid104.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav104.setVisibility(View.INVISIBLE);
                    btn_fav104.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name105.getText().toString();

                int i=Integer.parseInt(recid105.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav105.setVisibility(View.INVISIBLE);
                    btn_fav105.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name106.getText().toString();

                int i=Integer.parseInt(recid106.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav106.setVisibility(View.INVISIBLE);
                    btn_fav106.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name107.getText().toString();

                int i=Integer.parseInt(recid107.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav107.setVisibility(View.INVISIBLE);
                    btn_fav107.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name108.getText().toString();

                int i=Integer.parseInt(recid108.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav108.setVisibility(View.INVISIBLE);
                    btn_fav108.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name1090.getText().toString();

                int i=Integer.parseInt(recid109.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav109.setVisibility(View.INVISIBLE);
                    btn_fav109.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name110.getText().toString();

                int i=Integer.parseInt(recid110.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav110.setVisibility(View.INVISIBLE);
                    btn_fav110.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name111.getText().toString();

                int i=Integer.parseInt(recid111.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav111.setVisibility(View.INVISIBLE);
                    btn_fav111.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name112.getText().toString();

                int i=Integer.parseInt(recid112.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav112.setVisibility(View.INVISIBLE);
                    btn_fav112.setVisibility(View.VISIBLE);

                }
                else{
                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name113.getText().toString();

                int i=Integer.parseInt(recid113.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav113.setVisibility(View.INVISIBLE);
                    btn_fav113.setVisibility(View.VISIBLE);
                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name114.getText().toString();

                int i=Integer.parseInt(recid114.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav114.setVisibility(View.INVISIBLE);
                    btn_fav114.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });
        addtofav115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name115.getText().toString();

                int i=Integer.parseInt(recid115.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav115.setVisibility(View.INVISIBLE);
                    btn_fav115.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name116.getText().toString();

                int i=Integer.parseInt(recid116.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav116.setVisibility(View.INVISIBLE);
                    btn_fav116.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name117.getText().toString();

                int i=Integer.parseInt(recid117.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav117.setVisibility(View.INVISIBLE);
                    btn_fav117.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name118.getText().toString();

                int i=Integer.parseInt(recid118.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav118.setVisibility(View.INVISIBLE);
                    btn_fav118.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name119.getText().toString();

                int i=Integer.parseInt(recid119.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav119.setVisibility(View.INVISIBLE);
                    btn_fav119.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name120.getText().toString();

                int i=Integer.parseInt(recid120.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav120.setVisibility(View.INVISIBLE);
                    btn_fav120.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name1210.getText().toString();

                int i=Integer.parseInt(recid121.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav121.setVisibility(View.INVISIBLE);
                    btn_fav121.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name122.getText().toString();

                int i=Integer.parseInt(recid122.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav122.setVisibility(View.INVISIBLE);
                    btn_fav122.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name123.getText().toString();

                int i=Integer.parseInt(recid123.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav123.setVisibility(View.INVISIBLE);
                    btn_fav123.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name124.getText().toString();

                int i=Integer.parseInt(recid124.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav124.setVisibility(View.INVISIBLE);
                    btn_fav124.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });
        addtofav125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name125.getText().toString();

                int i=Integer.parseInt(recid125.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav125.setVisibility(View.INVISIBLE);
                    btn_fav125.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name126.getText().toString();

                int i=Integer.parseInt(recid126.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav126.setVisibility(View.INVISIBLE);
                    btn_fav126.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name127.getText().toString();

                int i=Integer.parseInt(recid127.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav127.setVisibility(View.INVISIBLE);
                    btn_fav127.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name128.getText().toString();

                int i=Integer.parseInt(recid128.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav128.setVisibility(View.INVISIBLE);
                    btn_fav128.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name129.getText().toString();

                int i=Integer.parseInt(recid129.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav129.setVisibility(View.INVISIBLE);
                    btn_fav129.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });
        addtofav129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name129.getText().toString();

                int i=Integer.parseInt(recid129.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav129.setVisibility(View.INVISIBLE);
                    btn_fav129.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name131.getText().toString();

                int i=Integer.parseInt(recid131.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav131.setVisibility(View.INVISIBLE);
                    btn_fav131.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });



        addtofav132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name132.getText().toString();

                int i=Integer.parseInt(recid132.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav132.setVisibility(View.INVISIBLE);
                    btn_fav132.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });
        addtofav133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name133.getText().toString();

                int i=Integer.parseInt(recid133.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav133.setVisibility(View.INVISIBLE);
                    btn_fav133.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name134.getText().toString();

                int i=Integer.parseInt(recid134.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav134.setVisibility(View.INVISIBLE);
                    btn_fav134.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name135.getText().toString();

                int i=Integer.parseInt(recid135.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav135.setVisibility(View.INVISIBLE);
                    btn_fav135.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name136.getText().toString();

                int i=Integer.parseInt(recid136.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav136.setVisibility(View.INVISIBLE);
                    btn_fav136.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name137.getText().toString();

                int i=Integer.parseInt(recid137.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav137.setVisibility(View.INVISIBLE);
                    btn_fav137.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name138.getText().toString();

                int i=Integer.parseInt(recid138.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav138.setVisibility(View.INVISIBLE);
                    btn_fav138.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name139.getText().toString();

                int i=Integer.parseInt(recid139.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav139.setVisibility(View.INVISIBLE);
                    btn_fav139.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name140.getText().toString();

                int i=Integer.parseInt(recid140.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav140.setVisibility(View.INVISIBLE);
                    btn_fav140.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name142.getText().toString();

                int i=Integer.parseInt(recid142.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav142.setVisibility(View.INVISIBLE);
                    btn_fav142.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name143.getText().toString();

                int i=Integer.parseInt(recid143.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav143.setVisibility(View.INVISIBLE);
                    btn_fav143.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name144.getText().toString();

                int i=Integer.parseInt(recid144.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav144.setVisibility(View.INVISIBLE);
                    btn_fav144.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name145.getText().toString();

                int i=Integer.parseInt(recid145.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav145.setVisibility(View.INVISIBLE);
                    btn_fav145.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name146.getText().toString();

                int i=Integer.parseInt(recid146.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav146.setVisibility(View.INVISIBLE);
                    btn_fav146.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name147.getText().toString();

                int i=Integer.parseInt(recid147.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav147.setVisibility(View.INVISIBLE);
                    btn_fav147.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name148.getText().toString();

                int i=Integer.parseInt(recid148.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav148.setVisibility(View.INVISIBLE);
                    btn_fav148.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav149.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name149.getText().toString();

                int i=Integer.parseInt(recid149.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav149.setVisibility(View.INVISIBLE);
                    btn_fav149.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name150.getText().toString();

                int i=Integer.parseInt(recid150.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav150.setVisibility(View.INVISIBLE);
                    btn_fav150.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name151.getText().toString();

                int i=Integer.parseInt(recid151.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav151.setVisibility(View.INVISIBLE);
                    btn_fav151.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name152.getText().toString();

                int i=Integer.parseInt(recid152.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav152.setVisibility(View.INVISIBLE);
                    btn_fav152.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name153.getText().toString();

                int i=Integer.parseInt(recid153.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav153.setVisibility(View.INVISIBLE);
                    btn_fav153.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name154.getText().toString();

                int i=Integer.parseInt(recid154.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav154.setVisibility(View.INVISIBLE);
                    btn_fav154.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name155.getText().toString();

                int i=Integer.parseInt(recid155.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav155.setVisibility(View.INVISIBLE);
                    btn_fav155.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name156.getText().toString();

                int i=Integer.parseInt(recid156.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav156.setVisibility(View.INVISIBLE);
                    btn_fav156.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav157.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name157.getText().toString();

                int i=Integer.parseInt(recid157.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav157.setVisibility(View.INVISIBLE);
                    btn_fav157.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav158.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name158.getText().toString();

                int i=Integer.parseInt(recid158.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav158.setVisibility(View.INVISIBLE);
                    btn_fav158.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav159.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name159.getText().toString();

                int i=Integer.parseInt(recid159.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav159.setVisibility(View.INVISIBLE);
                    btn_fav159.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav160.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name160.getText().toString();

                int i=Integer.parseInt(recid160.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav160.setVisibility(View.INVISIBLE);
                    btn_fav160.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav161.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name161.getText().toString();

                int i=Integer.parseInt(recid161.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav161.setVisibility(View.INVISIBLE);
                    btn_fav161.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav162.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name162.getText().toString();

                int i=Integer.parseInt(recid162.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav162.setVisibility(View.INVISIBLE);
                    btn_fav162.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav163.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name163.getText().toString();

                int i=Integer.parseInt(recid163.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav163.setVisibility(View.INVISIBLE);
                    btn_fav163.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });
        addtofav164.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name164.getText().toString();

                int i=Integer.parseInt(recid164.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav164.setVisibility(View.INVISIBLE);
                    btn_fav164.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav165.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name165.getText().toString();

                int i=Integer.parseInt(recid165.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav165.setVisibility(View.INVISIBLE);
                    btn_fav165.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav166.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name166.getText().toString();

                int i=Integer.parseInt(recid166.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav166.setVisibility(View.INVISIBLE);
                    btn_fav166.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav167.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name167.getText().toString();

                int i=Integer.parseInt(recid167.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav167.setVisibility(View.INVISIBLE);
                    btn_fav167.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav168.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name168.getText().toString();

                int i=Integer.parseInt(recid168.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav168.setVisibility(View.INVISIBLE);
                    btn_fav168.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });
        addtofav169.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name169.getText().toString();

                int i=Integer.parseInt(recid169.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav169.setVisibility(View.INVISIBLE);
                    btn_fav169.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav170.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name170.getText().toString();

                int i=Integer.parseInt(recid170.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav170.setVisibility(View.INVISIBLE);
                    btn_fav170.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav171.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name171.getText().toString();

                int i=Integer.parseInt(recid171.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav171.setVisibility(View.INVISIBLE);
                    btn_fav171.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav172.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name172.getText().toString();

                int i=Integer.parseInt(recid172.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav172.setVisibility(View.INVISIBLE);
                    btn_fav172.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav173.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name173.getText().toString();

                int i=Integer.parseInt(recid173.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav173.setVisibility(View.INVISIBLE);
                    btn_fav173.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav174.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name174.getText().toString();

                int i=Integer.parseInt(recid174.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav174.setVisibility(View.INVISIBLE);
                    btn_fav174.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav175.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name175.getText().toString();

                int i=Integer.parseInt(recid175.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav175.setVisibility(View.INVISIBLE);
                    btn_fav175.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav176.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name176.getText().toString();

                int i=Integer.parseInt(recid176.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav176.setVisibility(View.INVISIBLE);
                    btn_fav176.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav177.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name177.getText().toString();

                int i=Integer.parseInt(recid177.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav177.setVisibility(View.INVISIBLE);
                    btn_fav177.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav178.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name178.getText().toString();

                int i=Integer.parseInt(recid178.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav178.setVisibility(View.INVISIBLE);
                    btn_fav178.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav179.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name179.getText().toString();

                int i=Integer.parseInt(recid179.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav179.setVisibility(View.INVISIBLE);
                    btn_fav179.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav180.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name180.getText().toString();

                int i=Integer.parseInt(recid180.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav180.setVisibility(View.INVISIBLE);
                    btn_fav180.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name181.getText().toString();

                int i=Integer.parseInt(recid181.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav181.setVisibility(View.INVISIBLE);
                    btn_fav181.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name182.getText().toString();

                int i=Integer.parseInt(recid182.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav182.setVisibility(View.INVISIBLE);
                    btn_fav182.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav183.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name183.getText().toString();

                int i=Integer.parseInt(recid183.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav183.setVisibility(View.INVISIBLE);
                    btn_fav183.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav184.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name184.getText().toString();

                int i=Integer.parseInt(recid184.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav184.setVisibility(View.INVISIBLE);
                    btn_fav184.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav185.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name185.getText().toString();

                int i=Integer.parseInt(recid185.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav185.setVisibility(View.INVISIBLE);
                    btn_fav185.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav186.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name186.getText().toString();

                int i=Integer.parseInt(recid186.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav186.setVisibility(View.INVISIBLE);
                    btn_fav186.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav187.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name187.getText().toString();

                int i=Integer.parseInt(recid187.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav187.setVisibility(View.INVISIBLE);
                    btn_fav187.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav188.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name188.getText().toString();

                int i=Integer.parseInt(recid188.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav188.setVisibility(View.INVISIBLE);
                    btn_fav188.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav189.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name189.getText().toString();

                int i=Integer.parseInt(recid189.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav189.setVisibility(View.INVISIBLE);
                    btn_fav189.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav190.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name190.getText().toString();

                int i=Integer.parseInt(recid190.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav190.setVisibility(View.INVISIBLE);
                    btn_fav190.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav191.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name191.getText().toString();

                int i=Integer.parseInt(recid191.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav191.setVisibility(View.INVISIBLE);
                    btn_fav191.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav192.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name192.getText().toString();

                int i=Integer.parseInt(recid192.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav192.setVisibility(View.INVISIBLE);
                    btn_fav192.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav193.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name193.getText().toString();

                int i=Integer.parseInt(recid193.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav193.setVisibility(View.INVISIBLE);
                    btn_fav193.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav194.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name194.getText().toString();

                int i=Integer.parseInt(recid194.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav194.setVisibility(View.INVISIBLE);
                    btn_fav194.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav195.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name195.getText().toString();

                int i=Integer.parseInt(recid195.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav195.setVisibility(View.INVISIBLE);
                    btn_fav195.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav196.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name196.getText().toString();

                int i=Integer.parseInt(recid196.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav196.setVisibility(View.INVISIBLE);
                    btn_fav196.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav197.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name197.getText().toString();

                int i=Integer.parseInt(recid197.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav197.setVisibility(View.INVISIBLE);
                    btn_fav197.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav198.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name198.getText().toString();

                int i=Integer.parseInt(recid198.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav198.setVisibility(View.INVISIBLE);
                    btn_fav198.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav199.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int rand = new Random().nextInt(61) + 2000;

                String pname = Allah_name199.getText().toString();

                int i=Integer.parseInt(recid199.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav199.setVisibility(View.INVISIBLE);
                    btn_fav199.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });



        addtofav2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = Subhan_Allah.getText().toString();

                int i=Integer.parseInt(recid2.getText().toString());

                Add_to_Favourite(pname, i);


                if(check==false){

                    addtofav2.setVisibility(View.INVISIBLE);
                    btn_fav2.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }
            }
        });



        addtofav3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String pname = Allahhumamagfirli.getText().toString();

                int i=Integer.parseInt(recid3.getText().toString());

                Add_to_Favourite(pname, i);


                if(check==false){

                    addtofav3.setVisibility(View.INVISIBLE);
                    btn_fav3.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });


        addtofav4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = Wabihumdi.getText().toString();

                int i=Integer.parseInt(recid4.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav4.setVisibility(View.INVISIBLE);
                    btn_fav4.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });
//
//
        addtofav5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 int rand = new Random().nextInt(61) + 20;

                String pname = alhumdulillah.getText().toString();

                int i=Integer.parseInt(recid5.getText().toString());

                Add_to_Favourite(pname, i);


                if(check==false){
                    addtofav5.setVisibility(View.INVISIBLE);
                    btn_fav5.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }


            }


        });

        addtofav6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = Allah_huakbar.getText().toString();
                int i=Integer.parseInt(recid6.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav6.setVisibility(View.INVISIBLE);
                    btn_fav6.setVisibility(View.VISIBLE);
                }
                else{
                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();
                }
            }
        });
//
//
        addtofav7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String pname = lahulawalaquwata.getText().toString();

                int i=Integer.parseInt(recid7.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav7.setVisibility(View.INVISIBLE);
                    btn_fav7.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }


            }
        });


        addtofav8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = Wabihumdihi.getText().toString();

              int i=Integer.parseInt(recid8.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav8.setVisibility(View.INVISIBLE);
                    btn_fav8.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }


            }
        });

        addtofav9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = SheeinQadir.getText().toString();

                int i=Integer.parseInt(recid9.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav9.setVisibility(View.INVISIBLE);
                    btn_fav9.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }


            }
        });

        addtofav10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = lailahaillahhu.getText().toString();

                int i=Integer.parseInt(recid10.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav10.setVisibility(View.INVISIBLE);
                    btn_fav10.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }


            }
        });
//
        addtofav11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String pname = Astagfirullah.getText().toString();

                int i=Integer.parseInt(recid11.getText().toString());

                Add_to_Favourite(pname, i);


                if(check==false){
                    addtofav11.setVisibility(View.INVISIBLE);
                    btn_fav11.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

        addtofav12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 int rand = new Random().nextInt(61) + 20;

                String pname = Astagfirullah_2.getText().toString();

                int i=Integer.parseInt(recid12.getText().toString());

                Add_to_Favourite(pname, i);


                if(check==false){
                    addtofav12.setVisibility(View.INVISIBLE);
                    btn_fav12.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }

            }
        });

//
        addtofav13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = sallahlahu.getText().toString();

                int i=Integer.parseInt(recid13.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav13.setVisibility(View.INVISIBLE);
                    btn_fav13.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }


            }
        });

        addtofav14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 int rand = new Random().nextInt(61) + 20;

                String pname = Bismillahhi.getText().toString();

               int i=Integer.parseInt(recid14.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav14.setVisibility(View.INVISIBLE);
                    btn_fav14.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }


            }
        });
        addtofav15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = Astagfirullah_rabi.getText().toString();
                int i=Integer.parseInt(recid15.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav15.setVisibility(View.INVISIBLE);
                    btn_fav15.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }


            }
        });
//
        addtofav16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = Rabigfirli.getText().toString();

                int i=Integer.parseInt(recid16.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav16.setVisibility(View.INVISIBLE);
                    btn_fav16.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }


            }
        });
//
        addtofav17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = ZanubiKala.getText().toString();

                int i=Integer.parseInt(recid17.getText().toString());

                Add_to_Favourite(pname, i);
                if(check==false){
                    addtofav17.setVisibility(View.INVISIBLE);
                    btn_fav17.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }



            }
        });

        addtofav18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pname = AllahhumainiAoozbika.getText().toString();

                int i=Integer.parseInt(recid18.getText().toString());

                Add_to_Favourite(pname, i);

                if(check==false){
                    addtofav18.setVisibility(View.INVISIBLE);
                    btn_fav18.setVisibility(View.VISIBLE);


                }
                else{

                    Toast.makeText(Select_Dhikar.this, "Item Already added", Toast.LENGTH_SHORT).show();

                }


            }
        });

    }



    public void goback(View view) {
        startActivity(new Intent(Select_Dhikar.this, Digital_Tasbeeh.class));
        finish();

    }

    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(this, Digital_Tasbeeh
                .class);
        finish();
    }

    public void azzem(View view) {

        String text = azeem.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Subhan_Allah(View view) {

        String text = azeem.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Wabi_hum_di(View view) {

        String text = Wabihumdi.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Allah_huakbar(View view) {

        String text = Allah_huakbar.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void lahulawalaquwata(View view) {

        String text = lahulawalaquwata.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Wabihumdihi(View view) {
        String text = Wabihumdihi.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void SheeinQadir(View view) {
        String text = SheeinQadir.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void lailahaillahhu(View view) {
        String text = lailahaillahhu.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Astagfirullah(View view) {

        String text = Astagfirullah.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Astagfirullah_2(View view) {

        String text = Astagfirullah_2.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void sallahlahu(View view) {

        String text = sallahlahu.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Bismillahhi(View view) {
        String text = Bismillahhi.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Rabigfirli(View view) {
        String text = Rabigfirli.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void ZanubiKala(View view) {
        String text = ZanubiKala.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void AllahhumainiAoozbika(View view) {
        String text = AllahhumainiAoozbika.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);


    }

    public void Allahhumamagfirli(View view) {
        String text = Allahhumamagfirli.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Alhumdulillah(View view) {

        String text = alhumdulillah.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Astagfirullah_rabi(View view) {

        String text = Astagfirullah_rabi.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }


    public Boolean Add_to_Favourite(String pname, int id){


        FavouriteAppDatabase dbb_bd = Room.databaseBuilder(getApplicationContext(), FavouriteAppDatabase.class, "cart_dbb").allowMainThreadQueries()
                .fallbackToDestructiveMigration().build();
        FavouriteDao favouriteDao = dbb_bd.FavouriteDao();
//                int num=favouriteDao.is_exist(Integer.parseInt(id));
        Boolean check = favouriteDao.is_exist(id);
////

        if(check==false) {
            favouriteDao.insertrecord(new Favourite(id, pname));
            btn_fav.setVisibility(View.VISIBLE);

            startActivity(new Intent(Select_Dhikar.this, Favourite_Dikhar.class));
            Toast.makeText(Select_Dhikar.this, "Item added to list ", Toast.LENGTH_SHORT).show();
        }
        else{
        }

        return check;
    }

    public void Alrehman(View view) {

        String text = Allah_name101.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void raheem(View view) {

        String text = Allah_name102.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Malikul(View view) {

        String text = Allah_name103.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }


    public void alqudoos(View view) {
        String text = Allah_name104.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void alsalam(View view) {
        String text = Allah_name105.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void almomeen(View view) {
        String text = Allah_name106.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);


    }

    public void alazeez(View view) {

        String text = Allah_name107.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void aljabar(View view) {
        String text = Allah_name108.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void almutaqabir(View view) {

        String text = Allah_name1090.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Alkhaliq(View view) {

        String text = Allah_name110.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Albari(View view) {
        String text = Allah_name111.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void almusawir(View view) {
        String text = Allah_name112.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Algafar115(View view) {
        String text = Allah_name115.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alqahar1090(View view) {

        String text = Allah_name1090.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void alraziq117(View view) {
        String text = Allah_name117.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void alfatihaa118(View view) {
        String text = Allah_name118.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void alazeem119(View view) {
        String text = Allah_name119.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Albasit121(View view) {
        String text = Allah_name1210.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alqabiz1210(View view) {
        String text = Allah_name1210.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void alhafiz122(View view) {
        String text = Allah_name122.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alrafyee123(View view) {
        String text = Allah_name123.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almuazee124(View view) {
        String text = Allah_name124.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almuziluh125(View view) {
        String text = Allah_name125.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alsamee126(View view) {
        String text = Allah_name126.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Albaseeroh127(View view) {  String text = Allah_name127.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alhaqamo128(View view) {
        String text = Allah_name128.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Aladaloo129(View view) {
        String text = Allah_name129.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Allatifoo130(View view) {  String text = Allah_name130.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Alkhabiroo131(View view) {

        String text = Allah_name131.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alhaleemo132(View view) {
        String text = Allah_name132.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void AlAzzemo133(View view) {
        String text = Allah_name133.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Alshkooro135(View view) { String text = Allah_name134.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Algafoor134(View view) {
        String text = Allah_name135.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alhaiyoo136(View view) {

        String text = Allah_name136.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alkabiroo137(View view) {

        String text = Allah_name137.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alhafizooِ138(View view) {

        String text = Allah_name138.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almuqeetoo139(View view) {

        String text = Allah_name139.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alhasseboo140(View view) {

        String text = Allah_name140.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }



    public void Alkareemo143(View view) {

        String text = Allah_name143.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Aljaleloo142(View view) {

        String text = Allah_name142.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alraqeebo144(View view) {

        String text = Allah_name145.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almuheeboo145(View view) {

        String text = Allah_name146.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alwasye146(View view) {

        String text = Allah_name147.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alhakeemo147(View view) {

        String text = Allah_name147.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almujeedo149(View view) {

        String text = Allah_name149.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Albyesoo150(View view) {
        String text = Allah_name150.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alwadoodo148(View view) {
        String text = Allah_name148.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alshaheed151(View view) {
        String text = Allah_name151.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alhaq152(View view) {
        String text = Allah_name152.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alwaqeel153(View view) {
        String text = Allah_name153.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alwaqee154(View view) {

        String text = Allah_name154.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almateen155(View view) {

        String text = Allah_name155.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alwali156(View view) {

        String text = Allah_name156.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alhameed157(View view) {
        String text = Allah_name157.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almubdeyo159(View view) {
        String text = Allah_name158.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almuhsye158(View view) {

        String text = Allah_name159.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almuayedoo160(View view) {
        String text = Allah_name160.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almuhyeh161(View view) {
        String text = Allah_name161.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Almuheet162(View view) {
        String text = Allah_name162.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alhayeuoo163(View view) {

        String text = Allah_name163.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alqayoom164(View view) {


        String text = Allah_name164.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);}


    public void Alwajeed165(View view) {
        String text = Allah_name165.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almajeedoo166(View view) {
        String text = Allah_name166.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alwahido167(View view) {

        String text = Allah_name167.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alahad168(View view) {
        String text = Allah_name168.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alsamad169(View view) {

        String text = Allah_name169.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alqadir170(View view) {
        String text = Allah_name170.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almuqtadir171(View view) {
        String text = Allah_name171.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Almuqadimo172(View view) {
        String text = Allah_name172.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Almukhir173(View view) {

        String text = Allah_name173.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alawaal174(View view) {

        String text = Allah_name174.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alakhir175(View view) {
        String text = Allah_name175.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alzahir176(View view) {
        String text = Allah_name176.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Albatin177(View view) {

        String text = Allah_name177.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alwali178(View view) {

        String text = Allah_name178.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almutaliyoo179(View view) {

        String text = Allah_name179.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Albaroo180(View view) {
        String text = Allah_name180.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almuntaqeem182(View view) {

        String text = Allah_name182.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alafwoo183(View view) {
        String text = Allah_name183.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alraoof184(View view) {

        String text = Allah_name184.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Malikulmolk185(View view) {
        String text = Allah_name185.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Zulikram_Zuljalal186(View view) {

        String text = Allah_name186.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almuqsitoo187(View view) {
        String text = Allah_name187.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Aljamiaah188(View view) {
        String text = Allah_name188.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alghani189(View view) {

        String text = Allah_name189.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almughni190(View view) {

        String text = Allah_name190.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Almanioo191(View view) {

        String text = Allah_name191.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alzar192(View view) {

        String text = Allah_name192.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void alnafioo193(View view) {

        String text = Allah_name193.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alnoor194(View view) {

        String text = Allah_name194.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alhadii195(View view) {
        String text = Allah_name195.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);

    }

    public void Albadiyoo196(View view) {

        String text = Allah_name196.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Albadiyoo197(View view) {

        String text = Allah_name197.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alwaris198(View view) {

        String text = Allah_name198.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Alrasheed199(View view) {

        String text = Allah_name199.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }

    public void Altawab181(View view) {

        String text = Allah_name199.getText().toString();

        Intent in = new Intent(Select_Dhikar.this, Digital_Tasbeeh.class);

        in.putExtra("image", text);

        startActivity(in);
    }
}