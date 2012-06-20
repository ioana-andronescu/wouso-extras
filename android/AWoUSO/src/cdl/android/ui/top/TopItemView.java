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
import cdl.android.model.UserInfo;

public class TopItemView extends LinearLayout {
	UserInfo uInfo;
	Context mContext;
	
	public TopItemView(Context context, UserInfo uInfo) {
		super(context);
		mContext = context;
		this.uInfo = uInfo;
		
		LayoutInflater layoutInflater = (LayoutInflater) 
		getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		layoutInflater.inflate(R.layout.tab_view, this, true);
		
		TextView title = (TextView) findViewById(R.id.title);
		title.setText(uInfo.getFirstName());
		
		TextView desc = (TextView) findViewById(R.id.description);
		desc.setText(uInfo.);

		TextView price = (TextView) findViewById(R.id.price);
		price.setText(item.getPrice());
		
		TextView due = (TextView) findViewById(R.id.days);
		due.setText(item.getDueDays());
		
		Button buy = (Button) findViewById(R.id.buyButton);
		buy.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				System.out.println("Buuuuuy " + mItem.getTitle());				
			}
		});
		
	}
}
