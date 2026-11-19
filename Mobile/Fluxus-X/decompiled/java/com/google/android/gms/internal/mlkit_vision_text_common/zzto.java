package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes.dex */
final class zzto extends zztt {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztt zza(boolean z10) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztt zzb(int i10) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zztt zzc(String str) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztu zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zztq(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
