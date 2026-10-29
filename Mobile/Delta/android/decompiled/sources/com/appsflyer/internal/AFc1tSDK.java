package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1tSDK implements AFb1aSDK {

    @NotNull
    private final AFc1eSDK AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFf1fSDK f5265d;

    @NotNull
    private final AFd1zSDK unregisterClient;

    public AFc1tSDK(@NotNull AFc1eSDK aFc1eSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFf1fSDK aFf1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        this.AFLogger = aFc1eSDK;
        this.unregisterClient = aFd1zSDK;
        this.f5265d = aFf1fSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerClient(AFc1tSDK aFc1tSDK, x8.c cVar) {
        AFc1eSDK aFc1eSDK = aFc1tSDK.AFLogger;
        int iB = cVar.b();
        String strA = cVar.a();
        Intrinsics.checkNotNullExpressionValue(strA, "");
        aFc1eSDK.setUserEmail = new AFc1rSDK(iB, strA);
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final boolean AFLogger() {
        return !this.f5265d.AFLogger() && !this.AFLogger.setCustomerUserId && AFj1qSDK.AFLogger(this.unregisterClient.f5305d) && AFj1qSDK.registerClient(this.unregisterClient.f5305d);
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void unregisterClient() {
        Context context = this.unregisterClient.f5305d;
        if (context != null) {
            try {
                x8.a.a(context).j().g(new sb.g() { // from class: com.appsflyer.internal.b0
                    @Override // sb.g
                    public final void onSuccess(Object obj) {
                        AFc1tSDK.registerClient(this.f5474a, (x8.c) obj);
                    }
                });
            } catch (Throwable th2) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.APP_SET_ID, "Error while trying to  fetch App set ID", th2, false, false, false, false, 120, null);
                Unit unit = Unit.f22483a;
            }
        }
    }
}
