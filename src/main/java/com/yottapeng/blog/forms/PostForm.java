package com.yottapeng.blog.forms;

import com.yottapeng.blog.models.Tag;
import com.yottapeng.blog.models.support.PostFormat;
import com.yottapeng.blog.models.support.PostStatus;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author yottapeng<i@yottapeng.com>
 */
@Data
public class PostForm {
    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    @NotNull
    private PostFormat postFormat;

    @NotNull
    private PostStatus postStatus;

    @NotNull
    private String permalink;

    @NotNull
    private String postTags;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public PostFormat getPostFormat() {
		return postFormat;
	}

	public void setPostFormat(PostFormat postFormat) {
		this.postFormat = postFormat;
	}

	public PostStatus getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(PostStatus postStatus) {
		this.postStatus = postStatus;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getPostTags() {
		return postTags;
	}

	public void setPostTags(String postTags) {
		this.postTags = postTags;
	}

}
