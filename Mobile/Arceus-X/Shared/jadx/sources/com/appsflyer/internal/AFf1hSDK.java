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

    /* JADX INFO: renamed from: d */
    private final AFc1iSDK f6970d;

    /* JADX INFO: renamed from: e */
    private final AFd1sSDK f6971e;
    private final AFe1wSDK force;

    /* JADX INFO: renamed from: i */
    private final AFc1eSDK f6972i;
    private final Object registerClient = new Object();
    public final AFf1jSDK unregisterClient;

    /* JADX INFO: renamed from: v */
    private final AFf1kSDK f6973v;

    /* JADX INFO: renamed from: w */
    private AFh1bSDK f6974w;

    public AFf1hSDK(AFf1nSDK aFf1nSDK, AFc1iSDK aFc1iSDK, AFf1fSDK aFf1fSDK, AFf1jSDK aFf1jSDK, AFd1sSDK aFd1sSDK, AFf1kSDK aFf1kSDK, AFc1eSDK aFc1eSDK, AFe1wSDK aFe1wSDK) {
        this.AFKeystoreWrapper = aFf1nSDK;
        this.f6970d = aFc1iSDK;
        this.AFLogger = aFf1fSDK;
        this.unregisterClient = aFf1jSDK;
        this.f6971e = aFd1sSDK;
        this.f6973v = aFf1kSDK;
        this.f6972i = aFc1eSDK;
        this.force = aFe1wSDK;
        Intrinsics.checkNotNullParameter(this, "");
        aFe1wSDK.unregisterClient.add(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void AFKeystoreWrapper(AFf1mSDK aFf1mSDK) {
        this.force.m8820d(new AFf1oSDK(this.AFKeystoreWrapper, this.f6970d, this.AFLogger, this.unregisterClient, this.f6971e, this.f6973v, this.f6972i, "v1", aFf1mSDK));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFe1vSDK
    /* JADX INFO: renamed from: d */
    public final void mo8775d(AFe1ySDK<?> aFe1ySDK) {
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void registerClient(AFe1ySDK<?> aFe1ySDK) {
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void unregisterClient(AFe1ySDK<?> aFe1ySDK) {
        if (aFe1ySDK instanceof AFf1oSDK) {
            AFf1oSDK aFf1oSDK = (AFf1oSDK) aFe1ySDK;
            synchronized (this.registerClient) {
                this.f6974w = null;
            }
            AFKeystoreWrapper(AFf1pSDK.FAILURE, aFf1oSDK.force);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: d */
    public final AFh1bSDK m8834d() {
        AFh1bSDK aFh1bSDK;
        synchronized (this.registerClient) {
            aFh1bSDK = this.f6974w;
            this.f6974w = null;
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
            AFf1pSDK aFf1pSDK = aFf1oSDK.f6983i;
            if (aFf1pSDK == null) {
                AFLogger.INSTANCE.m8967w(LogTag.REMOTE_CONTROL, "update RC returned null result, something went wrong!");
                aFf1pSDK = AFf1pSDK.FAILURE;
            }
            if (aFf1pSDK != AFf1pSDK.USE_CACHED) {
                AFh1bSDK aFh1bSDK = aFf1oSDK.f6982e;
                synchronized (this.registerClient) {
                    this.f6974w = aFh1bSDK;
                }
            }
            AFKeystoreWrapper(aFf1pSDK, aFf1oSDK.force);
        }
    }
}
