package prog4;

public class ItemDetails {
	int item_id;
	String item_name;
	float cost;

	ItemDetails(int it, String iname, float c) {
		item_id = it;
		item_name = iname;
		cost = c;
	}

	public String toString() {
		return item_id + " " + item_name + " " + cost + " ";
	}

}
