package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1nSDK extends AFe1kSDK<String> {

    @NotNull
    private final AFc1iSDK afWarnLog;

    @Nullable
    private final AFj1bSDK force;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final String f5320v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1nSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull String str, @Nullable AFj1bSDK aFj1bSDK) {
        super(AFd1bSDK.IMPRESSIONS, new AFe1zSDK[]{AFd1bSDK.RC_CDN, AFd1bSDK.FETCH_ADVERTISING_ID}, aFc1bSDK, str);
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f5320v = str;
        this.force = aFj1bSDK;
        AFc1iSDK aFc1iSDKAFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFLogger, "");
        this.afWarnLog = aFc1iSDKAFLogger;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @Nullable
    public final AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        AFj1bSDK aFj1bSDK;
        super.force();
        AFd1fSDK<Result> aFd1fSDK = ((AFe1kSDK) this).v;
        if (aFd1fSDK == 0) {
            return;
        }
        int statusCode = aFd1fSDK.getStatusCode();
        if (statusCode == 200) {
            AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, "Cross promotion impressions success: " + this.f5320v, false);
            return;
        }
        if (statusCode != 301 && statusCode != 302) {
            AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, "call to " + this.f5320v + " failed: " + aFd1fSDK.getStatusCode(), true);
            return;
        }
        AFLogger.INSTANCE.i(LogTag.CROSS_PROMOTION, "Cross promotion redirection success: " + this.f5320v, false);
        String strAFKeystoreWrapper = aFd1fSDK.AFKeystoreWrapper("Location");
        if (strAFKeystoreWrapper == null || (aFj1bSDK = this.force) == null) {
            return;
        }
        aFj1bSDK.unregisterClient = strAFKeystoreWrapper;
        Context context = aFj1bSDK.AFKeystoreWrapper.get();
        if (context != null) {
            try {
                if (aFj1bSDK.unregisterClient != null) {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFj1bSDK.unregisterClient)).setFlags(268435456));
                }
            } catch (Exception e10) {
                AFLogger.INSTANCE.e(LogTag.CROSS_PROMOTION, "Failed to open cross promotion URL; is a browser app installed?", e10);
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    @NotNull
    public final AFd1pSDK<String> AFLogger(@NotNull String str) {
        String string;
        Intrinsics.checkNotNullParameter(str, "");
        AFd1sSDK d10 = getD();
        String strAFLogger = this.afWarnLog.AFLogger();
        if (strAFLogger == null || strAFLogger.length() == 0) {
            string = this.f5320v;
        } else {
            string = Uri.parse(this.f5320v).buildUpon().appendQueryParameter("advertising_id", strAFLogger).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        AFd1pSDK<String> aFd1pSDKD = d10.d(string);
        Intrinsics.checkNotNullExpressionValue(aFd1pSDKD, "");
        return aFd1pSDKD;
    }
}
