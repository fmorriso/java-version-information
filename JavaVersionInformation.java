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
		String suppressVal = "";
		final String suppressKey = "user.name";
		if (props.get(suppressKey) instanceof String) {
			suppressVal = (String) props.get(suppressKey);
		}
		// display any property with a string-type key and a string-type value that is not otherwise
		// suppressed
		for (Entry<Object, Object> prop : props.entrySet()) {
			key = "";
			if (prop.getKey() instanceof String) {
				key = (String) prop.getKey();
				if (key.equalsIgnoreCase(suppressKey))
					continue;
			}

			val = "";
			if (prop.getValue() instanceof String) {
				val = (String) prop.getValue();
				// suppress private information from showing on the output
				int idx = val.indexOf(suppressVal);
				if (idx > 0) {
					val = val.substring(0, idx).concat("...snip...");
				}
			}
			if (!(key.isBlank() || val.isBlank())) {
				System.out.format("key=%s, value=%s%n", key, val);
			}

		}

	}
}