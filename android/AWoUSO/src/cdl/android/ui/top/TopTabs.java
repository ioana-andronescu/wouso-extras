package cdl.android.ui.top;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TabHost;
import cdl.android.R;
import cdl.android.ui.bazaar.Bazaar;
import cdl.android.ui.bazaar.Exchange;
import cdl.android.ui.bazaar.Summary;

public class TopTabs extends TabActivity {
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.tab_layout);
		
		Button button = (Button) findViewById(R.id.button_back);
		Resources res = getResources();
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
		
		intent = new Intent().setClass(this, TopUsers.class);
		spec = tabHost.newTabSpec("tops").setIndicator("Top",
				res.getDrawable(R.drawable.spell_purple))
				.setContent(intent);
		tabHost.addTab(spec);
		
		tabHost.setCurrentTab(0);
	}
}
