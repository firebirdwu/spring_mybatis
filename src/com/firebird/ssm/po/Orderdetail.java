package com.firebird.ssm.po;

public class Orderdetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.id
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.ordersId
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    private Integer ordersid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.itemsId
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    private Integer itemsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderdetail.itemsNum
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    private Integer itemsnum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.id
     *
     * @return the value of orderdetail.id
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.id
     *
     * @param id the value for orderdetail.id
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.ordersId
     *
     * @return the value of orderdetail.ordersId
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    public Integer getOrdersid() {
        return ordersid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.ordersId
     *
     * @param ordersid the value for orderdetail.ordersId
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    public void setOrdersid(Integer ordersid) {
        this.ordersid = ordersid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.itemsId
     *
     * @return the value of orderdetail.itemsId
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    public Integer getItemsid() {
        return itemsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.itemsId
     *
     * @param itemsid the value for orderdetail.itemsId
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderdetail.itemsNum
     *
     * @return the value of orderdetail.itemsNum
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    public Integer getItemsnum() {
        return itemsnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderdetail.itemsNum
     *
     * @param itemsnum the value for orderdetail.itemsNum
     *
     * @mbggenerated Sat May 05 10:48:46 CST 2018
     */
    public void setItemsnum(Integer itemsnum) {
        this.itemsnum = itemsnum;
    }
}