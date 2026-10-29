package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
final class zzch extends zzbp {
    static final zzbp zza = new zzch(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    private zzch(Object obj, Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    public static zzch zzg(int i10, Object[] objArr, zzbo zzboVar) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        zzau.zzb(obj, obj2);
        return new zzch(null, objArr, 1);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.zzb;
        int i10 = this.zzc;
        if (obj != null && i10 == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp
    public final zzbi zza() {
        return new zzcg(this.zzb, 1, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp
    public final zzbq zzd() {
        return new zzce(this, this.zzb, 0, this.zzc);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbp
    public final zzbq zze() {
        return new zzcf(this, new zzcg(this.zzb, 0, this.zzc));
    }
}
