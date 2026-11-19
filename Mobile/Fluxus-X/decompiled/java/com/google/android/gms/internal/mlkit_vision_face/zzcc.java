package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
final class zzcc extends zzbn {
    static final zzbn zza = new zzcc(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzcc(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzab.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final Object[] zze() {
        return this.zzb;
    }
}
