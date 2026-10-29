package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzs extends zzl implements Set {
    private transient zzp zza;

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
        return zzaa.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzab iterator();

    public final zzp zzf() {
        zzp zzpVar = this.zza;
        if (zzpVar != null) {
            return zzpVar;
        }
        zzp zzpVarZzg = zzg();
        this.zza = zzpVarZzg;
        return zzpVarZzg;
    }

    public zzp zzg() {
        return zzp.zzg(toArray());
    }
}
