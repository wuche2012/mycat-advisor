package org.apache.mycat.advisor.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by cjl on 2016/3/20.
 */
@Table(name = "tab_user_like_consultant", schema = "", catalog = "mycat_advisor")
public class TabUserLikeConsultant {
    private Long id;
    private Long userId;
    private Long consultantId;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id", nullable = true, insertable = true, updatable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "consultant_id", nullable = true, insertable = true, updatable = true)
    public Long getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(Long consultantId) {
        this.consultantId = consultantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TabUserLikeConsultant that = (TabUserLikeConsultant) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (consultantId != null ? !consultantId.equals(that.consultantId) : that.consultantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (consultantId != null ? consultantId.hashCode() : 0);
        return result;
    }
}
