package com.yottapeng.blog.utils;

import com.yottapeng.blog.support.web.MarkdownService;
import com.yottapeng.blog.support.web.PegDownMarkdownService;

/**
 * A Markdown processing util class
 *
 * @author Raysmond<i@raysmond.com>.
 */
public class Markdown {

    private static final MarkdownService MARKDOWN_SERVICE = new PegDownMarkdownService();

    public static String markdownToHtml(String content){
        return MARKDOWN_SERVICE.renderToHtml(content);
    }
}
