package com.google.android.gms.internal.mlkit_vision_face;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class zzan extends zzal implements ListIterator {
    final /* synthetic */ zzao zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzao zzaoVar) {
        super(zzaoVar);
        this.zzd = zzaoVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.zzd.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzap.zzd(this.zzd.zzf);
        if (zIsEmpty) {
            this.zzd.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzao zzaoVar, int i10) {
        super(zzaoVar, ((List) zzaoVar.zzb).listIterator(i10));
        this.zzd = zzaoVar;
    }
}
