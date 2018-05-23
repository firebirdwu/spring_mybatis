package com.firebird.ssm.po;

import com.firebird.ssm.controller.validation.ValidationGroup1;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class Items {

    private Integer id;

    @Size(min = 1,max = 20,message = "{items.name.length.error}",groups = {ValidationGroup1.class})
    private String name;


    private Float price;


    private String pic;

    @NotNull(message = "{items.createtime.isNull}")
    private Date createtime;


    private String dettail;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }


    public Float getPrice() {
        return price;
    }


    public void setPrice(Float price) {
        this.price = price;
    }


    public String getPic() {
        return pic;
    }


    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }


    public Date getCreatetime() {
        return createtime;
    }


    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }


    public String getDettail() {
        return dettail;
    }


    public void setDettail(String dettail) {
        this.dettail = dettail == null ? null : dettail.trim();
    }
}