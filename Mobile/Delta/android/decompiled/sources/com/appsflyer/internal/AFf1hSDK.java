package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1hSDK implements AFe1vSDK {
    private final AFf1nSDK AFKeystoreWrapper;
    private final AFf1fSDK AFLogger;
    private AFf1pSDK afWarnLog;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AFc1iSDK f5415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AFd1sSDK f5416e;
    private final AFe1wSDK force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AFc1eSDK f5417i;
    private final Object registerClient = new Object();
    public final AFf1jSDK unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AFf1kSDK f5418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AFh1bSDK f5419w;

    public AFf1hSDK(AFf1nSDK aFf1nSDK, AFc1iSDK aFc1iSDK, AFf1fSDK aFf1fSDK, AFf1jSDK aFf1jSDK, AFd1sSDK aFd1sSDK, AFf1kSDK aFf1kSDK, AFc1eSDK aFc1eSDK, AFe1wSDK aFe1wSDK) {
        this.AFKeystoreWrapper = aFf1nSDK;
        this.f5415d = aFc1iSDK;
        this.AFLogger = aFf1fSDK;
        this.unregisterClient = aFf1jSDK;
        this.f5416e = aFd1sSDK;
        this.f5418v = aFf1kSDK;
        this.f5417i = aFc1eSDK;
        this.force = aFe1wSDK;
        Intrinsics.checkNotNullParameter(this, "");
        aFe1wSDK.unregisterClient.add(this);
    }

    public final void AFKeystoreWrapper(AFf1mSDK aFf1mSDK) {
        this.force.d(new AFf1oSDK(this.AFKeystoreWrapper, this.f5415d, this.AFLogger, this.unregisterClient, this.f5416e, this.f5418v, this.f5417i, "v1", aFf1mSDK));
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void d(AFe1ySDK<?> aFe1ySDK) {
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void registerClient(AFe1ySDK<?> aFe1ySDK) {
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void unregisterClient(AFe1ySDK<?> aFe1ySDK) {
        if (aFe1ySDK instanceof AFf1oSDK) {
            AFf1oSDK aFf1oSDK = (AFf1oSDK) aFe1ySDK;
            synchronized (this.registerClient) {
                this.f5419w = null;
            }
            AFKeystoreWrapper(AFf1pSDK.FAILURE, aFf1oSDK.force);
        }
    }

    public final AFh1bSDK d() {
        AFh1bSDK aFh1bSDK;
        synchronized (this.registerClient) {
            aFh1bSDK = this.f5419w;
            this.f5419w = null;
        }
        return aFh1bSDK;
    }

    private void AFKeystoreWrapper(@NonNull AFf1pSDK aFf1pSDK, AFf1mSDK aFf1mSDK) {
        synchronized (this.registerClient) {
            this.afWarnLog = aFf1pSDK;
        }
        if (aFf1mSDK != null) {
            aFf1mSDK.onRemoteConfigUpdateFinished(aFf1pSDK);
        }
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void AFKeystoreWrapper(AFe1ySDK<?> aFe1ySDK, AFd1cSDK aFd1cSDK) {
        if (aFe1ySDK instanceof AFf1oSDK) {
            AFf1oSDK aFf1oSDK = (AFf1oSDK) aFe1ySDK;
            AFf1pSDK aFf1pSDK = aFf1oSDK.f5428i;
            if (aFf1pSDK == null) {
                AFLogger.INSTANCE.w(LogTag.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFf1pSDK = AFf1pSDK.FAILURE;
            }
            if (aFf1pSDK != AFf1pSDK.USE_CACHED) {
                AFh1bSDK aFh1bSDK = aFf1oSDK.f5427e;
                synchronized (this.registerClient) {
                    this.f5419w = aFh1bSDK;
                }
            }
            AFKeystoreWrapper(aFf1pSDK, aFf1oSDK.force);
        }
    }
}
