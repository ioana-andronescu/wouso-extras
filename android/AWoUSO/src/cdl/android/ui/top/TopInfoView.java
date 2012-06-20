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
		layoutInflater.inflate(R.layout.bazaar_list_item, this, true);
		
		TextView firstName = (TextView) findViewById(R.string.firstname);
		firstName.setText(tInfo.getFirstName());
		
		TextView lastName = (TextView) findViewById(R.string.lastname);
		lastName.setText(tInfo.getLastName());
		
		TextView points = (TextView) findViewById(R.string.points);
		points.setText(tInfo.getPoints());
		
		//TextView serie = (TextView) findViewById(R.string.serie);
		//serie.setText(tInfo.);
		
		
	}
}
