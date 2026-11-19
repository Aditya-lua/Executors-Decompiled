package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f6785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f6786f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y3 f6787g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(y3 y3Var, Bundle bundle, Activity activity) {
        super(y3Var.f6943a, true);
        this.f6785e = bundle;
        this.f6786f = activity;
        Objects.requireNonNull(y3Var);
        this.f6787g = y3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        Bundle bundle;
        Bundle bundle2 = this.f6785e;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        u1 u1Var = (u1) o9.s.l(this.f6787g.f6943a.m());
        Activity activity = this.f6786f;
        u1Var.onActivityCreatedByScionActivityInfo(j2.a(activity), bundle, this.b);
    }
}
