package org.apache.mycat.advisor.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by cjl on 2016/3/20.
 */
@Table(name = "tab_company")
public class TabCompany {
    private Long id;
    private String name;
    private String note;
    private Integer peopleNum;
    private Date createDate;
    private Integer isMarket;
    private String stockCode;
    private String address;
    private String industry;
    private Timestamp insertTime;
    private Timestamp updateTime;
    private String telephone;
    private Integer delFlag;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "note", nullable = true, insertable = true, updatable = true, length = 10000)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "people_num", nullable = true, insertable = true, updatable = true)
    public Integer getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    @Basic
    @Column(name = "create_date", nullable = true, insertable = true, updatable = true)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "is_market", nullable = true, insertable = true, updatable = true)
    public Integer getIsMarket() {
        return isMarket;
    }

    public void setIsMarket(Integer isMarket) {
        this.isMarket = isMarket;
    }

    @Basic
    @Column(name = "stock_code", nullable = true, insertable = true, updatable = true, length = 20)
    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    @Basic
    @Column(name = "address", nullable = true, insertable = true, updatable = true, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "industry", nullable = true, insertable = true, updatable = true, length = 20)
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Basic
    @Column(name = "insert_time", nullable = true, insertable = true, updatable = true)
    public Timestamp getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Timestamp insertTime) {
        this.insertTime = insertTime;
    }

    @Basic
    @Column(name = "update_time", nullable = true, insertable = true, updatable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "telephone", nullable = true, insertable = true, updatable = true, length = 20)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "del_flag", nullable = true, insertable = true, updatable = true)
    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabCompany that = (TabCompany) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (peopleNum != null ? !peopleNum.equals(that.peopleNum) : that.peopleNum != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (isMarket != null ? !isMarket.equals(that.isMarket) : that.isMarket != null) return false;
        if (stockCode != null ? !stockCode.equals(that.stockCode) : that.stockCode != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (industry != null ? !industry.equals(that.industry) : that.industry != null) return false;
        if (insertTime != null ? !insertTime.equals(that.insertTime) : that.insertTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (delFlag != null ? !delFlag.equals(that.delFlag) : that.delFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (peopleNum != null ? peopleNum.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (isMarket != null ? isMarket.hashCode() : 0);
        result = 31 * result + (stockCode != null ? stockCode.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (industry != null ? industry.hashCode() : 0);
        result = 31 * result + (insertTime != null ? insertTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (delFlag != null ? delFlag.hashCode() : 0);
        return result;
    }
}
