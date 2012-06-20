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

/**
 * Bazaar Tab Activity
 */
public class TopsTabs extends TabActivity {

	/*public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.tab_view);
		
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
		
		intent = new Intent().setClass(this, TopsTabs.class);
		spec = tabHost.newTabSpec("tops").setIndicator("Top users")
				.setContent(intent);
		tabHost.addTab(spec);
		
		/*intent = new Intent().setClass(this, Exchange.class);
		spec = tabHost.newTabSpec("exchange").setIndicator("Exchange",
				res.getDrawable(R.drawable.spell_yellow))
				.setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, Summary.class);
		spec = tabHost.newTabSpec("summary").setIndicator("Summary",
				res.getDrawable(R.drawable.spell_green))
				.setContent(intent);
		tabHost.addTab(spec);
		
		tabHost.setCurrentTab(0);
	}*/
	
}