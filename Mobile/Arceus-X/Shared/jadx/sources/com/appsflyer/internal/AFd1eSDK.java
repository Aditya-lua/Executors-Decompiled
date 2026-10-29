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

    /* JADX INFO: renamed from: d */
    @NotNull
    private final AFc1bSDK f6903d;

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
        this.f6903d = aFc1bSDK;
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    public final void AFKeystoreWrapper(@NotNull AFe1ySDK<?> aFe1ySDK, @NotNull AFd1cSDK aFd1cSDK) {
        AFg1sSDK aFg1sSDKM8888d;
        Intrinsics.checkNotNullParameter(aFe1ySDK, "");
        Intrinsics.checkNotNullParameter(aFd1cSDK, "");
        if (!(aFe1ySDK instanceof AFf1tSDK)) {
            if (!(aFe1ySDK instanceof AFg1lSDK) || aFd1cSDK == AFd1cSDK.SUCCESS) {
                return;
            }
            this.AFLogger.m8820d(new AFg1mSDK(this.f6903d));
            return;
        }
        AFf1tSDK aFf1tSDK = (AFf1tSDK) aFe1ySDK;
        if (aFd1cSDK == AFd1cSDK.SUCCESS) {
            this.registerClient.mo8764d("sentSuccessfully", "true");
            if (!(aFf1tSDK instanceof AFf1qSDK) && (aFg1sSDKM8888d = new AFg1vSDK().m8888d()) != null && aFg1sSDKM8888d.AFLogger) {
                String str = aFg1sSDKM8888d.AFKeystoreWrapper;
                AFLogger.INSTANCE.m8960d(LogTag.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                AFc1aSDK aFc1aSDK = AFa1tSDK.m8724d().AFKeystoreWrapper;
                aFc1aSDK.afWarnLog().m8820d(new AFf1qSDK(str, aFc1aSDK));
            }
            ResponseNetwork responseNetwork = ((AFe1kSDK) aFf1tSDK).v;
            if (responseNetwork != null) {
                AFa1rSDK.AFKeystoreWrapper((String) responseNetwork.getBody(), this.AFKeystoreWrapper);
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1vSDK
    /* JADX INFO: renamed from: d */
    public final void mo8775d(@NotNull AFe1ySDK<?> aFe1ySDK) {
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
