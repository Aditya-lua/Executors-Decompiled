package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2336u8 extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2336u8(C2372w8 c2372w8, Handler handler) {
        super(null);
        Objects.requireNonNull(c2372w8);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        AbstractC2175l9.m10362c();
    }
}
