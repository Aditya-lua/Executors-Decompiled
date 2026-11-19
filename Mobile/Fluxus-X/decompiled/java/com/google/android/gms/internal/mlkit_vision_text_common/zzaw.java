package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class zzaw implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzba zze;

    public /* synthetic */ zzaw(zzba zzbaVar, zzav zzavVar) {
        this.zze = zzbaVar;
        this.zzb = zzbaVar.zzf;
        this.zzc = zzbaVar.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.zzc;
        this.zzd = i10;
        Object objZza = zza(i10);
        this.zzc = this.zze.zzf(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzx.zzd(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i10 = this.zzd;
        zzba zzbaVar = this.zze;
        zzbaVar.remove(zzba.zzg(zzbaVar, i10));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i10);
}
