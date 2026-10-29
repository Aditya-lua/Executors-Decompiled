package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1tSDK extends AFe1rSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1tSDK(@NotNull Map<String, ? extends Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NotNull AFc1bSDK aFc1bSDK) {
        super(AFd1bSDK.ARS_VALIDATE, new AFe1zSDK[]{AFd1bSDK.RC_CDN, AFd1bSDK.FETCH_ADVERTISING_ID}, aFc1bSDK, map, purchaseValidationCallback);
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFd1bSDK aFd1bSDK = AFd1bSDK.CONVERSION;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        this.AFKeystoreWrapper.add(aFd1bSDK);
    }

    @Override // com.appsflyer.internal.AFe1rSDK, com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.AFLogger();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @Nullable
    public final AFd1pSDK<String> d(@NotNull Map<String, Object> map, @NotNull String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        return getD().AFKeystoreWrapper(map, str);
    }
}
