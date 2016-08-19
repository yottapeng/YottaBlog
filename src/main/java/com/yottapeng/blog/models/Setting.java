package com.yottapeng.blog.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * A generic setting model
 *
 * @author yottapeng<i@yottapeng.com>
 */
@Entity
@Table(name = "settings")
@Getter @Setter
public class Setting extends BaseModel{
    @Column(name = "_key", unique = true, nullable = false)
    private String key;

    @Lob
    @Column(name = "_value")
    private Serializable value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Serializable getValue() {
		return value;
	}

	public void setValue(Serializable value) {
		this.value = value;
	}

}
