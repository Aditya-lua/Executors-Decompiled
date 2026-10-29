package com.appsflyer.sdk_base.logger;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J@\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m31665d2 = {"Lcom/appsflyer/sdk_base/logger/LoggerDelegate;", "Lcom/appsflyer/sdk_base/logger/AFLoggerBase;", "delegate", "<init>", "(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;)V", "v", "", "tag", "Lcom/appsflyer/sdk_base/logger/LogTag;", NotificationCompat.CATEGORY_MESSAGE, "", "shouldRemoteDebug", "", "d", "i", "w", "e", "throwable", "", "printMsg", "printThrowable", "shouldReportToExManager", "force", "sdk_base_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class LoggerDelegate extends AFLoggerBase {

    @NotNull
    private final AFLoggerBase delegate;

    public LoggerDelegate(@NotNull AFLoggerBase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    /* JADX INFO: renamed from: d */
    public void mo8696d(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.delegate.mo8696d(tag, msg, shouldRemoteDebug);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    /* JADX INFO: renamed from: e */
    public void mo8697e(@NotNull LogTag tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.delegate.mo8697e(tag, msg, throwable, printMsg, printThrowable, shouldReportToExManager, shouldRemoteDebug);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    public void force(@NotNull LogTag tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.delegate.force(tag, msg);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    /* JADX INFO: renamed from: i */
    public void mo8698i(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.delegate.mo8698i(tag, msg, shouldRemoteDebug);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    /* JADX INFO: renamed from: v */
    public void mo8699v(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.delegate.mo8699v(tag, msg, shouldRemoteDebug);
    }

    @Override // com.appsflyer.sdk_base.logger.AFLoggerBase
    /* JADX INFO: renamed from: w */
    public void mo8700w(@NotNull LogTag tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.delegate.mo8700w(tag, msg, shouldRemoteDebug);
    }
}
