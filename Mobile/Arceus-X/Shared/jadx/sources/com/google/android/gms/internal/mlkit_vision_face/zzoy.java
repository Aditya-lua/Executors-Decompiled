package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p571y9.InterfaceC13133a;

/* JADX INFO: loaded from: classes.dex */
public final class zzoy extends zza implements IInterface {
    public zzoy(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    public final List zzd(InterfaceC13133a interfaceC13133a, zzoq zzoqVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, interfaceC13133a);
        zzc.zza(parcelZza, zzoqVar);
        Parcel parcelZzb = zzb(3, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(zzow.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    public final void zze() {
        zzc(1, zza());
    }

    public final void zzf() {
        zzc(2, zza());
    }
}
