package cdl.android.ui.top;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import cdl.android.R;

public class TopSeries extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		TextView textview = new TextView(this);
		textview.setText("This is the Top Series tab");
	//	setContentView(R.layout.topseries);
	}
}
