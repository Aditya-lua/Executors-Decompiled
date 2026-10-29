package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007J,\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0007¨\u0006\u0012"}, m31665d2 = {"Lcom/appsflyer/internal/util/SdkUtil;", "", "<init>", "()V", "scheduleJob", "", "scheduler", "Ljava/util/concurrent/ScheduledExecutorService;", "job", "Ljava/lang/Runnable;", "delay", "", "timeUnits", "Ljava/util/concurrent/TimeUnit;", "getMetaFrom", "", "", "paramsMap", "sdk_main_prodRelease"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFj1iSDK {

    @NotNull
    public static final AFj1iSDK unregisterClient = new AFj1iSDK();

    private AFj1iSDK() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void AFLogger(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull Runnable runnable, long j10, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        try {
            scheduledExecutorService.schedule(runnable, j10, timeUnit);
        } catch (RejectedExecutionException e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "scheduleJob failed with RejectedExecutionException", e10, false, false, false, false, 120, null);
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "scheduleJob failed with exception", th2, false, false, false, false, 120, null);
        }
    }

    @NotNull
    public static final Map<String, Object> AFLogger(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Object obj = map.get("meta");
        Map<String, Object> map2 = C7739h0.m32047l(obj) ? (Map) obj : null;
        if (map2 != null) {
            return map2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        map.put("meta", linkedHashMap);
        return linkedHashMap;
    }
}
