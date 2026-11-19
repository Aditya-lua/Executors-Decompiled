package com.google.android.gms.internal.mlkit_vision_face;

import a8.a;
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
public final class zzok implements zzob {
    private b zza;
    private final b zzb;
    private final zznt zzc;

    public zzok(Context context, zznt zzntVar) {
        this.zzc = zzntVar;
        a aVar = a.f304g;
        t.f(context);
        final i iVarG = t.c().g(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoh
                @Override // ag.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoj
                        @Override // z7.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoi
            @Override // ag.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzog
                    @Override // z7.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static d zzb(zznt zzntVar, zznr zznrVar) {
        int iZza = zzntVar.zza();
        return zznrVar.zza() != 0 ? d.e(zznrVar.zze(iZza, false)) : d.g(zznrVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzob
    public final void zza(zznr zznrVar) {
        if (this.zzc.zza() != 0) {
            ((h) this.zzb.get()).a(zzb(this.zzc, zznrVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((h) bVar.get()).a(zzb(this.zzc, zznrVar));
        }
    }
}
