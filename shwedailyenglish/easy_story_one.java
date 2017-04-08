package siam.moemoetun.com.shwedailyenglish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class easy_story_one extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouns);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-4137439985376631/623619850");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        webview = (WebView) findViewById(R.id.webview_nouns);
        webview.getSettings().setBuiltInZoomControls(false);
        webview.getSettings().setJavaScriptEnabled(false);
        webview.loadUrl("file:///android_asset/easy_stories/ababy_and_asock.html");
    }


    @Override
    protected void onDestroy() {
        webview.destroy();
        webview = null;
        super.onDestroy();
    }

}
