package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzag implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzah zzc;

    public zzag(zzah zzahVar) {
        this.zzc = zzahVar;
        this.zza = zzahVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        zzah zzahVar = this.zzc;
        Object key = entry.getKey();
        return new zzbj(key, zzahVar.zzb.zzb(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzab.zzd(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        zzap.zzg(this.zzc.zzb, this.zzb.size());
        this.zzb.clear();
        this.zzb = null;
    }
}
