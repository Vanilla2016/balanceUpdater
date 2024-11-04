package wds.beans.binance;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FilterBean {

	private String filterType;

	@JsonCreator
	public FilterBean(@JsonProperty("filterType") String filterType) {
		this.filterType = filterType;
	}
 	
	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}
}
