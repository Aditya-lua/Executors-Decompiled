package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l8 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8 f6591a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(n8 n8Var, Handler handler) {
        super(null);
        Objects.requireNonNull(n8Var);
        this.f6591a = n8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f6591a.b().set(true);
    }
}
