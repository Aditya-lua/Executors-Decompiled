package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class ch extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable f6408c;

    public ch(String str, Callable callable) {
        super("internal.appMetadata");
        this.f6408c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final q h(u4 u4Var, List list) {
        try {
            return w6.a(this.f6408c.call());
        } catch (Exception unused) {
            return q.f6743zo;
        }
    }
}
