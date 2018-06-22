package enumerations;

import org.apache.commons.lang3.StringUtils;

public enum CuteLevel {
    BAD_CAT,
    FAT_CAT,
    GOOD_CAT,
    DIRTY_CAT;

    @Override
    public String toString() {
        return StringUtils.capitalize(StringUtils.replace(this.name(), "_", " ").toLowerCase());
    }
}
