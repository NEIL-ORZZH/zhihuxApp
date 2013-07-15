package com.xi4oz3ro.zhihuxapp;

import org.json.JSONArray;

import com.xi4oz3ro.zhihuxapp.Common.HttpUtil;
import com.xi4oz3ro.zhihuxapp.Common.QuestionListAdapter;
import com.xi4oz3ro.zhihuxapp.Common.UIHelper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView questionListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /***
        questionListView = (ListView)findViewById(R.id.main_container);
        String[] arr = {"11111111111","22222222222","333333333"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        questionListView.setAdapter(adapter);
        */
        String url = "qlist?p=1";
        questionListView = (ListView)findViewById(R.id.main_container);
//        appContext = (AppContext)getApplication();
//        // Õ¯¬Á¡¨Ω”≈–∂œ
//     	if (!appContext.isNetworkConnected())
//     		UIHelper.ToastMessage(this, R.string.network_not_connected);
     	try
     	{
     		JSONArray jsonArray = new JSONArray(HttpUtil.getRequest(url));
     		//JSONArrayAdapter adapter = new JSONArrayAdapter(this,jsonArray);
     		QuestionListAdapter adapter = new QuestionListAdapter(this,jsonArray,R.layout.list_item);
     		questionListView.setAdapter(adapter);
     		
     	}catch(Exception ex)
     	{
     		UIHelper.ToastMessage(this,R.string.data_get_exception);
     		//UIHelper.ShowDialog(this.appContext,R.string.data_get_exception ,false);
     		ex.printStackTrace();
     	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
