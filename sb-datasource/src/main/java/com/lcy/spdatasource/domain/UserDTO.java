package com.lcy.spdatasource.domain;

import java.util.Date;

public class UserDTO {
    private Long id;

    private String name;

    private String currentAddr;

    private Date createTime;

    public UserDTO() {
    }

    public UserDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCurrentAddr() {
        return currentAddr;
    }

    public void setCurrentAddr(String currentAddr) {
        this.currentAddr = currentAddr == null ? null : currentAddr.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", currentAddr="
				+ currentAddr + ", createTime=" + createTime + "]";
	}
    
}