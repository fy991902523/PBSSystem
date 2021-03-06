package pbs.base.pojo.po;

public class PbsRentInfo {
    private Integer id;

    private String zoneName;

    private String road;

    private String rentName;

    private Integer maxNumber;

    private Float lat;

    private Float lng;

    private String leftOrRight;

    private Integer rentRank;

    private Integer areaId;

    private Float topLimit;

    private Float lowLimit;

    private String operNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName == null ? null : zoneName.trim();
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road == null ? null : road.trim();
    }

    public String getRentName() {
        return rentName;
    }

    public void setRentName(String rentName) {
        this.rentName = rentName == null ? null : rentName.trim();
    }

    public Integer getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Integer maxNumber) {
        this.maxNumber = maxNumber;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public String getLeftOrRight() {
        return leftOrRight;
    }

    public void setLeftOrRight(String leftOrRight) {
        this.leftOrRight = leftOrRight == null ? null : leftOrRight.trim();
    }

    public Integer getRentRank() {
        return rentRank;
    }

    public void setRentRank(Integer rentRank) {
        this.rentRank = rentRank;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Float getTopLimit() {
        return topLimit;
    }

    public void setTopLimit(Float topLimit) {
        this.topLimit = topLimit;
    }

    public Float getLowLimit() {
        return lowLimit;
    }

    public void setLowLimit(Float lowLimit) {
        this.lowLimit = lowLimit;
    }

    public String getOperNum() {
        return operNum;
    }

    public void setOperNum(String operNum) {
        this.operNum = operNum == null ? null : operNum.trim();
    }
}