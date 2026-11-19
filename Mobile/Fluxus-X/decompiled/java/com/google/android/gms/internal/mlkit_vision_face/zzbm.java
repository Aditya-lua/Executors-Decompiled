package com.google.android.gms.internal.mlkit_vision_face;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzbm extends zzbn {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbn zzc;

    public zzbm(zzbn zzbnVar, int i10, int i11) {
        this.zzc = zzbnVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzab.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn
    /* JADX INFO: renamed from: zzf */
    public final zzbn subList(int i10, int i11) {
        zzab.zzc(i10, i11, this.zzb);
        zzbn zzbnVar = this.zzc;
        int i12 = this.zza;
        return zzbnVar.subList(i10 + i12, i11 + i12);
    }
}
