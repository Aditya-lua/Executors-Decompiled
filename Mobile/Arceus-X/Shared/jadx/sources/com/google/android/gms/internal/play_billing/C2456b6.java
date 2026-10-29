package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2456b6 implements InterfaceC2522h6 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2697x5 f8928a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2654t6 f8929b;

    /* JADX INFO: renamed from: c */
    public final boolean f8930c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2509g4 f8931d;

    public C2456b6(AbstractC2654t6 abstractC2654t6, AbstractC2509g4 abstractC2509g4, InterfaceC2697x5 interfaceC2697x5) {
        this.f8929b = abstractC2654t6;
        this.f8930c = interfaceC2697x5 instanceof AbstractC2619q4;
        this.f8931d = abstractC2509g4;
        this.f8928a = interfaceC2697x5;
    }

    /* JADX INFO: renamed from: g */
    public static C2456b6 m11315g(AbstractC2654t6 abstractC2654t6, AbstractC2509g4 abstractC2509g4, InterfaceC2697x5 interfaceC2697x5) {
        return new C2456b6(abstractC2654t6, abstractC2509g4, interfaceC2697x5);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: a */
    public final boolean mo11213a(Object obj) {
        return ((AbstractC2619q4) obj).zzb.m11529i();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: b */
    public final void mo11214b(Object obj) {
        this.f8929b.mo11761b(obj);
        this.f8931d.mo11436a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: c */
    public final void mo11215c(Object obj, Object obj2) {
        C2533i6.m11496u(this.f8929b, obj, obj2);
        if (this.f8930c) {
            C2533i6.m11495t(this.f8931d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: d */
    public final boolean mo11216d(Object obj, Object obj2) {
        if (!((AbstractC2652t4) obj).zzc.equals(((AbstractC2652t4) obj2).zzc)) {
            return false;
        }
        if (this.f8930c) {
            return ((AbstractC2619q4) obj).zzb.equals(((AbstractC2619q4) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: e */
    public final void mo11217e(Object obj, InterfaceC2534i7 interfaceC2534i7) {
        Iterator itM11526f = ((AbstractC2619q4) obj).zzb.m11526f();
        while (itM11526f.hasNext()) {
            Map.Entry entry = (Map.Entry) itM11526f.next();
            InterfaceC2542j4 interfaceC2542j4 = (InterfaceC2542j4) entry.getKey();
            if (interfaceC2542j4.zzc() != EnumC2523h7.MESSAGE || interfaceC2542j4.zze() || interfaceC2542j4.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C2444a5) {
                interfaceC2534i7.mo11280D(interfaceC2542j4.zza(), ((C2444a5) entry).m11194a().m11364e());
            } else {
                interfaceC2534i7.mo11280D(interfaceC2542j4.zza(), entry.getValue());
            }
        }
        ((AbstractC2652t4) obj).zzc.m11786k(interfaceC2534i7);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    /* JADX INFO: renamed from: f */
    public final void mo11218f(Object obj, byte[] bArr, int i10, int i11, C2497f3 c2497f3) {
        AbstractC2652t4 abstractC2652t4 = (AbstractC2652t4) obj;
        if (abstractC2652t4.zzc == C2665u6.m11776c()) {
            abstractC2652t4.zzc = C2665u6.m11778f();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    public final int zza(Object obj) {
        int iM11780b = ((AbstractC2652t4) obj).zzc.m11780b();
        return this.f8930c ? iM11780b + ((AbstractC2619q4) obj).zzb.m11525d() : iM11780b;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    public final int zzb(Object obj) {
        int iHashCode = ((AbstractC2652t4) obj).zzc.hashCode();
        return this.f8930c ? (iHashCode * 53) + ((AbstractC2619q4) obj).zzb.f9063a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2522h6
    public final Object zze() {
        InterfaceC2697x5 interfaceC2697x5 = this.f8928a;
        return interfaceC2697x5 instanceof AbstractC2652t4 ? ((AbstractC2652t4) interfaceC2697x5).m11758u() : interfaceC2697x5.zzw().mo11643g();
    }
}
