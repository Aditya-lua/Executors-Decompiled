package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class gh extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable f6525c;

    public gh(String str, Callable callable) {
        super("internal.appMetadata");
        this.f6525c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(y4 y4Var, List list) {
        try {
            return a7.a(this.f6525c.call());
        } catch (Exception unused) {
            return q.Co;
        }
    }
}
