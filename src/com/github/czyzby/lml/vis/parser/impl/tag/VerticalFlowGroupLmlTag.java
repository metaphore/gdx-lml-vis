package com.github.czyzby.lml.vis.parser.impl.tag;

import com.badlogic.gdx.scenes.scene2d.Group;
import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.impl.tag.AbstractGroupLmlTag;
import com.github.czyzby.lml.parser.tag.LmlActorBuilder;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.kotcrab.vis.ui.layout.VerticalFlowGroup;

/** Handles {@link VerticalFlowGroup} actor. Mapped to "verticalFlow", "vFlow", "verticalFlowGroup".
 *
 * @author MJ */
public class VerticalFlowGroupLmlTag extends AbstractGroupLmlTag {
    public VerticalFlowGroupLmlTag(final LmlParser parser, final LmlTag parentTag, final String rawTagData) {
        super(parser, parentTag, rawTagData);
    }

    @Override
    protected Group getNewInstanceOfGroup(final LmlActorBuilder builder) {
        return new VerticalFlowGroup();
    }
}
