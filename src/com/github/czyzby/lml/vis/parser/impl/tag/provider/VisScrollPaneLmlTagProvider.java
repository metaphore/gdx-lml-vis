package com.github.czyzby.lml.vis.parser.impl.tag.provider;

import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.parser.tag.LmlTagProvider;
import com.github.czyzby.lml.vis.parser.impl.tag.VisScrollPaneLmlTag;

/**
 * Handles VisScrollPane tags
 * @author Kotcrab
 */
public class VisScrollPaneLmlTagProvider implements LmlTagProvider {
    @Override
    public LmlTag create(LmlParser parser, LmlTag parentTag, String rawTagData) {
        return new VisScrollPaneLmlTag(parser, parentTag, rawTagData);
    }
}
