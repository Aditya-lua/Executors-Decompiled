package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
abstract class zzbj implements Iterator {
    final Iterator zza;
    Object zzb = null;
    Collection zzc = null;
    Iterator zzd = zzcw.INSTANCE;
    final /* synthetic */ zzbr zze;

    public zzbj(zzbr zzbrVar) {
        this.zze = zzbrVar;
        this.zza = zzbrVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzd.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzd.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzc = collection;
            this.zzd = collection.iterator();
        }
        return zza(this.zzb, this.zzd.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzd.remove();
        Collection collection = this.zzc;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        this.zze.zzb--;
    }

    public abstract Object zza(Object obj, Object obj2);
}
