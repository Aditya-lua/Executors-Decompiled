package com.google.android.gms.internal.mlkit_vision_common;

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
public final class zzmp implements zzmc {
    private b zza;
    private final b zzb;
    private final zzme zzc;

    public zzmp(Context context, zzme zzmeVar) {
        this.zzc = zzmeVar;
        a aVar = a.f304g;
        t.f(context);
        final i iVarG = t.c().g(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmm
                @Override // ag.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmo
                        @Override // z7.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzmn
            @Override // ag.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzml
                    @Override // z7.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static d zzb(zzme zzmeVar, zzmb zzmbVar) {
        return d.g(zzmbVar.zzd(zzmeVar.zza(), false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        if (this.zzc.zza() != 0) {
            ((h) this.zzb.get()).a(zzb(this.zzc, zzmbVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((h) bVar.get()).a(zzb(this.zzc, zzmbVar));
        }
    }
}
