package some.dto;

import some.entity.Tag;

public class EntityDTO {
    private Tag[] tags;

    public Tag[] getTags() {
        return tags;
    }

    public void setTags(Tag[] tags) {
        this.tags = tags;
    }
}
