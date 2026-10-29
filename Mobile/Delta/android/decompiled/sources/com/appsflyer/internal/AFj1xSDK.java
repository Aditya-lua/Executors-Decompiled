package com.appsflyer.internal;

import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.SessionReadyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1xSDK implements AFj1wSDK {

    @NotNull
    private final AFc1dSDK<AFa1qSDK> AFKeystoreWrapper;

    @NotNull
    private final AFc1dSDK<AFc1iSDK> AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private volatile SessionReadyListener f5450d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f5451i;

    @NotNull
    private final AFj1zSDK registerClient;

    @NotNull
    private final List<AFj1uSDK> unregisterClient;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f5452w;

    public AFj1xSDK(@NotNull AFc1dSDK<AFc1iSDK> aFc1dSDK, @NotNull AFc1dSDK<AFa1qSDK> aFc1dSDK2) {
        Intrinsics.checkNotNullParameter(aFc1dSDK, "");
        Intrinsics.checkNotNullParameter(aFc1dSDK2, "");
        this.AFLogger = aFc1dSDK;
        this.AFKeystoreWrapper = aFc1dSDK2;
        this.registerClient = new AFj1zSDK();
        this.unregisterClient = new ArrayList();
        this.f5452w = new AtomicBoolean(false);
        this.f5451i = new AtomicBoolean(false);
    }

    private final void e() {
        SessionReadyListener sessionReadyListener = this.f5450d;
        if (sessionReadyListener != null) {
            try {
                sessionReadyListener.onSessionReady();
            } catch (Throwable th2) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Error in onSessionReady callback", th2, false, false, false, false, 120, null);
            }
        }
    }

    private final void unregisterClient() {
        Object next;
        if (this.f5451i.get()) {
            return;
        }
        List<AFj1uSDK> list = this.unregisterClient;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((AFj1uSDK) it.next()).unregisterClient()) {
                    Iterator<T> it2 = this.unregisterClient.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (((AFj1uSDK) next).unregisterClient());
                    AFj1uSDK aFj1uSDK = (AFj1uSDK) next;
                    if (aFj1uSDK != null) {
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Condition not satisfied: " + aFj1uSDK.d(), false, 4, null);
                        return;
                    }
                    return;
                }
            }
        }
        if (this.f5450d == null) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "All conditions satisfied but no listener registered yet", false, 4, null);
        } else if (this.f5451i.compareAndSet(false, true)) {
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "All session readiness conditions satisfied, triggering callback", false, 4, null);
            e();
        }
    }

    @Override // com.appsflyer.internal.AFj1wSDK
    public final boolean AFKeystoreWrapper() {
        synchronized (this.unregisterClient) {
            try {
                boolean z10 = false;
                if (!this.f5452w.get()) {
                    return false;
                }
                List<AFj1uSDK> list = this.unregisterClient;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z10 = true;
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (!((AFj1uSDK) it.next()).unregisterClient()) {
                        }
                    }
                    z10 = true;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.appsflyer.internal.AFj1wSDK
    public final boolean AFLogger() {
        return this.f5450d != null;
    }

    @Override // com.appsflyer.internal.AFj1wSDK
    public final void R_(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        synchronized (this.unregisterClient) {
            try {
                this.f5452w.set(true);
                this.f5451i.set(false);
                int iAFLogger = this.AFLogger.AFKeystoreWrapper.invoke().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0);
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.SDK_LIFECYCLE;
                AFLoggerBase.d$default(aFLogger, logTag, "Starting session readiness evaluation for launch counter: " + iAFLogger, false, 4, null);
                if (iAFLogger == 0) {
                    AFLoggerBase.d$default(aFLogger, logTag, "Conversion event: no additional conditions required", false, 4, null);
                } else if (this.AFKeystoreWrapper.AFKeystoreWrapper.invoke().e_(intent)) {
                    this.unregisterClient.add(this.registerClient);
                    AFLoggerBase.d$default(aFLogger, logTag, "Added deeplink condition for launch event (has deeplink)", false, 4, null);
                } else {
                    AFLoggerBase.d$default(aFLogger, logTag, "Deeplink condition not needed for launch event (no deeplink)", false, 4, null);
                }
                unregisterClient();
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.appsflyer.internal.AFj1wSDK
    public final void d(@Nullable SessionReadyListener sessionReadyListener) {
        synchronized (this.unregisterClient) {
            try {
                this.f5450d = sessionReadyListener;
                if (sessionReadyListener == null) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Session ready listener unregistered", false, 4, null);
                } else {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Session ready listener registered", false, 4, null);
                    if (this.f5452w.get() && !this.f5451i.get()) {
                        unregisterClient();
                    }
                }
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.appsflyer.internal.AFj1wSDK
    public final void registerClient() {
        synchronized (this.unregisterClient) {
            try {
                this.registerClient.AFLogger = false;
                Iterator<T> it = this.unregisterClient.iterator();
                while (it.hasNext()) {
                    ((AFj1uSDK) it.next()).registerClient();
                }
                this.unregisterClient.clear();
                this.f5452w.set(false);
                this.f5451i.set(false);
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Session readiness evaluation finished", false, 4, null);
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.appsflyer.internal.AFj1wSDK
    public final void d() {
        if (this.registerClient.AFLogger) {
            return;
        }
        synchronized (this.unregisterClient) {
            try {
                AFj1zSDK aFj1zSDK = this.registerClient;
                if (!aFj1zSDK.AFLogger) {
                    aFj1zSDK.AFLogger = true;
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "Deeplink processed condition satisfied", false, 4, null);
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.SDK_LIFECYCLE;
                AFLoggerBase.d$default(aFLogger, logTag, "Deeplink condition satisfied", false, 4, null);
                if (this.f5452w.get()) {
                    if (this.unregisterClient.contains(this.registerClient)) {
                        unregisterClient();
                    }
                } else {
                    AFLoggerBase.d$default(aFLogger, logTag, "Evaluation not started yet, condition will be checked when evaluation begins", false, 4, null);
                }
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
