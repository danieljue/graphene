package graphene.model.idl;

import graphene.model.idlhelper.PropertyHelper;

@Deprecated
public class G_SearchTuple<T> {
	protected G_IdType nodeType;
	protected G_SearchType searchType;
	private String specificPropertyType;
	protected T value;

	/**
	 * Default constructor for when we are building from scratch.
	 */
	public G_SearchTuple() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Helper constructor. Note that if this class ends up being generated by
	 * Avro, we may need to put helper constructors like this in a helper class
	 * that extends this one @see {@link PropertyHelper}
	 * 
	 * @param searchType
	 * @param family
	 * @param specificPropertyType
	 * @param value
	 */
	public G_SearchTuple(final G_SearchType searchType, final G_IdType nodeType, final String specificPropertyType,
			final T value) {
		super();
		this.searchType = searchType;
		this.nodeType = nodeType;
		this.specificPropertyType = specificPropertyType;
		this.value = value;
	}

	/**
	 * Helper constructor
	 * 
	 * @param searchType
	 * @param family
	 * @param value
	 */
	public G_SearchTuple(final G_SearchType searchType, final G_IdType family, final T value) {
		super();
		this.searchType = searchType;
		this.nodeType = family;
		this.specificPropertyType = null;
		this.value = value;
	}

	public G_SearchTuple(final T value, final G_SearchType searchType) {
		this.value = value;
		this.searchType = searchType;
	}

	/**
	 * @return the nodeType
	 */
	public final G_IdType getNodeType() {
		return nodeType;
	}

	public G_SearchType getSearchType() {
		return searchType;
	}

	/**
	 * @return the specificPropertyType
	 */
	public final String getSpecificPropertyType() {
		return specificPropertyType;
	}

	public T getValue() {
		return value;
	}

	/**
	 * @param nodeType
	 *            the nodeType to set
	 */
	public final void setNodeType(final G_IdType nodeType) {
		this.nodeType = nodeType;
	}

	public void setSearchType(final G_SearchType searchType) {
		this.searchType = searchType;
	}

	/**
	 * @param specificPropertyType
	 *            the specificPropertyType to set
	 */
	public final void setSpecificPropertyType(final String specificPropertyType) {
		this.specificPropertyType = specificPropertyType;
	}

	public void setValue(final T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "G_SearchTuple [" + (searchType != null ? "searchType=" + searchType + ", " : "")
				+ (value != null ? "value=" + value : "") + "]";
	}
}
