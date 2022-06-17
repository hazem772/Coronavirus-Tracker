package io.javabrains.coronavirustracker;

public class LocationStats {

	private String state;
	private String country;
	private int latestToatalCases;
	private int diffFromPrevDay;

	public int getDiffFromPrevDay() {
		return diffFromPrevDay;
	}
	public void setDiffFromPrevDay(int diffFromPrevDay) {
		this.diffFromPrevDay = diffFromPrevDay;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestToatalCases() {
		return latestToatalCases;
	}
	public void setLatestToatalCases(int latestToatalCases) {
		this.latestToatalCases = latestToatalCases;
	}
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ","
				+ " country=" + country + ", "
				+ "latestToatalCases=" + latestToatalCases
				+ "]";
	}
}
