package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzv {
    private final String zza;
    private final zzu zzb;
    private zzu zzc;

    public /* synthetic */ zzv(String str, zzs zzsVar) {
        zzu zzuVar = new zzu(null);
        this.zzb = zzuVar;
        this.zzc = zzuVar;
        this.zza = str;
    }

    private final zzv zze(String str, Object obj) {
        zzt zztVar = new zzt(null);
        this.zzc.zzc = zztVar;
        this.zzc = zztVar;
        zztVar.zzb = obj;
        zztVar.zza = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzu zzuVar = this.zzb.zzc;
        String str = "";
        while (zzuVar != null) {
            Object obj = zzuVar.zzb;
            sb2.append(str);
            String str2 = zzuVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzuVar = zzuVar.zzc;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzv zza(String str, float f10) {
        zze(str, String.valueOf(f10));
        return this;
    }

    public final zzv zzb(String str, int i10) {
        zze(str, String.valueOf(i10));
        return this;
    }

    public final zzv zzc(String str, Object obj) {
        zzu zzuVar = new zzu(null);
        this.zzc.zzc = zzuVar;
        this.zzc = zzuVar;
        zzuVar.zzb = obj;
        zzuVar.zza = str;
        return this;
    }

    public final zzv zzd(String str, boolean z10) {
        zze("trackingEnabled", String.valueOf(z10));
        return this;
    }
}
