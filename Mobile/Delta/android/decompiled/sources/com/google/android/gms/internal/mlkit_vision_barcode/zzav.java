package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzav {
    private final String zza;
    private final zzat zzb;
    private zzat zzc;

    public /* synthetic */ zzav(String str, zzau zzauVar) {
        zzat zzatVar = new zzat();
        this.zzb = zzatVar;
        this.zzc = zzatVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzat zzatVar = this.zzb.zzb;
        String str = "";
        while (zzatVar != null) {
            Object obj = zzatVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzatVar = zzatVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzav zza(Object obj) {
        zzat zzatVar = new zzat();
        this.zzc.zzb = zzatVar;
        this.zzc = zzatVar;
        zzatVar.zza = obj;
        return this;
    }
}
