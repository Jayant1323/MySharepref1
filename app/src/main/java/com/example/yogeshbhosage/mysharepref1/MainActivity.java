package com.example.yogeshbhosage.mysharepref1;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    static RelativeLayout r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        if(getImage()!=getResources().getColor(R.color.colorPrimary)){

            r=findViewById(R.id.reletive);
            r.setBackgroundResource(getImage());
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

            getMenuInflater().inflate(R.menu.example,menu);

        return super.onCreateOptionsMenu(menu);
    }

    public void storeImage(int image){

        SharedPreferences s=getSharedPreferences("image",MODE_PRIVATE);
        SharedPreferences.Editor e=s.edit();
        e.putInt("image",image);
        e.apply();
    }
    public int getImage(){
        SharedPreferences s=getSharedPreferences("image",MODE_PRIVATE);
        int i=s.getInt("image",getResources().getColor(R.color.colorPrimary));
        return i;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:

                r=findViewById(R.id.reletive);
                r.setBackgroundResource(R.drawable.virat);
                storeImage(R.drawable.virat);

        }


        return super.onOptionsItemSelected(item);
    }
}
