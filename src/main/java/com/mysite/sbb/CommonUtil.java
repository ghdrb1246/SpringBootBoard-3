package com.mysite.sbb;

import com.mysite.sbb.answer.Answer;
import org.springframework.stereotype.Component;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.commonmark.node.Node;


@Component
public class CommonUtil {
    public String markdown (String markdown) {
        Parser parser = Parser.builder().build();
        Node docuemnt = parser.parse(markdown);
        HtmlRenderer renderer = HtmlRenderer.builder().build();

        return renderer.render(docuemnt);
    }
}
