package siam.moemoetun.com.shwedailyenglish;

import android.app.TabActivity;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Can extends TabActivity {

    TabHost mTabHost;
    TextView textView;
    Typeface typeface;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_will);

        mTabHost = (TabHost) findViewById(android.R.id.tabhost);
        mTabHost = getTabHost();

        mTabHost.addTab(mTabHost.newTabSpec("tab_test1").setIndicator("အဟုတ္").setContent(R.id.tab1));
        textView = (TextView) findViewById(R.id.textview1);
        typeface=Typeface.createFromAsset(getAssets(),"fonts/Zawgyi-One.ttf");
        textView.setTypeface(typeface);

        AssetManager assetManager = getAssets();
        // To load text file
        InputStream input;
        try {
            input = assetManager.open("model_verbs/can_positive.txt");

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

        //Exame to load more text view

        mTabHost.addTab(mTabHost.newTabSpec("tab_test1").setIndicator("မဟုတ္").setContent(R.id.tab2));
        textView =(TextView)findViewById(R.id.textview2);
        typeface=Typeface.createFromAsset(getAssets(),"fonts/Zawgyi-One.ttf");
        textView.setTypeface(typeface);
        //second textview loading start

        InputStream input1;
        try {
            input1 = assetManager.open("model_verbs/can_negative.txt");

            int size = input1.available();
            byte[] buffer = new byte[size];
            input1.read(buffer);
            input1.close();

            //byte buffer into a string
            String text = new String(buffer);

            textView.setText(text);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        mTabHost.addTab(mTabHost.newTabSpec("tab_test1").setIndicator("ေမးခြန္း").setContent(R.id.tab3));
        textView =(TextView)findViewById(R.id.textview3);
        typeface=Typeface.createFromAsset(getAssets(),"fonts/Zawgyi-One.ttf");
        textView.setTypeface(typeface);


        //third textview loading start here

        InputStream input2;
        try {
            input2 = assetManager.open("model_verbs/can_question.txt");

            int size = input2.available();
            byte[] buffer = new byte[size];
            input2.read(buffer);
            input2.close();

            // byte buffer into a string
            String text = new String(buffer);

            textView.setText(text);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        mTabHost.setCurrentTab(0);

    }

}