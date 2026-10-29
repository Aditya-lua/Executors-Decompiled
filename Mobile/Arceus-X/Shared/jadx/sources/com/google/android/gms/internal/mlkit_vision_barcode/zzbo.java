package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class zzbo extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzbo zzc;
    final Collection zzd;
    final /* synthetic */ zzbr zze;

    public zzbo(zzbr zzbrVar, Object obj, Collection collection, zzbo zzboVar) {
        this.zze = zzbrVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzboVar;
        this.zzd = zzboVar == null ? null : zzboVar.zzb;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.android.gms.internal.mlkit_vision_barcode.zzbr.zzg(com.google.android.gms.internal.mlkit_vision_barcode.zzbr):int */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean zIsEmpty = this.zzb.isEmpty();
        boolean zAdd = this.zzb.add(obj);
        if (zAdd) {
            this.zze.zzb++;
            if (zIsEmpty) {
                zza();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.zzb.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        this.zze.zzb += size2 - size;
        if (size != 0) {
            return zAddAll;
        }
        zza();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        this.zze.zzb -= size;
        zzc();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new zzbn(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean zRemove = this.zzb.remove(obj);
        if (zRemove) {
            this.zze.zzb--;
            zzc();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.zzb.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.zzb.size();
            this.zze.zzb += size2 - size;
            zzc();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.zzb.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.zzb.size();
            this.zze.zzb += size2 - size;
            zzc();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.zzb.toString();
    }

    public final void zza() {
        zzbo zzboVar = this.zzc;
        if (zzboVar != null) {
            zzboVar.zza();
            return;
        }
        zzbr zzbrVar = this.zze;
        zzbrVar.zza.put(this.zza, this.zzb);
    }

    public final void zzb() {
        zzbo zzboVar = this.zzc;
        if (zzboVar != null) {
            zzboVar.zzb();
            zzbo zzboVar2 = this.zzc;
            if (zzboVar2.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzbr zzbrVar = this.zze;
            Collection collection = (Collection) zzbrVar.zza.get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    public final void zzc() {
        zzbo zzboVar = this.zzc;
        if (zzboVar != null) {
            zzboVar.zzc();
        } else if (this.zzb.isEmpty()) {
            zzbr zzbrVar = this.zze;
            zzbrVar.zza.remove(this.zza);
        }
    }
}
