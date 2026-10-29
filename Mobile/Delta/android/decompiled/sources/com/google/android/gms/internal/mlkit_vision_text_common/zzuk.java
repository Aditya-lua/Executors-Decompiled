package com.google.android.gms.internal.mlkit_vision_text_common;

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
public final class zzuk implements zzts {
    private b zza;
    private final b zzb;
    private final zztu zzc;

    public zzuk(Context context, zztu zztuVar) {
        this.zzc = zztuVar;
        a aVar = a.f37333g;
        t.f(context);
        final i iVarG = t.c().g(aVar);
        if (aVar.a().contains(c.b("json"))) {
            this.zza = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuh
                @Override // xf.b
                public final Object get() {
                    return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("json"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuj
                        @Override // y7.g
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new x(new b() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzui
            @Override // xf.b
            public final Object get() {
                return iVarG.a("FIREBASE_ML_SDK", byte[].class, c.b("proto"), new g() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzug
                    @Override // y7.g
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static d zzb(zztu zztuVar, zztr zztrVar) {
        int iZza = zztuVar.zza();
        return zztrVar.zza() != 0 ? d.e(zztrVar.zze(iZza, false)) : d.g(zztrVar.zze(iZza, false));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza(zztr zztrVar) {
        if (this.zzc.zza() != 0) {
            ((h) this.zzb.get()).a(zzb(this.zzc, zztrVar));
            return;
        }
        b bVar = this.zza;
        if (bVar != null) {
            ((h) bVar.get()).a(zzb(this.zzc, zztrVar));
        }
    }
}
