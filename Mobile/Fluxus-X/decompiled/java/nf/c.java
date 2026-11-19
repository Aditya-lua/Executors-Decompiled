package nf;

import android.os.IBinder;
import android.os.Parcel;
import wa.x;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends wa.a implements e {
    public c(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    @Override // nf.e
    public final a i2(m9.g gVar, g gVar2) {
        Parcel parcelR2 = r2();
        x.d(parcelR2, gVar);
        x.c(parcelR2, gVar2);
        Parcel parcelS2 = s2(8, parcelR2);
        a aVar = (a) x.a(parcelS2, a.CREATOR);
        parcelS2.recycle();
        return aVar;
    }
}
