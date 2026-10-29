package com.appsflyer.internal;

/* JADX INFO: renamed from: com.appsflyer.internal.i0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1806i0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AFe1wSDK f7127a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.appsflyer.internal.AFe1wSDK.AFLogger(com.appsflyer.internal.AFe1wSDK):void, com.appsflyer.internal.AFe1wSDK.unregisterClient():void, com.appsflyer.internal.AFe1wSDK.unregisterClient(com.appsflyer.internal.AFe1wSDK, com.appsflyer.internal.AFe1ySDK):void] */
    public /* synthetic */ RunnableC1806i0(AFe1wSDK aFe1wSDK) {
        this.f7127a = aFe1wSDK;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.appsflyer.internal.AFe1wSDK.a(com.appsflyer.internal.AFe1wSDK):void */
    @Override // java.lang.Runnable
    public final void run() {
        AFe1wSDK.AFLogger(this.f7127a);
    }
}
