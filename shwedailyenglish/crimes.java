package siam.moemoetun.com.shwedailyenglish;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class crimes extends AppCompatActivity {
    TextView textView;
    Typeface typeface1;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.might);

        textView = (TextView) findViewById(R.id.textview1);
        typeface1=Typeface.createFromAsset(getAssets(),"fonts/Zawgyi-One.ttf");
        textView.setTypeface(typeface1);

        //Exame to load more text view

        //textView1 =(TextView)findViewById(R.id.txtContent1);
        //typeface2=Typeface.createFromAsset(getAssets(),"Zawgyi.ttf");
        //textView1.setTypeface(typeface2);

        //textView2 =(TextView)findViewById(R.id.txtContent2);
        //typeface3=Typeface.createFromAsset(getAssets(),"Zawgyi.ttf");
        //textView2.setTypeface(typeface3);


        AssetManager assetManager = getAssets();
        // To load text file
        InputStream input;
        try {
            input = assetManager.open("crimes.txt");

            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();

            // byte buffer into a string
            String text = new String(buffer);

            textView.setText(text);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //second textview loading start

        //InputStream input1;
        //try {
        //input1 = assetManager.open("love.txt");

        //int size = input1.available();
        //byte[] buffer = new byte[size];
        //input1.read(buffer);
        //input1.close();

        // byte buffer into a string
        //String text = new String(buffer);

        //textView1.setText(text);
        //} catch (IOException e) {
        // TODO Auto-generated catch block
        // e.printStackTrace();
        //}

        //third textview loading start here

        //InputStream input2;
        //try {
        //input2 = assetManager.open("love1.txt");

        //int size = input2.available();
        //byte[] buffer = new byte[size];
        //input2.read(buffer);
        //input2.close();

        // byte buffer into a string
        //String text = new String(buffer);

        //textView2.setText(text);
        //} catch (IOException e) {
        // TODO Auto-generated catch block
        // e.printStackTrace();
        //}

    }

}