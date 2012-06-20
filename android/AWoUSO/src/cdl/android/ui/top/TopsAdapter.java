/*package cdl.android.ui.top;

import java.util.ArrayList;

import cdl.android.model.BazaarItem;
import cdl.android.model.TopInfo;
import cdl.android.model.UserInfo;
import cdl.android.ui.bazaar.BazaarItemView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;

public class TopsAdapter extends BaseAdapter {

	/** Array filled with list's elements */
<<<<<<< HEAD
	/*ArrayList<UserInfo> uInfo;
	/** Called when a list item is clicked */
	/*OnClickListener uOnItemClick;
	Context uContext;
=======
	ArrayList<TopInfo> tItems;
	/** Called when a list item is clicked */
	OnClickListener tOnItemClick;
	Context tContext;
>>>>>>> 3fe047a4e3cf5a9a1bc5d8ae0d9e14056cbb2c83

	public TopsAdapter(Context context, ArrayList<TopInfo> items, 
			OnClickListener onItemClick) {
		tItems = new ArrayList<TopInfo>();
		tOnItemClick = onItemClick;
		tContext = context;
		tItems = items;
	}

	public int getCount() {
		return tItems.size();
	}

	public Object getItem(int index) {
		return tItems.get(index);
	}

	public long getItemId(int index) {
		return index;
	}

	public View getView(int index, View convertView, ViewGroup parent) {
		TopInfoView item;

		item = new TopInfoView(tContext, tItems.get(index));
		item.setOnClickListener(tOnItemClick);
		item.setClickable(true);

		return item;
	}
<<<<<<< HEAD
	
}*/
=======
}
>>>>>>> 3fe047a4e3cf5a9a1bc5d8ae0d9e14056cbb2c83
