package com.example.iitju;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
ListView listView = findViewById(R.id.listview);
List<String> list = new ArrayList<>();
list.add("Teachers");
list.add("Students");

list.add("Staffs");
ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),
android.R.layout.simple_list_item_1,list);
listView.setAdapter(arrayAdapter);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
@Override
public void onItemClick(AdapterView<?> parent, View view, int position, long id)
{
if(position==0)
{
startActivity(new Intent(MainActivity.this,TeacherActivity.class));
}
else if(position==1)
{
startActivity(new Intent(MainActivity.class,StudentActivity.class));
}
else if(position==2)
{
startActivity(new Intent(MainActivity.this,StaffActivity.class));
}
}
});
}
}