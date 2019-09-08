/* 
 * Display java run-time information
 * Author: Fred Morrison
 * Date written: 2019-09-08
 *  */
import java.util.Map.Entry;
import java.util.Properties;

public class JavaVersionInformation {

	public static void main(String[] args) {
		Properties props = System.getProperties();
		// System.out.println(props);
		String key = "", val = "";
		// display any propert with a string-type key and a string-type value
		for (Entry<Object, Object> prop : props.entrySet()) {
			key = "";
			if (prop.getKey() instanceof String) {
				key = (String) prop.getKey();
			}

			val = "";
			if (prop.getValue() instanceof String) {
				val = (String) prop.getValue();
			}
			if (!(key.isBlank() || val.isBlank())) {
				System.out.format("key=%s, value=%s%n", key, val);
			}
		}
	}

}
