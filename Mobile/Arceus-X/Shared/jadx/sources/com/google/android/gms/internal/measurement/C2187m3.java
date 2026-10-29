package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2187m3 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f8413e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Activity f8414f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2331u3 f8415g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2187m3(C2331u3 c2331u3, Bundle bundle, Activity activity) {
        super(c2331u3.f8681a, true);
        this.f8413e = bundle;
        this.f8414f = activity;
        Objects.requireNonNull(c2331u3);
        this.f8415g = c2331u3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        Bundle bundle;
        Bundle bundle2 = this.f8413e;
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
        InterfaceC2329u1 interfaceC2329u1 = (InterfaceC2329u1) C8953m.m36047l(this.f8415g.f8681a.m10814m());
        Activity activity = this.f8414f;
        interfaceC2329u1.onActivityCreatedByScionActivityInfo(zzdf.m11161a(activity), bundle, this.f8336b);
    }
}
