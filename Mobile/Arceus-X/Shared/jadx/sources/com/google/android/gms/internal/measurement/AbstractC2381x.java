package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2381x {

    /* JADX INFO: renamed from: a */
    public final List f8765a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC2255q mo9574a(String str, C2332u4 c2332u4, List list);

    /* JADX INFO: renamed from: b */
    public final InterfaceC2255q m10957b(String str) {
        if (this.f8765a.contains(C2351v5.m10832e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
