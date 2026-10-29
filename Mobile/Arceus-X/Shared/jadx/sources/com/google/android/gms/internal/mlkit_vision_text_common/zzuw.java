package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p571y9.InterfaceC13133a;

/* JADX INFO: loaded from: classes.dex */
public final class zzuw extends zza implements zzuy {
    public zzuw(IBinder iBinder) {
        super(iBinder, "com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzuy
    public final zzuv zzd(InterfaceC13133a interfaceC13133a) {
        zzuv zzuvVar;
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, interfaceC13133a);
        Parcel parcelZzb = zzb(1, parcelZza);
        IBinder strongBinder = parcelZzb.readStrongBinder();
        if (strongBinder == null) {
            zzuvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            zzuvVar = iInterfaceQueryLocalInterface instanceof zzuv ? (zzuv) iInterfaceQueryLocalInterface : new zzuv(strongBinder);
        }
        parcelZzb.recycle();
        return zzuvVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzuy
    public final zzuv zze(InterfaceC13133a interfaceC13133a, zzvh zzvhVar) {
        zzuv zzuvVar;
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, interfaceC13133a);
        zzc.zza(parcelZza, zzvhVar);
        Parcel parcelZzb = zzb(2, parcelZza);
        IBinder strongBinder = parcelZzb.readStrongBinder();
        if (strongBinder == null) {
            zzuvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizer");
            zzuvVar = iInterfaceQueryLocalInterface instanceof zzuv ? (zzuv) iInterfaceQueryLocalInterface : new zzuv(strongBinder);
        }
        parcelZzb.recycle();
        return zzuvVar;
    }
}
