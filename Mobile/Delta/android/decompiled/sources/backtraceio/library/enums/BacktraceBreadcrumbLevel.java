package backtraceio.library.enums;

import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public enum BacktraceBreadcrumbLevel {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public static final EnumSet<BacktraceBreadcrumbLevel> ALL = EnumSet.allOf(BacktraceBreadcrumbLevel.class);
    public static final EnumSet<BacktraceBreadcrumbLevel> NONE = EnumSet.noneOf(BacktraceBreadcrumbLevel.class);

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase();
    }
}
