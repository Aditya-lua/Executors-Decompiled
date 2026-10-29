package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.appsflyer.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1762c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f6825a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.appsflyer.AFLogger.d(com.appsflyer.sdk_base.logger.LogTag, java.lang.String, boolean):void, com.appsflyer.AFLogger.e(com.appsflyer.sdk_base.logger.LogTag, java.lang.String, java.lang.Throwable, boolean, boolean, boolean, boolean):void, com.appsflyer.AFLogger.force(com.appsflyer.sdk_base.logger.LogTag, java.lang.String):void, com.appsflyer.AFLogger.i(com.appsflyer.sdk_base.logger.LogTag, java.lang.String, boolean):void, com.appsflyer.AFLogger.v(com.appsflyer.sdk_base.logger.LogTag, java.lang.String, boolean):void, com.appsflyer.AFLogger.w(com.appsflyer.sdk_base.logger.LogTag, java.lang.String, boolean):void] */
    public /* synthetic */ RunnableC1762c(Function1 function1) {
        this.f6825a = function1;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.appsflyer.AFLogger.n(kotlin.jvm.functions.Function1):void */
    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.unregisterClient(this.f6825a);
    }
}
