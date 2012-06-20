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
	ArrayList<UserInfo> mItems;
	/** Called when a list item is clicked */
	OnClickListener mOnItemClick;
	Context mContext;

	public TopsAdapter(Context context, ArrayList<UserInfo> items, 
			OnClickListener onItemClick) {
		mItems = new ArrayList<UserInfo>();
		mOnItemClick = onItemClick;
		mContext = context;
		mItems = items;
	}

	public int getCount() {
		return mItems.size();
	}

	public Object getItem(int index) {
		return mItems.get(index);
	}

	public long getItemId(int index) {
		return index;
	}

	public View getView(int index, View convertView, ViewGroup parent) {
		BazaarItemView item;

		item = new TopsItemView(mContext, mItems.get(index));
		item.setOnClickListener(mOnItemClick);
		item.setClickable(true);

		return item;
	}
	
}
