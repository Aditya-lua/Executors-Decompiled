package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.network.http.ResponseNetwork;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1eSDK implements AFe1vSDK {

    @NotNull
    private final AppsFlyerProperties AFKeystoreWrapper;

    @NotNull
    private final AFe1wSDK AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFc1bSDK f5275d;

    @NotNull
    private final AFc1kSDK registerClient;

    public AFd1eSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull AppsFlyerProperties appsFlyerProperties, @NotNull AFe1wSDK aFe1wSDK, @NotNull AFc1bSDK aFc1bSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        Intrinsics.checkNotNullParameter(aFe1wSDK, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.registerClient = aFc1kSDK;
        this.AFKeystoreWrapper = appsFlyerProperties;
        this.AFLogger = aFe1wSDK;
        this.f5275d = aFc1bSDK;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void AFKeystoreWrapper(@NotNull AFe1ySDK<?> aFe1ySDK, @NotNull AFd1cSDK aFd1cSDK) {
        AFg1sSDK aFg1sSDKD;
        Intrinsics.checkNotNullParameter(aFe1ySDK, "");
        Intrinsics.checkNotNullParameter(aFd1cSDK, "");
        if (!(aFe1ySDK instanceof AFf1tSDK)) {
            if (!(aFe1ySDK instanceof AFg1lSDK) || aFd1cSDK == AFd1cSDK.SUCCESS) {
                return;
            }
            this.AFLogger.d(new AFg1mSDK(this.f5275d));
            return;
        }
        AFf1tSDK aFf1tSDK = (AFf1tSDK) aFe1ySDK;
        if (aFd1cSDK == AFd1cSDK.SUCCESS) {
            this.registerClient.d("sentSuccessfully", "true");
            if (!(aFf1tSDK instanceof AFf1qSDK) && (aFg1sSDKD = new AFg1vSDK().d()) != null && aFg1sSDKD.AFLogger) {
                String str = aFg1sSDKD.AFKeystoreWrapper;
                AFLogger.INSTANCE.d(LogTag.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                AFc1aSDK aFc1aSDK = AFa1tSDK.d().AFKeystoreWrapper;
                aFc1aSDK.afWarnLog().d(new AFf1qSDK(str, aFc1aSDK));
            }
            ResponseNetwork responseNetwork = ((AFe1kSDK) aFf1tSDK).v;
            if (responseNetwork != null) {
                AFa1rSDK.AFKeystoreWrapper((String) responseNetwork.getBody(), this.AFKeystoreWrapper);
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void d(@NotNull AFe1ySDK<?> aFe1ySDK) {
        Intrinsics.checkNotNullParameter(aFe1ySDK, "");
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void registerClient(@NotNull AFe1ySDK<?> aFe1ySDK) {
        Intrinsics.checkNotNullParameter(aFe1ySDK, "");
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void unregisterClient(@NotNull AFe1ySDK<?> aFe1ySDK) {
        Intrinsics.checkNotNullParameter(aFe1ySDK, "");
    }
}
