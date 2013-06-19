package com.example.comesolo_v1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ComeSoloActivity extends Activity {

	private TextView myTextView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_come_solo);
        myTextView = (TextView) findViewById(R.id.debug);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.come_solo, menu);
        return true;
    }
    
    public void selCanica(View v){
    	ImageView myImageView = (ImageView)v;
    	myImageView.setImageResource(R.drawable.canica_hueco);
    	System.out.println(myTextView.toString());
    	myTextView.setText("hola mundo!");
    }
    
}
