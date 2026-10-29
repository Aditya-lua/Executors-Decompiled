package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0015\u0010\u000b\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0015\u0010\u0015\u001a\u00020\u00138FX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lcom/appsflyer/internal/AFf1kSDK;", "", "Lcom/appsflyer/internal/AFc1iSDK;", "p0", "Lcom/appsflyer/internal/AFf1jSDK;", "p1", "Lcom/appsflyer/internal/AFc1eSDK;", "p2", "<init>", "(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFf1jSDK;Lcom/appsflyer/internal/AFc1eSDK;)V", "", "AFKeystoreWrapper", "()J", "AFLogger", "Lcom/appsflyer/internal/AFc1iSDK;", "unregisterClient", "Lcom/appsflyer/internal/AFf1jSDK;", "d", "Lcom/appsflyer/internal/AFc1eSDK;", "", "Ljt/h;", "registerClient", "AFa1uSDK"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFf1kSDK {
    private static final long force = TimeUnit.HOURS.toSeconds(24);

    @NotNull
    public final jt.h AFKeystoreWrapper;

    @NotNull
    private final AFc1iSDK AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AFc1eSDK unregisterClient;

    @NotNull
    public final jt.h registerClient;

    /* JADX INFO: renamed from: unregisterClient, reason: from kotlin metadata */
    @NotNull
    public final AFf1jSDK d;

    public AFf1kSDK(@NotNull AFc1iSDK aFc1iSDK, @NotNull AFf1jSDK aFf1jSDK, @NotNull AFc1eSDK aFc1eSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFf1jSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.AFLogger = aFc1iSDK;
        this.d = aFf1jSDK;
        this.unregisterClient = aFc1eSDK;
        this.AFKeystoreWrapper = jt.i.b(new Function0() { // from class: com.appsflyer.internal.m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AFf1kSDK.d(this.f5506a));
            }
        });
        this.registerClient = jt.i.b(new Function0() { // from class: com.appsflyer.internal.n0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(AFf1kSDK.AFLogger(this.f5509a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AFLogger(AFf1kSDK aFf1kSDK) {
        return Boolean.parseBoolean(aFf1kSDK.AFLogger.AFLogger("com.appsflyer.rc.staging"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(AFf1kSDK aFf1kSDK) {
        return Boolean.parseBoolean(aFf1kSDK.AFLogger.AFLogger("com.appsflyer.rc.sandbox"));
    }

    public final long AFKeystoreWrapper() {
        Object objB;
        String strAFLogger = this.AFLogger.AFLogger("com.appsflyer.rc.cache.max-age-fallback");
        if (strAFLogger == null) {
            return force;
        }
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            objB = jt.n.b(Long.valueOf(Long.parseLong(strAFLogger)));
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        Throwable thE = jt.n.e(objB);
        if (thE != null) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.REMOTE_CONTROL;
            String message = thE.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            AFLoggerBase.e$default(aFLogger, logTag, "Can't read maxAgeFallback from Manifest: " + message, thE, false, false, false, false, 120, null);
            objB = Long.valueOf(force);
        }
        return ((Number) objB).longValue();
    }
}
