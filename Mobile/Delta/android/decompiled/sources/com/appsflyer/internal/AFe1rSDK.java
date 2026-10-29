package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1rSDK extends AFe1lSDK {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private final PurchaseHandler.PurchaseValidationCallback f5322v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1rSDK(@NotNull AFe1zSDK aFe1zSDK, @NotNull AFe1zSDK[] aFe1zSDKArr, @NotNull AFc1bSDK aFc1bSDK, @NotNull Map<String, ? extends Object> map, @Nullable PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFe1zSDK, aFe1zSDKArr, aFc1bSDK, null, map);
        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
        Intrinsics.checkNotNullParameter(aFe1zSDKArr, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.f5322v = purchaseValidationCallback;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @Nullable
    public final String AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("connector_version")) {
            Object objRemove = map.remove("connector_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public boolean AFLogger() {
        ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
        if (responseNetwork != null) {
            Intrinsics.checkNotNull(responseNetwork);
            if (responseNetwork.getStatusCode() == 503) {
                return true;
            }
        }
        return super.AFLogger();
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final boolean AFLoggerLogLevel() {
        return true;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.force();
        Throwable v5 = getV();
        if (v5 != null && (purchaseValidationCallback2 = this.f5322v) != null) {
            purchaseValidationCallback2.onFailure(v5);
        }
        ResponseNetwork<String> responseNetwork = ((AFe1kSDK) this).v;
        if (responseNetwork == null || (purchaseValidationCallback = this.f5322v) == null) {
            return;
        }
        purchaseValidationCallback.onResponse(responseNetwork);
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @Nullable
    public final String registerClient(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.containsKey("billing_library_version")) {
            Object objRemove = map.remove("billing_library_version");
            if (objRemove instanceof String) {
                return (String) objRemove;
            }
        }
        return null;
    }
}
