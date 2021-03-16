
public class Tier {
	
	public Tier() {}
	
	public Tier(String liscensor, String rights, String tierName, String wsp, String rtp) {
		this.liscensor = liscensor;
		this.rights = rights;
		this.tierName = tierName;
		this.wsp = stringToDouble(wsp);
		this.rtp = stringToDouble(rtp);	
	}
	
	public String getliscensor() {
		return liscensor;
	}
	public void setliscensor(String liscensor) {
		this.liscensor = liscensor;
	}

	public String gettierName() {
		return tierName;
	}

	public void settierName(String tierName) {
		this.tierName = tierName;
	}

	public double getWsp() {
		return wsp;
	}

	public void setWsp(double wsp) {
		this.wsp = wsp;
	}

	public double getRtp() {
		return rtp;
	}

	public void setRtp(double rtp) {
		this.rtp = rtp;
	}
	
	public boolean isNumber(String string) {
		try {
            @SuppressWarnings("unused")
			Double num = Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
	}
	
	public double stringToDouble(String str) {
		if (!isNumber(str)) {
			return -1;
		} else {
			try {
				return Double.parseDouble(str);
			} catch (NumberFormatException e) {
				return -1;
			}
		}
	}

	public String getRights() {
		return rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}

	private String liscensor;
	private String rights;
	private String tierName;
	private double wsp;
	private double rtp;	
}
