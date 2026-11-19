package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y8 extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(a9 a9Var, Handler handler) {
        super(null);
        Objects.requireNonNull(a9Var);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        p9.c();
    }
}
