package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class fc implements ad {
    public static final mc b = new dc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mc f6444a;

    public fc() {
        bb bbVarC = bb.c();
        wc wcVar = wc.f6869c;
        ec ecVar = new ec(bbVarC, b);
        Charset charset = qb.f6750a;
        this.f6444a = ecVar;
    }

    @Override // com.google.android.gms.internal.measurement.ad
    public final zc a(Class cls) {
        ld ldVar = bd.f6390a;
        if (!gb.class.isAssignableFrom(cls)) {
            wc wcVar = wc.f6869c;
        }
        lc lcVarB = this.f6444a.b(cls);
        if (lcVarB.zza()) {
            wc wcVar2 = wc.f6869c;
            return sc.g(bd.a(), ua.a(), lcVarB.zzb());
        }
        wc wcVar3 = wc.f6869c;
        return rc.y(cls, lcVarB, uc.a(), ac.a(), bd.a(), lcVarB.zzc() + (-1) != 1 ? ua.a() : null, kc.a());
    }
}
