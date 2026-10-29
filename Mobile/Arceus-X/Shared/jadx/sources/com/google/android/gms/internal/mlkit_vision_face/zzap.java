package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class zzap extends zzar implements Serializable {
    private transient Map zza;
    private transient int zzb;

    public zzap(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.zza = map;
    }

    public static /* synthetic */ int zzd(zzap zzapVar) {
        int i10 = zzapVar.zzb;
        zzapVar.zzb = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int zze(zzap zzapVar) {
        int i10 = zzapVar.zzb;
        zzapVar.zzb = i10 - 1;
        return i10;
    }

    public static /* synthetic */ int zzf(zzap zzapVar, int i10) {
        int i11 = zzapVar.zzb + i10;
        zzapVar.zzb = i11;
        return i11;
    }

    public static /* synthetic */ int zzg(zzap zzapVar, int i10) {
        int i11 = zzapVar.zzb - i10;
        zzapVar.zzb = i11;
        return i11;
    }

    public static /* synthetic */ void zzm(zzap zzapVar, Object obj) {
        Object objRemove;
        Map map = zzapVar.zza;
        map.getClass();
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzapVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zzh(Object obj) {
        Collection collectionZza = (Collection) this.zza.get(obj);
        if (collectionZza == null) {
            collectionZza = zza();
        }
        return zzb(obj, collectionZza);
    }

    public final List zzi(Object obj, List list, zzam zzamVar) {
        return list instanceof RandomAccess ? new zzak(this, obj, list, zzamVar) : new zzao(this, obj, list, zzamVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar
    public final Map zzk() {
        return new zzah(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar
    public final Set zzl() {
        return new zzaj(this, this.zza);
    }

    public final void zzn() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzar, com.google.android.gms.internal.mlkit_vision_face.zzca
    public final boolean zzo(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZza = zza();
        if (!collectionZza.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        this.zza.put(obj, collectionZza);
        return true;
    }
}
