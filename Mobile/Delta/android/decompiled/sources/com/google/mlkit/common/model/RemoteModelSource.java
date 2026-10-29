package com.google.mlkit.common.model;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
import n9.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RemoteModelSource {
    private final String zza;

    public RemoteModelSource(String str) {
        this.zza = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass().equals(getClass())) {
            return k.b(this.zza, ((RemoteModelSource) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return k.c(this.zza);
    }

    @NonNull
    public String toString() {
        zzq zzqVarZzb = zzr.zzb("RemoteModelSource");
        zzqVarZzb.zza("firebaseModelName", this.zza);
        return zzqVarZzb.toString();
    }

    public final String zza() {
        return this.zza;
    }
}
