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

    /* JADX INFO: renamed from: v */
    @NotNull
    private final String f6948v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1nSDK(@NotNull AFc1bSDK aFc1bSDK, @NotNull String str, @Nullable AFj1bSDK aFj1bSDK) {
        super(AFd1bSDK.IMPRESSIONS, new AFe1zSDK[]{AFd1bSDK.RC_CDN, AFd1bSDK.FETCH_ADVERTISING_ID}, aFc1bSDK, str);
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f6948v = str;
        this.force = aFj1bSDK;
        AFc1iSDK aFc1iSDKAFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFLogger, "");
        this.afWarnLog = aFc1iSDKAFLogger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    /* JADX INFO: renamed from: e */
    public final boolean mo8803e() {
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
            AFLogger.INSTANCE.mo8698i(LogTag.CROSS_PROMOTION, "Cross promotion impressions success: " + this.f6948v, false);
            return;
        }
        if (statusCode != 301 && statusCode != 302) {
            AFLogger.INSTANCE.mo8698i(LogTag.CROSS_PROMOTION, "call to " + this.f6948v + " failed: " + aFd1fSDK.getStatusCode(), true);
            return;
        }
        AFLogger.INSTANCE.mo8698i(LogTag.CROSS_PROMOTION, "Cross promotion redirection success: " + this.f6948v, false);
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
                AFLogger.INSTANCE.m8961e(LogTag.CROSS_PROMOTION, "Failed to open cross promotion URL; is a browser app installed?", e10);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.appsflyer.internal.AFe1kSDK
    @NotNull
    public final AFd1pSDK<String> AFLogger(@NotNull String str) {
        String string;
        Intrinsics.checkNotNullParameter(str, "");
        AFd1sSDK d10 = getD();
        String strAFLogger = this.afWarnLog.AFLogger();
        if (strAFLogger == null || strAFLogger.length() == 0) {
            string = this.f6948v;
        } else {
            string = Uri.parse(this.f6948v).buildUpon().appendQueryParameter("advertising_id", strAFLogger).build().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        AFd1pSDK<String> aFd1pSDKM8783d = d10.m8783d(string);
        Intrinsics.checkNotNullExpressionValue(aFd1pSDKM8783d, "");
        return aFd1pSDKM8783d;
    }
}
