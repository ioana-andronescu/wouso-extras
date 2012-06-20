package cdl.android.ui.top;

import java.util.ArrayList;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import cdl.android.R;
import cdl.android.model.TopInfo;
import cdl.android.model.UserInfo;
import cdl.android.server.ApiRequests;


public class TopUsers extends Activity {
	private ArrayList<TopInfo> tInfo;
	SharedPreferences tPreferences;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textview = new TextView(this);
		textview.setText("Current top");
		setContentView(R.layout.topusers);

		ListView tListView = (ListView) findViewById(android.R.id.list);
		tListView.setEmptyView(findViewById(android.R.id.empty));
		tPreferences = PreferenceManager.getDefaultSharedPreferences(this);
		String username = tPreferences.getString("username", null);
		
		ApiRequests req = new ApiRequests();
		tInfo = req.getTop(username);
		tListView.setAdapter(new TopsAdapter(this, tInfo, new OnClickListener() {
			public void onClick(View v) {
			}
		}));

	}
}
