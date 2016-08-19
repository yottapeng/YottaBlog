package com.yottapeng.blog.models.support;

/**
 * @author yottapeng<i@yottapeng.com>
 */
public enum PostFormat {
    HTML("Html"),
    MARKDOWN("Markdown");

    private String displayName;

    PostFormat(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }

    public String getId() {
        return name();
    }

    @Override
    public String toString() {
        return getDisplayName();
    }
}