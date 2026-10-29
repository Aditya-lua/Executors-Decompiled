package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import b8.t;
import lf.x;
import xf.b;
import y7.c;
import y7.d;
import y7.g;
import y7.h;
import y7.i;
import z7.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzok implements zzob {
    private b zza;
    private final b zzb;
    private final zznt zzc;

    public zzok(Context context, zznt zzntVar) {
        this.zzc = zzntVar;
        a aVar = a.f37333g;
        t.f(context);
        final i iVarG = t.c().g(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoh
                @Override // xf.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoj
                        @Override // y7.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzoi
            @Override // xf.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzog
                    @Override // y7.g
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
