package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2192m8 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2246p8 f8416a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2192m8(C2246p8 c2246p8, Handler handler) {
        super(null);
        Objects.requireNonNull(c2246p8);
        this.f8416a = c2246p8;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f8416a.m10533e();
    }
}
