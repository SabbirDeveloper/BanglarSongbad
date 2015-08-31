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
 * Created by SabbirDEV on 8/27/2015.
 */
public class bangla_news_24_fragment extends Fragment{
    public WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.bangla_news_24, container, false);
        webView = (WebView) rootView.findViewById(R.id.bangla_news_24);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://banglanews24.com/");
        webView.setWebViewClient(new WebViewClient());
        return rootView;
    }
}
