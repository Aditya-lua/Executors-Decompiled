package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f6692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f6693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u3 f6694g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(u3 u3Var, Bundle bundle, Activity activity) {
        super(u3Var.f6895a, true);
        this.f6692e = bundle;
        this.f6693f = activity;
        Objects.requireNonNull(u3Var);
        this.f6694g = u3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        Bundle bundle;
        Bundle bundle2 = this.f6692e;
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
        u1 u1Var = (u1) n9.m.l(this.f6694g.f6895a.m());
        Activity activity = this.f6693f;
        u1Var.onActivityCreatedByScionActivityInfo(zzdf.a(activity), bundle, this.b);
    }
}
