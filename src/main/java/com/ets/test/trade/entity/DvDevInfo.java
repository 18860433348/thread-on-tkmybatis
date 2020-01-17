package com.ets.test.trade.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "DV_DEV_INFO")
public class DvDevInfo implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select seq_dv_dev_info.nextval from dual")
    private Integer id;

    @Column(name = "LEGAL_PERSON_CODE")
    private String legalPersonCode;

    @Column(name = "DEV_TYPE_ID")
    private Integer devTypeId;

    @Column(name = "MAIN_KEY")
    private String mainKey;

    @Column(name = "DEV_SN")
    private String devSn;

    @Column(name = "NAME")
    private String name;

    @Column(name = "STATION_ID")
    private Integer stationId;

    @Column(name = "MAC")
    private Integer mac;

    @Column(name = "DEV_DEPT_ID")
    private Integer devDeptId;

    @Column(name = "ACC_CODE")
    private Integer accCode;

    @Column(name = "ACC_DES")
    private String accDes;

    @Column(name = "MCH_NO")
    private String mchNo;

    @Column(name = "MCH_KEY")
    private String mchKey;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "APP_NAME")
    private String appName;

    @Column(name = "APP_VER")
    private Integer appVer;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "OP_ID")
    private Integer opId;

    @Column(name = "PARAM_GROUP_ID")
    private Integer paramGroupId;

    @Column(name = "PARAM_GROUP_VER")
    private Integer paramGroupVer;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return LEGAL_PERSON_CODE
     */
    public String getLegalPersonCode() {
        return legalPersonCode;
    }

    /**
     * @param legalPersonCode
     */
    public void setLegalPersonCode(String legalPersonCode) {
        this.legalPersonCode = legalPersonCode;
    }

    /**
     * @return DEV_TYPE_ID
     */
    public Integer getDevTypeId() {
        return devTypeId;
    }

    /**
     * @param devTypeId
     */
    public void setDevTypeId(Integer devTypeId) {
        this.devTypeId = devTypeId;
    }

    /**
     * @return MAIN_KEY
     */
    public String getMainKey() {
        return mainKey;
    }

    /**
     * @param mainKey
     */
    public void setMainKey(String mainKey) {
        this.mainKey = mainKey;
    }

    /**
     * @return DEV_SN
     */
    public String getDevSn() {
        return devSn;
    }

    /**
     * @param devSn
     */
    public void setDevSn(String devSn) {
        this.devSn = devSn;
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return STATION_ID
     */
    public Integer getStationId() {
        return stationId;
    }

    /**
     * @param stationId
     */
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    /**
     * @return MAC
     */
    public Integer getMac() {
        return mac;
    }

    /**
     * @param mac
     */
    public void setMac(Integer mac) {
        this.mac = mac;
    }

    /**
     * @return DEV_DEPT_ID
     */
    public Integer getDevDeptId() {
        return devDeptId;
    }

    /**
     * @param devDeptId
     */
    public void setDevDeptId(Integer devDeptId) {
        this.devDeptId = devDeptId;
    }

    /**
     * @return ACC_CODE
     */
    public Integer getAccCode() {
        return accCode;
    }

    /**
     * @param accCode
     */
    public void setAccCode(Integer accCode) {
        this.accCode = accCode;
    }

    /**
     * @return ACC_DES
     */
    public String getAccDes() {
        return accDes;
    }

    /**
     * @param accDes
     */
    public void setAccDes(String accDes) {
        this.accDes = accDes;
    }

    /**
     * @return MCH_NO
     */
    public String getMchNo() {
        return mchNo;
    }

    /**
     * @param mchNo
     */
    public void setMchNo(String mchNo) {
        this.mchNo = mchNo;
    }

    /**
     * @return MCH_KEY
     */
    public String getMchKey() {
        return mchKey;
    }

    /**
     * @param mchKey
     */
    public void setMchKey(String mchKey) {
        this.mchKey = mchKey;
    }

    /**
     * @return STATUS
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return APP_NAME
     */
    public String getAppName() {
        return appName;
    }

    /**
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * @return APP_VER
     */
    public Integer getAppVer() {
        return appVer;
    }

    /**
     * @param appVer
     */
    public void setAppVer(Integer appVer) {
        this.appVer = appVer;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return OP_ID
     */
    public Integer getOpId() {
        return opId;
    }

    /**
     * @param opId
     */
    public void setOpId(Integer opId) {
        this.opId = opId;
    }

    /**
     * @return PARAM_GROUP_ID
     */
    public Integer getParamGroupId() {
        return paramGroupId;
    }

    /**
     * @param paramGroupId
     */
    public void setParamGroupId(Integer paramGroupId) {
        this.paramGroupId = paramGroupId;
    }

    /**
     * @return PARAM_GROUP_VER
     */
    public Integer getParamGroupVer() {
        return paramGroupVer;
    }

    /**
     * @param paramGroupVer
     */
    public void setParamGroupVer(Integer paramGroupVer) {
        this.paramGroupVer = paramGroupVer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", legalPersonCode=").append(legalPersonCode);
        sb.append(", devTypeId=").append(devTypeId);
        sb.append(", mainKey=").append(mainKey);
        sb.append(", devSn=").append(devSn);
        sb.append(", name=").append(name);
        sb.append(", stationId=").append(stationId);
        sb.append(", mac=").append(mac);
        sb.append(", devDeptId=").append(devDeptId);
        sb.append(", accCode=").append(accCode);
        sb.append(", accDes=").append(accDes);
        sb.append(", mchNo=").append(mchNo);
        sb.append(", mchKey=").append(mchKey);
        sb.append(", status=").append(status);
        sb.append(", appName=").append(appName);
        sb.append(", appVer=").append(appVer);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", opId=").append(opId);
        sb.append(", paramGroupId=").append(paramGroupId);
        sb.append(", paramGroupVer=").append(paramGroupVer);
        sb.append("]");
        return sb.toString();
    }
}