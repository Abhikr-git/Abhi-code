
public class Commodity implements Comparable{
	private String segmentName;
	private String familyName;
	private String className;
	private String commodityName;
	private int segmentNum;
	private int familyNum;
	private int classNum;
	private int commodityNum;
	public Commodity(String segName, String famName, String comName, String clasName, int seg, int fam, int clas, int com) {
		segmentName = segName;
		familyName = famName;
		className = clasName;
		commodityName = comName;
		segmentNum = seg;
		familyNum = fam;
		classNum = clas;
		commodityNum = com;
	}
	public String getSegmentName() {
		return segmentName;
	}
	public void setSegmentName(String segmentName) {
		this.segmentName = segmentName;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public int getSegmentNum() {
		return segmentNum;
	}
	public void setSegmentNum(int segmentNum) {
		this.segmentNum = segmentNum;
	}
	public int getFamilyNum() {
		return familyNum;
	}
	public void setFamilyNum(int familyNum) {
		this.familyNum = familyNum;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getCommodityNum() {
		return commodityNum;
	}
	public void setCommodityNum(int commodityNum) {
		this.commodityNum = commodityNum;
	}
	@Override
	public String toString() {
		return "Commodity [segmentName=" + segmentName + ", familyName=" + familyName + ", className=" + className
				+ ", commodityName=" + commodityName + ", segmentNum=" + segmentNum + ", familyNum=" + familyNum
				+ ", classNum=" + classNum + ", commodityNum=" + commodityNum + "]";
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Commodity) {
			Commodity o2 = (Commodity)o;
			if(this.getSegmentNum() == o2.getSegmentNum()) {
				if(this.getFamilyNum() == o2.getFamilyNum()) {
					if(this.getClassNum() == o2.getClassNum()) {
						return this.getCommodityNum() - o2.getCommodityNum();
					}
					else {
						return this.getClassNum() - o2.getClassNum();
					}
				}
				else {
					return this.getFamilyNum() - o2.getFamilyNum();
				}
			}
			else {
				return this.getSegmentNum() - o2.getSegmentNum();
			}
		}
		else {
			return Integer.MAX_VALUE;
		}
	}
}
