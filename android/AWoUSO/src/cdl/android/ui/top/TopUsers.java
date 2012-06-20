package cdl.android.ui.top;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import cdl.android.R;

public class TopUsers extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		TextView textview = new TextView(this);
		textview.setText("This is the Top Users tab");
		setContentView(R.layout.tab_view);
	}
}
