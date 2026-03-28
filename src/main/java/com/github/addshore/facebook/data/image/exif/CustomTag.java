package com.github.addshore.facebook.data.image.exif;

import com.thebuzzmedia.exiftool.Tag;

public enum CustomTag implements Tag {
    EXPOSURE("EXPOSURE"),
    FNUMBER("FNumber"),
    MODIFYDATE("ModifyDate");

    private final String name;
    private final CustomTag.Type type;

    CustomTag(String name) {
        this.name = name;
        this.type = Type.STRING;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public <T> T parse(String value) {
        return type.parse(value);
    }

    @SuppressWarnings("unchecked")
    private enum Type {

        STRING {
            @Override
            public <T> T parse(String value) {
                return (T) value;
            }
        };

        public abstract <T> T parse(String value);
    }
}
