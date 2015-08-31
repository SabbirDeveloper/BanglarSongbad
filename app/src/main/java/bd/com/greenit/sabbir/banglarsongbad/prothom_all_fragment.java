package bd.com.greenit.sabbir.banglarsongbad;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SabbirDEV on 8/28/2015.
 */
public class prothom_all_fragment extends Fragment {
    public WebView webView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.prothom_all, container, false);
        webView = (WebView) rootView.findViewById(R.id.prothom_all);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://m.prothom-alo.com/");
        webView.setWebViewClient(new WebViewClient());
        return rootView;
    }
}