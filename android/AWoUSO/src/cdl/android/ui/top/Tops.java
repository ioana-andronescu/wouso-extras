/*package cdl.android.ui.top;

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
import cdl.android.model.TopInfo;
import cdl.android.model.UserInfo;
import cdl.android.server.ApiRequests;
import cdl.android.ui.bazaar.BazaarAdapter;


public class Tops extends Activity {
	private TopInfo tInfo;
	SharedPreferences uPreferences;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tops);

		ListView tListView = (ListView) findViewById(android.R.id.list);
		tListView.setEmptyView(findViewById(android.R.id.empty));
		tPreferences = PreferenceManager.getDefaultSharedPreferences(this);
		String username = tPreferences.getString("username", null);
		
		ApiRequests req = new ApiRequests();
		tInfo = req.getUserInfo(username);
		tListView.setAdapter(new TopsAdapter(this, uInfo, new OnClickListener() {
			public void onClick(View v) {
			}
		}));

	}
}*/
