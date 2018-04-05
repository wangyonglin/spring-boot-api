package com.wangyonglin.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "video_manager_table")
public class Video {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GenericGenerator(name="uuid", strategy="uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator="uuid")
    //@Column(name = "id")
    private String  uuid;
    @Column(name = "title")
    private String title;
    @Column(name = "src")
    private String src;
    @Column(name = "img")
    private String img;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datetime")
    private Date datetime;
    @Column(name = "enabled")
    private String enabled;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
