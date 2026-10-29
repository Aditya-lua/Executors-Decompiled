package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f5201a;

    public /* synthetic */ c(Function1 function1) {
        this.f5201a = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.unregisterClient(this.f5201a);
    }
}
