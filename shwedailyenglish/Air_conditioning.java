package siam.moemoetun.com.shwedailyenglish;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Air_conditioning extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-4137439985376631/623619850");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        webview = (WebView) findViewById(R.id.webview_nouns);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.loadUrl("file:///android_asset/4.Air Conditioning.html");
    }


    @Override
    protected void onDestroy() {
        webview.destroy();
        webview = null;
        super.onDestroy();
    }
}