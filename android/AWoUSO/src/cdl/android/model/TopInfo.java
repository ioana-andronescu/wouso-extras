package cdl.android.model;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

public class TopInfo {
	String firstName;
	String lastName;
	LevelInfo levelInfo;
	int levelNo;
	String race;
	int points;
	int id;
	
	public TopInfo(JSONObject obj) {
		try {
			firstName = obj.getString("first_name");
			lastName = obj.getString("last_name");
			points = obj.getInt("points");
			id = obj.getInt("id");
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public LevelInfo getLevelInfo() {
		return levelInfo;
	}

	public void setLevelInfo(LevelInfo level) {
		this.levelInfo = level;
	}

	public int getLevelNo() {
		return levelNo;
	}

	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
}
