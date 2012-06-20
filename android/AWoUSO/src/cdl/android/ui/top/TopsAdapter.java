package cdl.android.ui.top;

import java.util.ArrayList;

import cdl.android.model.BazaarItem;
import cdl.android.model.UserInfo;
import cdl.android.ui.bazaar.BazaarItemView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;

public class TopsAdapter extends BaseAdapter {

	/** Array filled with list's elements */
	ArrayList<UserInfo> uInfo;
	/** Called when a list item is clicked */
	OnClickListener uOnItemClick;
	Context uContext;

	public TopsAdapter(Context context, ArrayList<UserInfo> items, 
			OnClickListener onItemClick) {
		uInfo = new ArrayList<UserInfo>();
		uOnItemClick = onItemClick;
		uContext = context;
		uInfo = items;
	}

	public int getCount() {
		return uInfo.size();
	}

	public Object getItem(int index) {
		return uInfo.get(index);
	}

	public long getUserId(int index) {
		return index;
	}

	public View getView(int index, View convertView, ViewGroup parent) {
		TopItemView item;

		user = new TopUserView(uContext, uInfo.get(index));
		uInfo.setOnClickListener(uOnItemClick);
		uInfo.setClickable(true);

		return uInfo;
	}
	
}
