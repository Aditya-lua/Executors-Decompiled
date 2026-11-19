package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes.dex */
final class zzax implements zzbc {
    private final int zza;
    private final zzbb zzb;

    public zzax(int i10, zzbb zzbbVar) {
        this.zza = i10;
        this.zzb = zzbbVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return zzbc.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbc)) {
            return false;
        }
        zzbc zzbcVar = (zzbc) obj;
        return this.zza == zzbcVar.zza() && this.zzb.equals(zzbcVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + ')';
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbc
    public final zzbb zzb() {
        return this.zzb;
    }
}
