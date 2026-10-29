package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h8 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j8 f6468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(j8 j8Var, Handler handler) {
        super(null);
        Objects.requireNonNull(j8Var);
        this.f6468a = j8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f6468a.b().set(true);
    }
}
