package graphene.model.idl;

/**
 * We'll see how well this works. The idea is that certain core functionality is
 * exposed through some known services, especially for constructing query
 * parameters in REST calls.
 * 
 * For instance, if the server side responds that you should use a comma for
 * multiple values, your js front end can now construct query parameters using
 * commas. This allows the back end to drive parts of the front end (such as
 * displaying supported search types, etc)
 * 
 * 
 * See this reference for valid delimiters:
 * http://tools.ietf.org/html/rfc3986#appendix-A
 * 
 * TODO: May need to change property type delimiter if it conflicts
 * 
 * @author djue
 * 
 */
@Deprecated
public enum G_Delimiter {
	INVALID(999, "INVALID", "", "INVALID"), MULTIPLE_VALUE(0, "multiple", ",", "Item1,Item2,Item3"), SEARCH_TYPE(1,
			"Search Type", ":", "<SearchType>:Item1"), PROPERTY_TYPE(2, "Property Type", "=", "<PropertyType>=Item1");

	public static G_Delimiter fromIndex(final int v) {
		for (final G_Delimiter c : values()) {
			if (c.index == v) {
				return c;
			}
		}
		return INVALID;
	}

	public static G_Delimiter fromValue(final String v) {
		for (final G_Delimiter c : values()) {
			if (c.getValueString().equalsIgnoreCase(v)) {
				return c;
			}
		}
		return INVALID;
	}

	private String friendlyName;
	private int index;

	private String usage;

	private String valueString;

	G_Delimiter(final int i, final String friendlyName, final String valueString, final String usage) {
		setIndex(i);
		setFriendlyName(friendlyName);
		setUsage(usage);
		setValueString(valueString);
	}

	public String getFriendlyName() {
		return friendlyName;
	}

	public int getIndex() {
		return index;
	}

	public String getUsage() {
		return usage;
	}

	public String getValueString() {
		return valueString;
	}

	public void setFriendlyName(final String friendlyName) {
		this.friendlyName = friendlyName;
	}

	public void setIndex(final int index) {
		this.index = index;
	}

	public void setUsage(final String usage) {
		this.usage = usage;
	}

	public void setValueString(final String valueString) {
		this.valueString = valueString;
	}
}
