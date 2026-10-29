package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import p028b8.C1272t;
import p292mf.C8517x;
import p569y7.AbstractC13117d;
import p569y7.C13116c;
import p569y7.InterfaceC13120g;
import p569y7.InterfaceC13121h;
import p569y7.InterfaceC13122i;
import p575yf.InterfaceC13188b;
import p597z7.C13732a;

/* JADX INFO: loaded from: classes.dex */
public final class zzsp implements zzrz {
    private InterfaceC13188b zza;
    private final InterfaceC13188b zzb;
    private final zzsb zzc;

    public zzsp(Context context, zzsb zzsbVar) {
        this.zzc = zzsbVar;
        C13732a c13732a = C13732a.f48305g;
        C1272t.m7051f(context);
        final InterfaceC13122i interfaceC13122iM7054g = C1272t.m7049c().m7054g(c13732a);
        if (c13732a.mo7019a().contains(C13116c.m48729b("json"))) {
            this.zza = new C8517x(new InterfaceC13188b() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // p575yf.InterfaceC13188b
                public final Object get() {
                    return interfaceC13122iM7054g.mo7043a("FIREBASE_ML_SDK", byte[].class, C13116c.m48729b("json"), new InterfaceC13120g() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // p569y7.InterfaceC13120g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new C8517x(new InterfaceC13188b() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // p575yf.InterfaceC13188b
            public final Object get() {
                return interfaceC13122iM7054g.mo7043a("FIREBASE_ML_SDK", byte[].class, C13116c.m48729b("proto"), new InterfaceC13120g() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // p569y7.InterfaceC13120g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static AbstractC13117d zzb(zzsb zzsbVar, zzry zzryVar) {
        return AbstractC13117d.m48733g(zzryVar.zze(zzsbVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        if (this.zzc.zza() != 0) {
            ((InterfaceC13121h) this.zzb.get()).mo7046a(zzb(this.zzc, zzryVar));
            return;
        }
        InterfaceC13188b interfaceC13188b = this.zza;
        if (interfaceC13188b != null) {
            ((InterfaceC13121h) interfaceC13188b.get()).mo7046a(zzb(this.zzc, zzryVar));
        }
    }
}
