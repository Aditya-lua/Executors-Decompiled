package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbq extends zzbi implements Set {
    private transient zzbn zza;

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
        return zzcj.zza(this);
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzcl iterator();

    public final zzbn zzf() {
        zzbn zzbnVar = this.zza;
        if (zzbnVar != null) {
            return zzbnVar;
        }
        zzbn zzbnVarZzg = zzg();
        this.zza = zzbnVarZzg;
        return zzbnVarZzg;
    }

    public zzbn zzg() {
        return zzbn.zzg(toArray());
    }
}
