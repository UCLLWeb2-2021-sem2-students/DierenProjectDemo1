package domain.model;

public enum DierSoort {
	HOND("hond"),
	KAT("kat"),
	KANARIE("kanarie"),
	KIP("kip");
	
	private String stringvalue;
	private DierSoort(String stringvalue) {
		this.stringvalue = stringvalue;
	}
	
	
	public String getStringvalue (){
		return stringvalue;
	}
}
