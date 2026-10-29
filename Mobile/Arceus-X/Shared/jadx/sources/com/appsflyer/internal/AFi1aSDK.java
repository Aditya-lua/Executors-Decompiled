package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1aSDK {
    public final AFc1bSDK AFKeystoreWrapper;

    /* JADX INFO: renamed from: d */
    public final AFi1hSDK f7043d;
    public volatile boolean AFLogger = false;
    private final AtomicBoolean registerClient = new AtomicBoolean(false);
    public final CopyOnWriteArrayList<Referrer> unregisterClient = new CopyOnWriteArrayList<>();

    public AFi1aSDK(AFc1bSDK aFc1bSDK, AFi1hSDK aFi1hSDK) {
        this.AFKeystoreWrapper = aFc1bSDK;
        this.f7043d = aFi1hSDK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(Context context, ReferrerProp referrerProp, AFc1bSDK aFc1bSDK) {
        int i10 = 0;
        List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
        while (it.hasNext()) {
            ProviderInfo providerInfo = it.next().providerInfo;
            if (providerInfo != null) {
                arrayList.add(new AFi1cSDK(providerInfo, referrerProp, aFc1bSDK));
            } else {
                AFLogger.INSTANCE.m8967w(LogTag.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.unregisterClient.addAll(arrayList);
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.PREINSTALL;
        StringBuilder sb2 = new StringBuilder("Detected ");
        sb2.append(arrayList.size());
        sb2.append(" valid preinstall provider(s)");
        aFLogger.m8960d(logTag, sb2.toString());
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Referrer) obj).start(aFc1bSDK.valueOf().f6933d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFLogger(AFi1gSDK aFi1gSDK, Runnable runnable) {
        if (!this.AFLogger) {
            AFLogger.INSTANCE.m8960d(LogTag.REFERRER, "Skipping ATTR trigger: conversion not yet prepared, referrer data will be included in conversion");
            return;
        }
        AFc1kSDK aFc1kSDKAFKeystoreWrapper = this.AFKeystoreWrapper.AFKeystoreWrapper();
        int iAFLogger = this.AFKeystoreWrapper.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0);
        boolean z10 = aFi1gSDK.getState() == Referrer.State.NOT_STARTED || aFc1kSDKAFKeystoreWrapper.AFKeystoreWrapper(AppsFlyerProperties.NEW_REFERRER_SENT);
        if (iAFLogger == 1 && z10 && this.registerClient.compareAndSet(false, true)) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient(final ReferrerProp referrerProp) {
        AFi1iSDK aFi1iSDK = new AFi1iSDK(this.AFKeystoreWrapper.AFLogger(), AFi1jSDK.INSTAGRAM, referrerProp, new Runnable() { // from class: com.appsflyer.internal.u0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7169a.AFLogger(referrerProp);
            }
        });
        this.unregisterClient.add(aFi1iSDK);
        aFi1iSDK.start(this.AFKeystoreWrapper.valueOf().f6933d);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  (LINE:1) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void unregisterClient() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX INFO: renamed from: d */
    public final AFi1gSDK m8903d(final Runnable runnable) {
        final ExecutorService executorServiceMo8751d = this.AFKeystoreWrapper.mo8751d();
        return new AFi1gSDK(new ReferrerProp(new Runnable() { // from class: com.appsflyer.internal.t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7166a.m8899d(executorServiceMo8751d, runnable);
            }
        }, this.AFKeystoreWrapper.afErrorLog(), executorServiceMo8751d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void unregisterClient(final Context context, final ReferrerProp referrerProp, final AFc1bSDK aFc1bSDK) {
        if (aFc1bSDK.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) > 0) {
            AFLogger.INSTANCE.m8960d(LogTag.PREINSTALL, "Preinstall referrer will not load, the counter >= 1, ");
        } else {
            aFc1bSDK.mo8751d().execute(new Runnable() { // from class: com.appsflyer.internal.w0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7174a.AFKeystoreWrapper(context, referrerProp, aFc1bSDK);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m8899d(ExecutorService executorService, final Runnable runnable) {
        executorService.execute(new Runnable() { // from class: com.appsflyer.internal.x0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7178a.AFKeystoreWrapper(runnable);
            }
        });
    }

    public final void unregisterClient(final ReferrerProp referrerProp) {
        this.unregisterClient.add(new AFi1iSDK(this.AFKeystoreWrapper.AFLogger(), AFi1jSDK.FACEBOOK, referrerProp, new Runnable() { // from class: com.appsflyer.internal.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7171a.registerClient(referrerProp);
            }
        }));
    }

    public final Runnable unregisterClient(final AFi1gSDK aFi1gSDK, final Runnable runnable) {
        return new Runnable() { // from class: com.appsflyer.internal.z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f7181a.AFLogger(aFi1gSDK, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFLogger(ReferrerProp referrerProp) {
        AFi1iSDK aFi1iSDK = new AFi1iSDK(this.AFKeystoreWrapper.AFLogger(), AFi1jSDK.FACEBOOK_LITE, referrerProp, new Runnable() { // from class: com.appsflyer.internal.y0
            @Override // java.lang.Runnable
            public final void run() {
                AFi1aSDK.unregisterClient();
            }
        });
        this.unregisterClient.add(aFi1iSDK);
        aFi1iSDK.start(this.AFKeystoreWrapper.valueOf().f6933d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFKeystoreWrapper(Runnable runnable) {
        try {
            if (!this.AFLogger) {
                AFLogger.INSTANCE.m8960d(LogTag.REFERRER, "Skipping ATTR trigger: conversion not yet prepared, referrer data will be included in conversion");
                return;
            }
            int iAFLogger = this.AFKeystoreWrapper.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0);
            if (!this.AFKeystoreWrapper.AFKeystoreWrapper().AFKeystoreWrapper(AppsFlyerProperties.NEW_REFERRER_SENT) && iAFLogger == 1 && this.registerClient.compareAndSet(false, true)) {
                runnable.run();
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.m8961e(LogTag.REFERRER, th2.getMessage() != null ? th2.getMessage() : "Error processing referrer data", th2);
        }
    }
}
