package com.google.android.gms.internal.mlkit_common;

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
public final class zzsp implements zzrz {
    private b zza;
    private final b zzb;
    private final zzsb zzc;

    public zzsp(Context context, zzsb zzsbVar) {
        this.zzc = zzsbVar;
        a aVar = a.f304g;
        t.f(context);
        final i iVarG = t.c().g(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new x(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsm
                @Override // ag.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new g() { // from class: com.google.android.gms.internal.mlkit_common.zzso
                        @Override // z7.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new x(new b() { // from class: com.google.android.gms.internal.mlkit_common.zzsn
            @Override // ag.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_common.zzsl
                    @Override // z7.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static d zzb(zzsb zzsbVar, zzry zzryVar) {
        return d.g(zzryVar.zze(zzsbVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzrz
    public final void zza(zzry zzryVar) {
        if (this.zzc.zza() != 0) {
            ((h) this.zzb.get()).a(zzb(this.zzc, zzryVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((h) bVar.get()).a(zzb(this.zzc, zzryVar));
        }
    }
}
