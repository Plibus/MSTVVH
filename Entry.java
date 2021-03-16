import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.poi.ss.usermodel.DateUtil;

public class Entry {
	public Entry() {}
	public Entry(String[] strs) {
		
		setTitle(strs[0]);
		setVersionTitle(strs[1]);
		setSerieTitle(strs[2]);
		setSeasonTitle(strs[3]);
		setSeasonnumber(strs[4]);
		setEpisodeTitle(strs[5]);
		setEpisodenumber(strs[6]);
		setNumberOfEpisodes(strs[7]);
		 
		setContentOwner(strs[7]);
		setLicensor(strs[9]);
		setCountry(strs[10]);
		setProductType(strs[11]);
		setStudio(strs[12]);
		setNetwork(strs[13]);
		 
		setPID(strs[14]);
		setEIDR(strs[15]);
		setExternalId1(strs[16]);
		setExternalId2(strs[17]);
		setISAN(strs[18]);
		setPriority(strs[19]);

		setRight(strs[20]);
		setLicenseType(strs[21]);
		setFormatProfile(strs[22]);
		 
		setStartDate(strs[23]);
		setStreetDate(strs[24]);
		setReleaseDate(strs[25]);
		setEndDate(strs[26]);

		setTier(strs[27]);
		setPriceType(strs[28]);
		setWholesaleprice(strs[29]);
		setRetailprice(strs[30]);
		setSDWholesaleprice(strs[31]);
		setSDRetailprice(strs[32]);
		setHDWholesaleprice(strs[32]);
		setHDRetailprice(strs[34]);
		
		validate();
	}
	
	public Entry(Entry e) {
		
		setTitle(e.getTitle());
		setVersionTitle(e.getVersionTitle());
		setSerieTitle(e.getSerieTitle());
		setSeasonTitle(e.getSeasonTitle());
		setSeasonnumber(e.getSeasonnumber());
		setEpisodeTitle(e.getEpisodeTitle());
		setEpisodenumber(e.getEpisodenumber());
		setNumberOfEpisodes(e.getNumberOfEpisodes());
		 
		setContentOwner(e.getContentOwner());
		setLicensor(e.getLicensor());
		setCountry(e.getCountry());
		setProductType(e.getPriceType());
		setStudio(e.getStudio());
		setNetwork(e.getNetwork());
		 
		setPID(e.getPID());
		setEIDR(e.getEIDR());
		setExternalId1(e.getExternalId1());
		setExternalId2(e.getExternalId2());
		setISAN(e.getISAN());
		setPriority(e.getPriority());

		setRight(e.getRight());
		setLicenseType(e.getLicenseType());
		setFormatProfile(e.getFormatProfile());
		 
		setStartDate(e.getStartDate());
		setStreetDate(e.getStreetDate());
		setReleaseDate(e.getReleaseDate());
		setEndDate(e.getEndDate());
		 
		setNewContentOwner(e.getNewContentOwner());
		setNewNetwork(e.getNewNetwork());
		setNewStudio(e.getNewStudio());

		setTier(e.getTier());
		setPriceType(e.getPriceType());
		setWholesaleprice(e.getWholesaleprice());
		setRetailprice(e.getRetailprice());
		setSDWholesaleprice(e.getSDWholesaleprice());
		setSDRetailprice(e.getSDRetailprice());
		setHDWholesaleprice(e.getHDWholesaleprice());
		setHDRetailprice(e.getHDRetailprice());
		
		setErrorString(e.getErrorString());
	}
	
