package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2102h8 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2138j8 f8216a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2102h8(C2138j8 c2138j8, Handler handler) {
        super(null);
        Objects.requireNonNull(c2138j8);
        this.f8216a = c2138j8;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f8216a.m10300b().set(true);
    }
}
