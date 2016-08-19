package com.yottapeng.blog.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author yottapeng<i@yottapeng.com>.
 */
@Entity
@Table(name = "tags")
@Getter @Setter
public class Tag extends BaseModel {

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "tags")
    private List<Post> posts = new ArrayList<>();

    public Tag(){

    }

    public Tag(String name){
        this.setName(name);
    }
}
