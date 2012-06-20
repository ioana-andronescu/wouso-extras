package cdl.android.ui.top;

import java.util.ArrayList;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import cdl.android.R;
import cdl.android.model.BazaarItem;
import cdl.android.model.UserInfo;
import cdl.android.server.ApiRequests;
import cdl.android.ui.bazaar.BazaarAdapter;


public class Tops extends Activity {
	private UserInfo uInfo;
	SharedPreferences uPreferences;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tops);

		ListView uListView = (ListView) findViewById(android.R.id.list);
		uListView.setEmptyView(findViewById(android.R.id.empty));
		uPreferences = PreferenceManager.getDefaultSharedPreferences(this);
		String username = uPreferences.getString("username", null);
		
		ApiRequests req = new ApiRequests();
		uInfo = req.getUserInfo(username);
		uListView.setAdapter(new TopsAdapter(this, uInfo, new OnClickListener() {
			public void onClick(View v) {
			}
		}));

	}
}