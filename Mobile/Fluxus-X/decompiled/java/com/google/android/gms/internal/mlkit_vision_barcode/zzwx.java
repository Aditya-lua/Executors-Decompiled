package com.google.android.gms.internal.mlkit_vision_barcode;

import ag.b;
import android.content.Context;
import c8.t;
import of.x;
import z7.c;
import z7.d;
import z7.g;
import z7.h;
import z7.i;

/* JADX INFO: loaded from: classes.dex */
public final class zzwx implements zzwf {
    private b zza;
    private final b zzb;
    private final zzwh zzc;

    public zzwx(Context context, zzwh zzwhVar) {
        this.zzc = zzwhVar;
        a8.a aVar = a8.a.f304g;
        t.f(context);
        final i iVarG = t.c().g(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwu
                @Override // ag.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzww
                        @Override // z7.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwv
            @Override // ag.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwt
                    @Override // z7.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static d zzb(zzwh zzwhVar, zzwe zzweVar) {
        int iZza = zzwhVar.zza();
        return zzweVar.zza() != 0 ? d.e(zzweVar.zze(iZza, false)) : d.g(zzweVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(zzwe zzweVar) {
        if (this.zzc.zza() != 0) {
            ((h) this.zzb.get()).a(zzb(this.zzc, zzweVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((h) bVar.get()).a(zzb(this.zzc, zzweVar));
        }
    }
}
