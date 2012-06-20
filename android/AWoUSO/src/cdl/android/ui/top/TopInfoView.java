package cdl.android.ui.top;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import cdl.android.R;
import cdl.android.model.BazaarItem;
import cdl.android.model.TopInfo;
import cdl.android.model.UserInfo;

public class TopInfoView extends LinearLayout {
	TopInfo tInfo;
	Context tContext;
	
	public TopInfoView(Context context, TopInfo tInfo) {
		super(context);
		tContext = context;
		this.tInfo = tInfo;
		
		LayoutInflater layoutInflater = (LayoutInflater) 
		getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		layoutInflater.inflate(R.layout.tops, this, true);
		
		TextView firstName = (TextView) findViewById(R.string.topgroups);
		firstName.setText(tInfo.getFirstName());

		
	}
}
