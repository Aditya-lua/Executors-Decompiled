package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.UnsupportedEncodingException;
import p305n9.C8953m;
import tf.C11640d;

/* JADX INFO: loaded from: classes.dex */
public final class zzuf implements zztr {
    private final zzow zza;
    private zzsr zzb = new zzsr();
    private final int zzc;

    private zzuf(zzow zzowVar, int i10) {
        this.zza = zzowVar;
        zzuo.zza();
        this.zzc = i10;
    }

    public static zztr zzf(zzow zzowVar) {
        return new zzuf(zzowVar, 0);
    }

    public static zztr zzg(zzow zzowVar, int i10) {
        return new zzuf(zzowVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzb(zzov zzovVar) {
        this.zza.zzf(zzovVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzc(zzsr zzsrVar) {
        this.zzb = zzsrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final String zzd() {
        zzst zzstVarZzf = this.zza.zzj().zzf();
        return (zzstVarZzf == null || zzy.zzb(zzstVarZzf.zzk())) ? "NA" : (String) C8953m.m36047l(zzstVarZzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final byte[] zze(int i10, boolean z10) {
        this.zzb.zzf(Boolean.valueOf(1 == (i10 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzi(this.zzb.zzm());
        try {
            zzuo.zza();
            if (i10 == 0) {
                return new C11640d().m43298i(zzmq.zza).m43299j(true).m43297h().mo41319b(this.zza.zzj()).getBytes("utf-8");
            }
            zzoy zzoyVarZzj = this.zza.zzj();
            zzdb zzdbVar = new zzdb();
            zzmq.zza.configure(zzdbVar);
            return zzdbVar.zza().zza(zzoyVarZzj);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
