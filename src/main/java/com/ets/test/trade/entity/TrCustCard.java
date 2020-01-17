package com.ets.test.trade.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "TR_CUST_CARD")
public class TrCustCard implements Serializable {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select seq_tr_cust_card.nextval from dual")
    private Integer id;

    @Column(name = "LEGAL_PERSON_CODE")
    private String legalPersonCode;

    @Column(name = "CARD_NO")
    private String cardNo;

    @Column(name = "CUST_CODE")
    private String custCode;

    @Column(name = "CARD_INDEX")
    private Integer cardIndex;

    @Column(name = "CARD_SN")
    private Integer cardSn;

    @Column(name = "CARD_STATUS")
    private Integer cardStatus;

    @Column(name = "CARD_TYPE")
    private Integer cardType;

    @Column(name = "VER")
    private Integer ver;

    @Column(name = "BEGIN_TIME")
    private Date beginTime;

    @Column(name = "END_TIME")
    private Date endTime;

    @Column(name = "LIMIT_DAY")
    private Integer limitDay;

    @Column(name = "LIMIT_MEAL")
    private Integer limitMeal;

    @Column(name = "LIMIT_OUT_LINE")
    private Integer limitOutLine;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "OP_ID")
    private Integer opId;

    @Column(name = "REMARK")
    private String remark;

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
     * @return CARD_NO
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * @return CUST_CODE
     */
    public String getCustCode() {
        return custCode;
    }

    /**
     * @param custCode
     */
    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    /**
     * @return CARD_INDEX
     */
    public Integer getCardIndex() {
        return cardIndex;
    }

    /**
     * @param cardIndex
     */
    public void setCardIndex(Integer cardIndex) {
        this.cardIndex = cardIndex;
    }

    /**
     * @return CARD_SN
     */
    public Integer getCardSn() {
        return cardSn;
    }

    /**
     * @param cardSn
     */
    public void setCardSn(Integer cardSn) {
        this.cardSn = cardSn;
    }

    /**
     * @return CARD_STATUS
     */
    public Integer getCardStatus() {
        return cardStatus;
    }

    /**
     * @param cardStatus
     */
    public void setCardStatus(Integer cardStatus) {
        this.cardStatus = cardStatus;
    }

    /**
     * @return CARD_TYPE
     */
    public Integer getCardType() {
        return cardType;
    }

    /**
     * @param cardType
     */
    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    /**
     * @return VER
     */
    public Integer getVer() {
        return ver;
    }

    /**
     * @param ver
     */
    public void setVer(Integer ver) {
        this.ver = ver;
    }

    /**
     * @return BEGIN_TIME
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * @param beginTime
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * @return END_TIME
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return LIMIT_DAY
     */
    public Integer getLimitDay() {
        return limitDay;
    }

    /**
     * @param limitDay
     */
    public void setLimitDay(Integer limitDay) {
        this.limitDay = limitDay;
    }

    /**
     * @return LIMIT_MEAL
     */
    public Integer getLimitMeal() {
        return limitMeal;
    }

    /**
     * @param limitMeal
     */
    public void setLimitMeal(Integer limitMeal) {
        this.limitMeal = limitMeal;
    }

    /**
     * @return LIMIT_OUT_LINE
     */
    public Integer getLimitOutLine() {
        return limitOutLine;
    }

    /**
     * @param limitOutLine
     */
    public void setLimitOutLine(Integer limitOutLine) {
        this.limitOutLine = limitOutLine;
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
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", legalPersonCode=").append(legalPersonCode);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", custCode=").append(custCode);
        sb.append(", cardIndex=").append(cardIndex);
        sb.append(", cardSn=").append(cardSn);
        sb.append(", cardStatus=").append(cardStatus);
        sb.append(", cardType=").append(cardType);
        sb.append(", ver=").append(ver);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", limitDay=").append(limitDay);
        sb.append(", limitMeal=").append(limitMeal);
        sb.append(", limitOutLine=").append(limitOutLine);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", opId=").append(opId);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}