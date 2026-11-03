package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f6821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u3 f6822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(u3 u3Var, Activity activity) {
        super(u3Var.f6895a, true);
        this.f6821e = activity;
        Objects.requireNonNull(u3Var);
        this.f6822f = u3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6822f.f6895a.m())).onActivityStoppedByScionActivityInfo(zzdf.a(this.f6821e), this.b);
    }
}
