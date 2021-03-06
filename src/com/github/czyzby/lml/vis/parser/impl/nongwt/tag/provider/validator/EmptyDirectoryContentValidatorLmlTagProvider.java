package com.github.czyzby.lml.vis.parser.impl.nongwt.tag.provider.validator;

import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.parser.tag.LmlTagProvider;
import com.github.czyzby.lml.vis.parser.impl.nongwt.tag.validator.EmptyDirectoryContentValidatorLmlTag;

/** Provides Vis directory content validator tags.
 *
 * @author MJ */
public class EmptyDirectoryContentValidatorLmlTagProvider implements LmlTagProvider {
    @Override
    public LmlTag create(final LmlParser parser, final LmlTag parentTag, final String rawTagData) {
        return new EmptyDirectoryContentValidatorLmlTag(parser, parentTag, rawTagData);
    }
}
