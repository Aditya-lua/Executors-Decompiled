package backtraceio.library.enums;

import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public enum BacktraceBreadcrumbType {
    MANUAL,
    LOG,
    NAVIGATION,
    HTTP,
    SYSTEM,
    USER,
    CONFIGURATION;

    public static final EnumSet<BacktraceBreadcrumbType> ALL = EnumSet.allOf(BacktraceBreadcrumbType.class);
    public static final EnumSet<BacktraceBreadcrumbType> NONE = EnumSet.noneOf(BacktraceBreadcrumbType.class);

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase();
    }
}
