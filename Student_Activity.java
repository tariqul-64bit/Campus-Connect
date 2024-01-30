package com.example.iitju;
import androidx.annotation.NonNull;
import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
public class TeacherActivity extends AppCompatActivity {
ListView tealist;
String teaName[] = {"Dr. M. Mesbahuddin Sarker","Md. Fazlul Karim Patwary","Dr. M.
Shamim Kaiser", "Mohammad Abu Yousuf, PhD", "Dr. Risala Tasin Khan", "Dr. Jesmin
Akhter","K M Akkas Ali","Fahima Tabassum","Dr. Md Whaiduzzaman","Dr. Shamim Al
Mamun","Dr. Mohammad Shahidul Islam","Zamshed Iqbal Chowdhury","Dr. Md. Sazzadur
Rahman","Dr. Rashed Mazumder","Nusrat Zerin Zenia","Manan Binth Taj Noor","Md. Biplob
Hosen","Mehrin Anannya"};
String teaPhone[] = {"01716 091920","01922 999217","01511000555","yousuf@juniv.edu","risala@juniv.edu","01940 181243","01712
505324","fahima@juniv.edu","wzaman@juniv.edu","01783 567890","01714
028777","zic@juniv.edu","01717 051176","01738 541513","01989
032468","manan.noor@juniv.edu","01728 746728","01780 096096"};
int teaImages[] = {R.drawable.t1, R.drawable.t2, R.drawable.t3,
R.drawable.t4,R.drawable.t5,
R.drawable.t6,R.drawable.t7,R.drawable.t8,R.drawable.t9,R.drawable.t10,R.drawable.t11,R.d
rawable.t12,R.drawable.t13,R.drawable.t14,R.drawable.t15,R.drawable.t16,R.drawable.t17,R.
drawable.t18};
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_teacher);
tealist = findViewById(R.id.tealistview);
teaAdapter adapter = new teaAdapter( this, teaName,teaPhone, teaImages);
tealist.setAdapter(adapter);
}
class teaAdapter extends ArrayAdapter<String>{
Context teacontext;
String t1[];
String t2[];
int timg[];
teaAdapter (Context c, String name[], String phone[], int img[])
{
super(c, R.layout.atom, R.id.textView1,name);
this.teacontext =c;
this.t1=name;
this.t2=phone;
this.timg= img;
}
@NonNull
@Override
public View getView(int position, @Nullable View convertView, @NonNull
ViewGroup parent) {
LayoutInflater layoutInflater =
(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE)
;
View atom = layoutInflater.inflate(R.layout.atom, parent,false);
ImageView images = atom.findViewById(R.id.image);
TextView myTitle = atom.findViewById(R.id.textView1);
TextView myDescription = atom.findViewById(R.id.textView2);
images.setImageResource(timg[position]);
myTitle.setText(t1[position]);
myDescription.setText(t2[position]);
return atom;
}
}
}

