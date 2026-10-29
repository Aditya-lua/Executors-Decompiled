package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ch */
/* JADX INFO: loaded from: classes.dex */
public final class C2016ch extends AbstractC2147k {

    /* JADX INFO: renamed from: c */
    public final Callable f8138c;

    public C2016ch(String str, Callable callable) {
        super("internal.appMetadata");
        this.f8138c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2147k
    /* JADX INFO: renamed from: h */
    public final InterfaceC2255q mo9763h(C2332u4 c2332u4, List list) {
        try {
            return C2370w6.m10914a(this.f8138c.call());
        } catch (Exception unused) {
            return InterfaceC2255q.f8587zo;
        }
    }
}