	public Calendar doubleToDate(double x) throws ParseException {
		if (x > 0) {
			return toCalendar(DateUtil.getJavaDate(x));
		} 
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 3000);
		// We will have to increment the month field by 1
		date.set(Calendar.MONTH, 0);
		// As the month indexing starts with 0
		date.set(Calendar.DAY_OF_MONTH, 1);
		return date;
	} 
	
	public static Calendar toCalendar(Date date){
		  Calendar cal = Calendar.getInstance();
		  cal.setTime(date);
		  return cal;
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
	
	public double stringToDouble(String doubleStr) {
		if (doubleStr.contentEquals("") || !isNumber(doubleStr)) {
			return -1;
		} else {
			try {
				return Double.parseDouble(doubleStr);
			} catch (NumberFormatException e) {
				return -1;
			}
		}
	}
	
	public int stringToInt(String intStr) {
		if (intStr.contentEquals("") || !isNumber(intStr)) {
			return -1;
		} else {
			try {
				return (int) Double.parseDouble(intStr);
			} catch (NumberFormatException e) {
				return -1;
			}
		}
	}
	
	public Calendar dateCheck(String dateStr) {
		Calendar cal = Calendar.getInstance();
		for (int i = 0; i < sdf.length; i++) {
			try {
				cal.setTime(sdf[i].parse(dateStr));
				return cal;
			} catch (ParseException e) {}
		}
		return null;
	}
	
	public Calendar stringToDate(String dateStr) {
		if (dateStr.contentEquals("") || !isNumber(dateStr)) {
			return dateCheck(dateStr);
		} else {
			if (dateStr.length() == 6) {
				int date = stringToInt(dateStr);
				return new GregorianCalendar(date, 0, 1);
			}
			try {
				double date = Double.parseDouble(dateStr);
				return doubleToDate(date);
			} catch (ParseException e) {
				return dateCheck(dateStr);
			}
		}		
	}

	 
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getVersionTitle() {
		return VersionTitle;
	}
	public void setVersionTitle(String versionTitle) {
		VersionTitle = versionTitle;
	}
	public String getSerieTitle() {
		return SerieTitle;
	}
	public void setSerieTitle(String serieTitle) {
		SerieTitle = serieTitle;
	}
	public String getSeasonTitle() {
		return SeasonTitle;
	}
	public void setSeasonTitle(String seasonTitle) {
		SeasonTitle = seasonTitle;
	}
	public int getSeasonnumber() {
		return Seasonnumber;
	}
	public void setSeasonnumber(int seasonnumber) {
		Seasonnumber = seasonnumber;
	}
	public void setSeasonnumber(String seasonnumber) {
		Seasonnumber = stringToInt(seasonnumber);
	}
	public String getEpisodeTitle() {
		return EpisodeTitle;
	}
	public void setEpisodeTitle(String episodeTitle) {
		EpisodeTitle = episodeTitle;
	}
	public int getEpisodenumber() {
		return Episodenumber;
	}
	public void setEpisodenumber(int episodenumber) {
		Episodenumber = episodenumber;
	}
	public void setEpisodenumber(String episodenumber) {
		Episodenumber = stringToInt(episodenumber);
	}
	public int getNumberOfEpisodes() {
		return NumberOfEpisodes;
	}
	public void setNumberOfEpisodes(int numberOfEpisodes) {
		NumberOfEpisodes = numberOfEpisodes;
	}
	public void setNumberOfEpisodes(String numberOfEpisodes) {
		NumberOfEpisodes = stringToInt(numberOfEpisodes);
	}
	public String getContentOwner() {
		return ContentOwner;
	}
	public void setContentOwner(String contentOwner) {
		ContentOwner = contentOwner;
	}
	public String getLicensor() {
		return Licensor;
	}
	public void setLicensor(String licensor) {
		Licensor = licensor;
	}

	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getProductType() {
		return ProductType;
	}
	public void setProductType(String productType) {
		ProductType = productType;
	}
	public String getStudio() {
		return Studio;
	}
	public void setStudio(String studio) {
		Studio = studio;
	}
	public String getNetwork() {
		return Network;
	}
	public void setNetwork(String network) {
		Network = network;
	}
	public String getPID() {
		return PID;
	}
	public void setPID(String pID) {
		PID = pID;
	}
	public String getEIDR() {
		return EIDR;
	}
	public void setEIDR(String eIDR) {
		EIDR = eIDR;
	}
	public String getExternalId1() {
		return ExternalId1;
	}
	public void setExternalId1(String externalId1) {
		ExternalId1 = externalId1;
	}
	public String getExternalId2() {
		return ExternalId2;
	}
	public void setExternalId2(String externalId2) {
		ExternalId2 = externalId2;
	}
	public String getISAN() {
		return ISAN;
	}
	public void setISAN(String iSAN) {
		ISAN = iSAN;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	public String getRight() {
		return Right;
	}
	public void setRight(String right) {
		Right = right;
	}
	public String getLicenseType() {
		return LicenseType;
	}
	public void setLicenseType(String licenseType) {
		LicenseType = licenseType;
	}
	public String getFormatProfile() {
		return FormatProfile;
	}
	public void setFormatProfile(String formatProfile) {
		FormatProfile = formatProfile;
	}
	public Calendar getStartDate() {
		return StartDate;
	}
	public void setStartDate(Calendar startDate) {
		StartDate = startDate;
	}
	public void setStartDate(String startDate) {
		StartDate = stringToDate(startDate);
	}
	public Calendar getStreetDate() {
		return StreetDate;
	}
	public void setStreetDate(Calendar streetDate) {
		StreetDate = streetDate;
	}
	public void setStreetDate(String streetDate) {
		StreetDate = stringToDate(streetDate);
	}
	public Calendar getReleaseDate() {
		return ReleaseDate;
	}
	public void setReleaseDate(Calendar releaseDate) {
		ReleaseDate = releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		ReleaseDate = stringToDate(releaseDate);
	}
	public Calendar getEndDate() {
		return EndDate;
	}
	public void setEndDate(Calendar endDate) {
		EndDate = endDate;
	}
	public void setEndDate(String endDate) {
		EndDate = stringToDate(endDate);
	}
	public String getNewContentOwner() {
		return NewContentOwner;
	}
	public void setNewContentOwner(String newContentOwner) {
		NewContentOwner = newContentOwner;
	}
	public String getNewNetwork() {
		return NewNetwork;
	}
	public void setNewNetwork(String newNetwork) {
		NewNetwork = newNetwork;
	}
	public String getNewStudio() {
		return NewStudio;
	}
	public void setNewStudio(String newStudio) {
		NewStudio = newStudio;
	}
	public String getTier() {
		return Tier;
	}
	public void setTier(String tier) {
		Tier = tier;
	}
	public String getPriceType() {
		return PriceType;
	}
	public void setPriceType(String priceType) {
		PriceType = priceType;
	}
	public double getWholesaleprice() {
		return Wholesaleprice;
	}
	public void setWholesaleprice(double wholesaleprice) {
		Wholesaleprice = wholesaleprice;
	}
	public void setWholesaleprice(String wholesaleprice) {
		Wholesaleprice = stringToDouble(wholesaleprice);
	}
	public double getRetailprice() {
		return Retailprice;
	}
	public void setRetailprice(double retailprice) {
		Retailprice = retailprice;
	}
	public void setRetailprice(String retailprice) {
		Retailprice = stringToDouble(retailprice);
	}
	public double getSDWholesaleprice() {
		return SDWholesaleprice;
	}
	public void setSDWholesaleprice(double sDWholesaleprice) {
		SDWholesaleprice = sDWholesaleprice;
	}
	public void setSDWholesaleprice(String sDWholesaleprice) {
		SDWholesaleprice = stringToDouble(sDWholesaleprice);
	}
	public double getSDRetailprice() {
		return SDRetailprice;
	}
	public void setSDRetailprice(double sDRetailprice) {
		SDRetailprice = sDRetailprice;
	}
	public void setSDRetailprice(String sDRetailprice) {
		SDRetailprice = stringToDouble(sDRetailprice);
	}
	public double getHDWholesaleprice() {
		return HDWholesaleprice;
	}
	public void setHDWholesaleprice(double hDWholesaleprice) {
		HDWholesaleprice = hDWholesaleprice;
	}
	public void setHDWholesaleprice(String hDWholesaleprice) {
		HDWholesaleprice = stringToDouble(hDWholesaleprice);
	}
	public double getHDRetailprice() {
		return HDRetailprice;
	}
	public void setHDRetailprice(double hDRetailprice) {
		HDRetailprice = hDRetailprice;
	}
	public void setHDRetailprice(String hDRetailprice) {
		HDRetailprice = stringToDouble(hDRetailprice);
	}
	public String getErrorString() {
		return ErrorString;
	}
	public void setErrorString(String errorString) {
		ErrorString = errorString;
	}

	private void validate() {
		 validateCountry();
		 validatePriceType();
		 validateEndDate();
		 validateReleaseStreetDate();
		 validateProductType();
		 validatePosition();		 
	 }

	 private void validateCountry() {
		 for (int i = 0; i < countries.length; i ++) {
	    		if (getCountry().contentEquals(countries[i])) {
	    			return;
	    		}
	    	}
	    	for (int i = 0; i < fullCountries.length; i ++) {
	    		if (getCountry().contentEquals(fullCountries[i])) {
	    			setCountry(countries[i]);
	    			return;
	    		}
	    	}
	    	System.out.println("Cannot validate country: " + getCountry());
	 }
	 
	 private void validatePriceType() {
		 if (!getPriceType().contentEquals("Category") || !getPriceType().contentEquals("WSP")) {
	    	if (getWholesaleprice() != -1) {
	    		setPriceType("WSP");
	    	} else {
	    		setPriceType("Category");
	    	}
	    }
	 }
	 
	private void validateEndDate() {
		 if (getEndDate().compareTo(getStartDate()) >= 0) {
			 setErrorString(getErrorString() + "End date pre-dates start date.\n");
	    }
	 }
	 
	 private void validateReleaseStreetDate() {
		 if (!(getReleaseDate() == null) || !(getStreetDate() == null)) {
			 if (getReleaseDate() == null) {
				 setReleaseDate(getStreetDate());
			 } else if (getStreetDate() == null) {
				 setStreetDate(getReleaseDate());
			 } else {
				 return;
			 }
		 } else {
			 setStreetDate(getStartDate());
			 setReleaseDate(getStartDate());
		 }
	 }
	 
	 private void validateProductType() {
		 if (getSerieTitle() != "") {
			 if (getSeasonnumber() != -1) {
				 if (getEpisodenumber() != -1) {
					 setProductType("TV Episode");
		    	 } else {
		    		 setProductType("TV Season");
		    	 }
		     } else {
		    	 setProductType("TV Series");
		   	 }
	    } else {
	    	setProductType("Movie");
	    }  
	 }
	
	 private void validatePosition() {		 
		 if (getProductType().contentEquals("TV Episode")) {
			 setNumberOfEpisodes(Episodenumber);
		 } else if (getProductType().contentEquals("TV Season")) {
			 setNumberOfEpisodes(Seasonnumber);
		 } else {
			 return;
		 }
	 }
	
	public int getPosition() {
		return Position;
	}
	public void setPosition(int position) {
		Position = position;
	}

	private String Title = "";
	private String VersionTitle = "";
	private String SerieTitle = "";
	private String SeasonTitle = "";
	private int Seasonnumber = -1;
	private String EpisodeTitle = "";
	private int Episodenumber = -1;
	private int NumberOfEpisodes = -1;
	private int Position = -1;
	
	private String ContentOwner = "";
	private String Licensor = "";
	private String Country = "";
	private String ProductType = "";
	private String Studio = "";
	private String Network = "";
	
	private String PID = "";
	private String EIDR = "";
	private String ExternalId1 = "";
	private String ExternalId2 = "";
	private String ISAN = "";
	private String Priority = "";
	private String Right = "";
	private String LicenseType = "";
	private String FormatProfile = "";
	
	private Calendar StartDate = null;
	private Calendar StreetDate = null;
	private Calendar ReleaseDate = null;
	private Calendar EndDate = null;
	
	private String NewContentOwner = "";
	private String NewNetwork = "";
	private String NewStudio = "";
	private String Tier = "";
	private String PriceType = "";
	private double Wholesaleprice = 0.0;
	private double Retailprice = 0.0;
	private double SDWholesaleprice = 0.0;
	private double SDRetailprice = 0.0;
	private double HDWholesaleprice = 0.0;
	private double HDRetailprice = 0.0;
	private String ErrorString = "";
	
	DateFormat yeardf = new SimpleDateFormat("yyyy"); 
	 
	 private SimpleDateFormat[] sdf = new SimpleDateFormat[] {	new SimpleDateFormat("yyyy"),
			 													new SimpleDateFormat("yyyy-MM-dd"),		//“2018-07-14”
			 													new SimpleDateFormat("dd-MMM-yyyy"),	//“14-Jul-2018”
			 													new SimpleDateFormat("dd/MM/yyyy"),		//“14/07/2018”
			 													new SimpleDateFormat("MMM, dd yyyy"),	//"Jul, 14 2018”
			 													new SimpleDateFormat("dd-MM-yy")};		//"15-Mar-14"
	
	 private String[] countries = new String[] {"US", "BR", "MX", "CA", "AU", "NZ", "AT", "BE", "DK", "FI", "FR", "DE", "IE", "IT", "NL", "NO", "ES", "SE", "CH", "GB"};
	 private String[] fullCountries = new String[] {"United Statea", "Brazil", "Mexico", "Canada", "Australia", "New Zealand", "Austria", "Belgium", "Denmark", "Finland", "France", "Germany", "Ireland", "Italy", "Netherlands", "Norway", "Spain", "Sweden", "Switzerland", "Great Britain"};
}
