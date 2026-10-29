package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.sc */
/* JADX INFO: loaded from: classes.dex */
public final class C2304sc implements InterfaceC2430zc {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2232oc f8638a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2179ld f8639b;

    /* JADX INFO: renamed from: c */
    public final boolean f8640c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2302sa f8641d;

    public C2304sc(AbstractC2179ld abstractC2179ld, AbstractC2302sa abstractC2302sa, InterfaceC2232oc interfaceC2232oc) {
        this.f8639b = abstractC2179ld;
        this.f8640c = interfaceC2232oc instanceof AbstractC2029db;
        this.f8641d = abstractC2302sa;
        this.f8638a = interfaceC2232oc;
    }

    /* JADX INFO: renamed from: g */
    public static C2304sc m10720g(AbstractC2179ld abstractC2179ld, AbstractC2302sa abstractC2302sa, InterfaceC2232oc interfaceC2232oc) {
        return new C2304sc(abstractC2179ld, abstractC2302sa, interfaceC2232oc);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: a */
    public final boolean mo10656a(Object obj) {
        return ((AbstractC2029db) obj).zzb.m10949e();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: b */
    public final void mo10657b(Object obj, Object obj2) {
        C1993bd.m9804d(this.f8639b, obj, obj2);
        if (this.f8640c) {
            C1993bd.m9803c(this.f8641d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: c */
    public final void mo10658c(Object obj) {
        this.f8639b.mo10365b(obj);
        this.f8641d.mo10719a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: d */
    public final void mo10659d(Object obj, byte[] bArr, int i10, int i11, C2355v9 c2355v9) {
        AbstractC2086gb abstractC2086gb = (AbstractC2086gb) obj;
        if (abstractC2086gb.zzc == C2197md.m10389a()) {
            abstractC2086gb.zzc = C2197md.m10390b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: e */
    public final void mo10660e(Object obj, InterfaceC2413yd interfaceC2413yd) {
        Iterator itM10947c = ((AbstractC2029db) obj).zzb.m10947c();
        while (itM10947c.hasNext()) {
            Map.Entry entry = (Map.Entry) itM10947c.next();
            InterfaceC2356va interfaceC2356va = (InterfaceC2356va) entry.getKey();
            if (interfaceC2356va.zzc() != EnumC2395xd.MESSAGE || interfaceC2356va.zzd() || interfaceC2356va.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C2339ub) {
                interfaceC2413yd.mo10442J(interfaceC2356va.zza(), ((C2339ub) entry).m10786a().m10981c());
            } else {
                interfaceC2413yd.mo10442J(interfaceC2356va.zza(), entry.getValue());
            }
        }
        ((AbstractC2086gb) obj).zzc.m10394f(interfaceC2413yd);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    /* JADX INFO: renamed from: f */
    public final boolean mo10661f(Object obj, Object obj2) {
        if (!((AbstractC2086gb) obj).zzc.equals(((AbstractC2086gb) obj2).zzc)) {
            return false;
        }
        if (this.f8640c) {
            return ((AbstractC2029db) obj).zzb.equals(((AbstractC2029db) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    public final Object zza() {
        InterfaceC2232oc interfaceC2232oc = this.f8638a;
        return interfaceC2232oc instanceof AbstractC2086gb ? ((AbstractC2086gb) interfaceC2232oc).m10071m() : interfaceC2232oc.mo10065e().mo9874L();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    public final int zzc(Object obj) {
        int iHashCode = ((AbstractC2086gb) obj).zzc.hashCode();
        return this.f8640c ? (iHashCode * 53) + ((AbstractC2029db) obj).zzb.f8737a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2430zc
    public final int zze(Object obj) {
        int iM10396h = ((AbstractC2086gb) obj).zzc.m10396h();
        return this.f8640c ? iM10396h + ((AbstractC2029db) obj).zzb.m10950g() : iM10396h;
    }
}
