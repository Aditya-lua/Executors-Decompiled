package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class jc implements ed {
    public static final qc b = new hc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qc f6565a;

    public jc() {
        fb fbVarC = fb.c();
        ad adVar = ad.f6375c;
        ic icVar = new ic(fbVarC, b);
        Charset charset = ub.f6869a;
        this.f6565a = icVar;
    }

    @Override // com.google.android.gms.internal.measurement.ed
    public final dd a(Class cls) {
        pd pdVar = fd.f6505a;
        if (!kb.class.isAssignableFrom(cls)) {
            ad adVar = ad.f6375c;
        }
        pc pcVarB = this.f6565a.b(cls);
        if (pcVarB.zza()) {
            ad adVar2 = ad.f6375c;
            return wc.g(fd.a(), ya.a(), pcVarB.zzb());
        }
        ad adVar3 = ad.f6375c;
        return vc.y(cls, pcVarB, yc.a(), ec.a(), fd.a(), pcVarB.zzc() + (-1) != 1 ? ya.a() : null, oc.a());
    }
}
