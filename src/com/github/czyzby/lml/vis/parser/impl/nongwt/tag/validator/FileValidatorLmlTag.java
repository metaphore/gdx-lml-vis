package com.github.czyzby.lml.vis.parser.impl.nongwt.tag.validator;

import com.github.czyzby.kiwi.util.common.Strings;
import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.vis.parser.impl.tag.validator.AbstractValidatorLmlTag;
import com.kotcrab.vis.ui.util.InputValidator;
import com.kotcrab.vis.ui.util.form.FormValidator;

public class FileValidatorLmlTag extends AbstractValidatorLmlTag {
    public FileValidatorLmlTag(final LmlParser parser, final LmlTag parentTag, final String rawTagData) {
        super(parser, parentTag, rawTagData);
    }

    @Override
    public InputValidator getInputValidator() {
        return new FormValidator.FileExistsValidator(Strings.EMPTY_STRING);
    }
}
