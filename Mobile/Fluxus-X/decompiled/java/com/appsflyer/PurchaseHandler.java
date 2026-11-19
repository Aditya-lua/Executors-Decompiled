package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1iSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFj1nSDK;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseHandler {

    @NonNull
    public final AFc1bSDK AFKeystoreWrapper;

    @NonNull
    private final AFc1iSDK registerClient;

    @NonNull
    public final AFe1wSDK unregisterClient;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th2);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFc1bSDK aFc1bSDK) {
        this.AFKeystoreWrapper = aFc1bSDK;
        this.registerClient = aFc1bSDK.AFLogger();
        this.unregisterClient = aFc1bSDK.afWarnLog();
    }

    public final boolean registerClient(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean zAFLogger = AFj1nSDK.AFLogger(map, strArr, this.registerClient);
        if (!zAFLogger && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return zAFLogger;
    }
}
