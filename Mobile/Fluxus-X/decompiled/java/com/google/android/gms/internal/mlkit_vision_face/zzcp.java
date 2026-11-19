package com.google.android.gms.internal.mlkit_vision_face;

/* JADX INFO: loaded from: classes.dex */
final class zzcp implements zzcu {
    private final int zza;
    private final zzct zzb;

    public zzcp(int i10, zzct zzctVar) {
        this.zza = i10;
        this.zzb = zzctVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzcu.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcu)) {
            return false;
        }
        zzcu zzcuVar = (zzcu) obj;
        return this.zza == zzcuVar.zza() && this.zzb.equals(zzcuVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzcu
    public final zzct zzb() {
        return this.zzb;
    }
}
