package com.appsflyer.sdk_base.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000b\b&\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0017JH\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0017J\"\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0017J\"\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0017J\"\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u0017J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u001d\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u001e\u001a\u00020\u0011*\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006 "}, d2 = {"Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "", "<init>", "()V", "shouldExtendMsg", "", "getShouldExtendMsg", "()Z", "ts", "", "getTs", "()J", "d", "", "tag", "Lcom/appsflyer/sdk_base/logger/LogTag;", "msg", "", "shouldRemoteDebug", "e", "throwable", "", "printMsg", "printThrowable", "shouldReportToExManager", "i", "w", "v", "force", "withTag", "extendedMsg", "Companion", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AFLoggerBase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long START_TIME = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/appsflyer/sdk_base/logger/AFLoggerBase$Companion;", "", "<init>", "()V", "START_TIME", "", "getSTART_TIME", "()J", "sdk_base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long getSTART_TIME() {
            return AFLoggerBase.START_TIME;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void d$default(AFLoggerBase aFLoggerBase, LogTag logTag, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        aFLoggerBase.d(logTag, str, z10);
    }

    public static /* synthetic */ void e$default(AFLoggerBase aFLoggerBase, LogTag logTag, String str, Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        if ((i10 & 64) != 0) {
            z13 = true;
        }
        aFLoggerBase.e(logTag, str, th2, z10, z11, z12, z13);
    }

    public static /* synthetic */ void i$default(AFLoggerBase aFLoggerBase, LogTag logTag, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        aFLoggerBase.i(logTag, str, z10);
    }

    public static /* synthetic */ void v$default(AFLoggerBase aFLoggerBase, LogTag logTag, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        aFLoggerBase.v(logTag, str, z10);
    }

    public static /* synthetic */ void w$default(AFLoggerBase aFLoggerBase, LogTag logTag, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        aFLoggerBase.w(logTag, str, z10);
    }

    public final void d(@NotNull LogTag tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        d$default(this, tag, msg, false, 4, null);
    }

    public final void e(@NotNull LogTag tag, @NotNull String msg, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        e$default(this, tag, msg, throwable, false, false, false, false, 120, null);
    }

    @NotNull
    public final String extendedMsg(@Nullable String str, @NotNull LogTag tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (str == null || StringsKt.p0(str)) {
            str = "null";
        }
        String strWithTag = withTag(str, tag);
        if (!getShouldExtendMsg()) {
            return strWithTag;
        }
        return "(" + (getTs() - START_TIME) + ") [" + Thread.currentThread().getName() + "] " + strWithTag;
    }

    public void force(@NotNull LogTag tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public final long getTs() {
        return System.currentTimeMillis();
    }

    public final void i(@NotNull LogTag tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        i$default(this, tag, msg, false, 4, null);
    }

    public final void v(@NotNull LogTag tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        v$default(this, tag, msg, false, 4, null);
    }

    public final void w(@NotNull LogTag tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        w$default(this, tag, msg, false, 4, null);
    }

    @NotNull
    public final String withTag(@NotNull String str, @NotNull LogTag tag) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return "[" + tag.getTagName() + "] " + str;
    }

    public void d(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public final void e(@NotNull LogTag tag, @NotNull String msg, @NotNull Throwable throwable, boolean z10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        e$default(this, tag, msg, throwable, z10, false, false, false, 112, null);
    }

    public void i(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public void v(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public void w(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    public final void e(@NotNull LogTag tag, @NotNull String msg, @NotNull Throwable throwable, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        e$default(this, tag, msg, throwable, z10, z11, false, false, 96, null);
    }

    public final void e(@NotNull LogTag tag, @NotNull String msg, @NotNull Throwable throwable, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        e$default(this, tag, msg, throwable, z10, z11, z12, false, 64, null);
    }

    public void e(@NotNull LogTag tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }
}
