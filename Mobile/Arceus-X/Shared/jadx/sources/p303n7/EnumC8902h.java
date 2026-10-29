package p303n7;

import androidx.core.graphics.EnumC0544a;

/* JADX INFO: renamed from: n7.h */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8902h {
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

    /* JADX INFO: renamed from: b */
    public EnumC0544a m35873b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return EnumC0544a.MODULATE;
        }
        if (iOrdinal == 2) {
            return EnumC0544a.SCREEN;
        }
        if (iOrdinal == 3) {
            return EnumC0544a.OVERLAY;
        }
        if (iOrdinal == 4) {
            return EnumC0544a.DARKEN;
        }
        if (iOrdinal == 5) {
            return EnumC0544a.LIGHTEN;
        }
        if (iOrdinal != 16) {
            return null;
        }
        return EnumC0544a.PLUS;
    }
}
