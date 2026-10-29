package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.fc */
/* JADX INFO: loaded from: classes.dex */
public final class C2068fc implements InterfaceC1974ad {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2196mc f8183b = new C2030dc();

    /* JADX INFO: renamed from: a */
    public final InterfaceC2196mc f8184a;

    public C2068fc() {
        C1991bb c1991bbM9793c = C1991bb.m9793c();
        C2376wc c2376wc = C2376wc.f8740c;
        C2049ec c2049ec = new C2049ec(c1991bbM9793c, f8183b);
        Charset charset = C2267qb.f8595a;
        this.f8184a = c2049ec;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1974ad
    /* JADX INFO: renamed from: a */
    public final InterfaceC2430zc mo9765a(Class cls) {
        AbstractC2179ld abstractC2179ld = C1993bd.f8114a;
        if (!AbstractC2086gb.class.isAssignableFrom(cls)) {
            C2376wc c2376wc = C2376wc.f8740c;
        }
        InterfaceC2178lc interfaceC2178lcMo9795b = this.f8184a.mo9795b(cls);
        if (interfaceC2178lcMo9795b.zza()) {
            C2376wc c2376wc2 = C2376wc.f8740c;
            return C2304sc.m10720g(C1993bd.m9801a(), C2338ua.m10785a(), interfaceC2178lcMo9795b.zzb());
        }
        C2376wc c2376wc3 = C2376wc.f8740c;
        return C2286rc.m10643y(cls, interfaceC2178lcMo9795b, C2340uc.m10787a(), C1973ac.m9764a(), C1993bd.m9801a(), interfaceC2178lcMo9795b.zzc() + (-1) != 1 ? C2338ua.m10785a() : null, C2160kc.m10347a());
    }
}
