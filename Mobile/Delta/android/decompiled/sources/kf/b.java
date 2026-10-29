package kf;

import android.os.IBinder;
import android.os.Parcel;
import com.google.firebase.appindexing.internal.zza;
import com.google.firebase.appindexing.internal.zzg;
import va.x;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends va.a implements d {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    @Override // kf.d
    public final zza q0(l9.g gVar, zzg zzgVar) {
        Parcel parcelR2 = r2();
        x.d(parcelR2, gVar);
        x.c(parcelR2, zzgVar);
        Parcel parcelS2 = s2(8, parcelR2);
        zza zzaVar = (zza) x.a(parcelS2, zza.CREATOR);
        parcelS2.recycle();
        return zzaVar;
    }
}
