package com.google.android.gms.internal.mlkit_vision_face;

import java.io.UnsupportedEncodingException;
import p305n9.C8953m;
import tf.C11640d;

/* JADX INFO: loaded from: classes.dex */
public final class zzof implements zznr {
    private final zzku zza;
    private zzmt zzb = new zzmt();
    private final int zzc;

    private zzof(zzku zzkuVar, int i10) {
        this.zza = zzkuVar;
        zzoo.zza();
        this.zzc = i10;
    }

    public static zznr zzf(zzku zzkuVar) {
        return new zzof(zzkuVar, 0);
    }

    public static zznr zzg(zzku zzkuVar, int i10) {
        return new zzof(zzkuVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzb(zzkt zzktVar) {
        this.zza.zzf(zzktVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final zznr zzc(zzmt zzmtVar) {
        this.zzb = zzmtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final String zzd() {
        zzmv zzmvVarZzf = this.zza.zzj().zzf();
        return (zzmvVarZzf == null || zzac.zzb(zzmvVarZzf.zzk())) ? "NA" : (String) C8953m.m36047l(zzmvVarZzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zznr
    public final byte[] zze(int i10, boolean z10) {
        this.zzb.zzf(Boolean.valueOf(1 == (i10 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzi(this.zzb.zzm());
        try {
            zzoo.zza();
            if (i10 == 0) {
                return new C11640d().m43298i(zzix.zza).m43299j(true).m43297h().mo41319b(this.zza.zzj()).getBytes("utf-8");
            }
            zzkw zzkwVarZzj = this.zza.zzj();
            zzcy zzcyVar = new zzcy();
            zzix.zza.configure(zzcyVar);
            return zzcyVar.zza().zza(zzkwVarZzj);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
