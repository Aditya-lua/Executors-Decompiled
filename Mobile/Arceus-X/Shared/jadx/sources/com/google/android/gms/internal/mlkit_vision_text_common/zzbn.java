package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbn extends zzbf implements Set {
    private transient zzbk zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzcl.zza(this);
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzco iterator();

    public final zzbk zzf() {
        zzbk zzbkVar = this.zza;
        if (zzbkVar != null) {
            return zzbkVar;
        }
        zzbk zzbkVarZzg = zzg();
        this.zza = zzbkVarZzg;
        return zzbkVarZzg;
    }

    public zzbk zzg() {
        Object[] array = toArray();
        int i10 = zzbk.zzd;
        return zzbk.zzg(array, array.length);
    }
}
