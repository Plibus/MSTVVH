
public class SourceFail {
	public SourceFail() {}
	public SourceFail(String title, String productType, String contentOwner, String fileName, String issue) {
		setTitle(title);
		setProductType(productType);
		setContentOwner(contentOwner);
		setFileName(fileName);
		setIssue(issue);
	}
	public SourceFail(SourceFail sourceFail) {
		setTitle(sourceFail.getTitle());
		setProductType(sourceFail.getProductType());
		setContentOwner(sourceFail.getContentOwner());
		setFileName(sourceFail.getFileName());
		setIssue(sourceFail.getIssue());
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getContentOwner() {
		return contentOwner;
	}
	public void setContentOwner(String contentOwner) {
		this.contentOwner = contentOwner;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	
	private String title;
	private String productType;
	private String contentOwner;
	private String fileName;
	private String issue;
	
	//Data to store in file
	//ContentOwner
	//SchedulerName
	//RegionSpecific
	//ProductSpecific
	//Contact Info
	
}
