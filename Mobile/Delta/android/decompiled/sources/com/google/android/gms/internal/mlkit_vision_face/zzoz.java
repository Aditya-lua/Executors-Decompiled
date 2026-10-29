package com.google.android.gms.internal.mlkit_vision_face;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import y9.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzoz extends zza implements zzpb {
    public zzoz(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzpb
    public final zzoy zzd(a aVar, zzou zzouVar) {
        zzoy zzoyVar;
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, aVar);
        zzc.zza(parcelZza, zzouVar);
        Parcel parcelZzb = zzb(1, parcelZza);
        IBinder strongBinder = parcelZzb.readStrongBinder();
        if (strongBinder == null) {
            zzoyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            zzoyVar = iInterfaceQueryLocalInterface instanceof zzoy ? (zzoy) iInterfaceQueryLocalInterface : new zzoy(strongBinder);
        }
        parcelZzb.recycle();
        return zzoyVar;
    }
}
