package cdl.android.ui.top;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Helper {
	
	public Helper(JSONArray array) {
		try{
		for(int i=0; i<array.length();i++) {
			JSONObject curPlayer = array.getJSONObject(i);
			curPlayer.getString("points");
			curPlayer.getString("last_name");
			curPlayer.getString("first_name");
			curPlayer.getString("id");
		}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
