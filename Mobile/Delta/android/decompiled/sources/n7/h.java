package n7;

/* JADX INFO: loaded from: classes3.dex */
public enum h {
    NORMAL,
    MULTIPLY,
    SCREEN,
    OVERLAY,
    DARKEN,
    LIGHTEN,
    COLOR_DODGE,
    COLOR_BURN,
    HARD_LIGHT,
    SOFT_LIGHT,
    DIFFERENCE,
    EXCLUSION,
    HUE,
    SATURATION,
    COLOR,
    LUMINOSITY,
    ADD,
    HARD_MIX;

    public androidx.core.graphics.a b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return androidx.core.graphics.a.MODULATE;
        }
        if (iOrdinal == 2) {
            return androidx.core.graphics.a.SCREEN;
        }
        if (iOrdinal == 3) {
            return androidx.core.graphics.a.OVERLAY;
        }
        if (iOrdinal == 4) {
            return androidx.core.graphics.a.DARKEN;
        }
        if (iOrdinal == 5) {
            return androidx.core.graphics.a.LIGHTEN;
        }
        if (iOrdinal != 16) {
            return null;
        }
        return androidx.core.graphics.a.PLUS;
    }
}
