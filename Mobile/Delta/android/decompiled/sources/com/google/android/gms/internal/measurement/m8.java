package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m8 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p8 f6622a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(p8 p8Var, Handler handler) {
        super(null);
        Objects.requireNonNull(p8Var);
        this.f6622a = p8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f6622a.e();
    }
}
