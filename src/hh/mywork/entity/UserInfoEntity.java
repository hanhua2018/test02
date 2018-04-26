package hh.mywork.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_info", schema = "mywork", catalog = "")
public class UserInfoEntity {
    private String uuid;
    private String userName;
    private String pwd;

    @Id
    @Column(name = "uuid", nullable = false, length = 50)
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "userName", nullable = false, length = 50)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "pwd", nullable = false, length = 100)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfoEntity that = (UserInfoEntity) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(pwd, that.pwd);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uuid, userName, pwd);
    }
}
