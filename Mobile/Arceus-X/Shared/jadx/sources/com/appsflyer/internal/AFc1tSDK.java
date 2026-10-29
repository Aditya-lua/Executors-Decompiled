package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p539x8.C12767a;
import p539x8.C12769c;
import sb.InterfaceC11256g;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1tSDK implements AFb1aSDK {

    @NotNull
    private final AFc1eSDK AFLogger;

    /* JADX INFO: renamed from: d */
    @NotNull
    private final AFf1fSDK f6893d;

    @NotNull
    private final AFd1zSDK unregisterClient;

    public AFc1tSDK(@NotNull AFc1eSDK aFc1eSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFf1fSDK aFf1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        this.AFLogger = aFc1eSDK;
        this.unregisterClient = aFd1zSDK;
        this.f6893d = aFf1fSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerClient(AFc1tSDK aFc1tSDK, C12769c c12769c) {
        AFc1eSDK aFc1eSDK = aFc1tSDK.AFLogger;
        int iM47638b = c12769c.m47638b();
        String strM47637a = c12769c.m47637a();
        Intrinsics.checkNotNullExpressionValue(strM47637a, "");
        aFc1eSDK.setUserEmail = new AFc1rSDK(iM47638b, strM47637a);
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final boolean AFLogger() {
        return !this.f6893d.AFLogger() && !this.AFLogger.setCustomerUserId && AFj1qSDK.AFLogger(this.unregisterClient.f6933d) && AFj1qSDK.registerClient(this.unregisterClient.f6933d);
    }

    @Override // com.appsflyer.internal.AFb1aSDK
    public final void unregisterClient() {
        Context context = this.unregisterClient.f6933d;
        if (context != null) {
            try {
                C12767a.m47636a(context).mo46198j().mo11893g(new InterfaceC11256g() { // from class: com.appsflyer.internal.b0
                    @Override // sb.InterfaceC11256g
                    public final void onSuccess(Object obj) {
                        AFc1tSDK.registerClient(this.f7103a, (C12769c) obj);
                    }
                });
            } catch (Throwable th2) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.APP_SET_ID, "Error while trying to  fetch App set ID", th2, false, false, false, false, 120, null);
                Unit unit = Unit.f29331a;
            }
        }
    }
}
