package org.jsecurity.entity;

import java.util.Date;

public class MenuDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.id
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.code
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.name
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.system_code
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    private String systemCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.isEnable
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    private Integer isenable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.create_time
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.update_time
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.id
     *
     * @return the value of menu.id
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.id
     *
     * @param id the value for menu.id
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.code
     *
     * @return the value of menu.code
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.code
     *
     * @param code the value for menu.code
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.name
     *
     * @return the value of menu.name
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.name
     *
     * @param name the value for menu.name
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.system_code
     *
     * @return the value of menu.system_code
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.system_code
     *
     * @param systemCode the value for menu.system_code
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode == null ? null : systemCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.isEnable
     *
     * @return the value of menu.isEnable
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public Integer getIsenable() {
        return isenable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.isEnable
     *
     * @param isenable the value for menu.isEnable
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public void setIsenable(Integer isenable) {
        this.isenable = isenable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.create_time
     *
     * @return the value of menu.create_time
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.create_time
     *
     * @param createTime the value for menu.create_time
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.update_time
     *
     * @return the value of menu.update_time
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.update_time
     *
     * @param updateTime the value for menu.update_time
     *
     * @mbggenerated Sun Dec 04 18:23:57 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}