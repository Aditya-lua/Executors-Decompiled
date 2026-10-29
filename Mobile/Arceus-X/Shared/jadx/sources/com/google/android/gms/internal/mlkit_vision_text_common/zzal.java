package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class zzal extends zzan implements Serializable {
    private transient Map zza;
    private transient int zzb;

    public zzal(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzal zzalVar, Object obj) {
        Object objRemove;
        Map map = zzalVar.zza;
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
            zzalVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zze(Object obj) {
        Collection collectionZza = (Collection) this.zza.get(obj);
        if (collectionZza == null) {
            collectionZza = zza();
        }
        return zzb(obj, collectionZza);
    }

    public final List zzf(Object obj, List list, zzai zzaiVar) {
        return list instanceof RandomAccess ? new zzag(this, obj, list, zzaiVar) : new zzak(this, obj, list, zzaiVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan
    public final Map zzh() {
        return new zzad(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan
    public final Set zzi() {
        return new zzaf(this, this.zza);
    }

    public final void zzl() {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzan, com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final boolean zzm(Object obj, Object obj2) {
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
