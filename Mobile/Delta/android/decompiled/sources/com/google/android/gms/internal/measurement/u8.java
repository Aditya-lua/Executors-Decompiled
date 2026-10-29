package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u8 extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(w8 w8Var, Handler handler) {
        super(null);
        Objects.requireNonNull(w8Var);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        l9.c();
    }
}
