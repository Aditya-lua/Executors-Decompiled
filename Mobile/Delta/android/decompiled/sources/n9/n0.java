package n9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzp;
import com.google.android.gms.common.zzr;
import com.google.android.gms.common.zzt;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends db.a implements p0 {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // n9.p0
    public final zzr H1(zzp zzpVar) {
        Parcel parcelS2 = s2();
        db.o.c(parcelS2, zzpVar);
        Parcel parcelR2 = r2(6, parcelS2);
        zzr zzrVar = (zzr) db.o.b(parcelR2, zzr.CREATOR);
        parcelR2.recycle();
        return zzrVar;
    }

    @Override // n9.p0
    public final boolean N(zzt zztVar, y9.a aVar) {
        Parcel parcelS2 = s2();
        db.o.c(parcelS2, zztVar);
        db.o.d(parcelS2, aVar);
        Parcel parcelR2 = r2(5, parcelS2);
        boolean zA = db.o.a(parcelR2);
        parcelR2.recycle();
        return zA;
    }

    @Override // n9.p0
    public final boolean c() {
        Parcel parcelR2 = r2(7, s2());
        boolean zA = db.o.a(parcelR2);
        parcelR2.recycle();
        return zA;
    }

    @Override // n9.p0
    public final zzr d2(zzp zzpVar) {
        Parcel parcelS2 = s2();
        db.o.c(parcelS2, zzpVar);
        Parcel parcelR2 = r2(8, parcelS2);
        zzr zzrVar = (zzr) db.o.b(parcelR2, zzr.CREATOR);
        parcelR2.recycle();
        return zzrVar;
    }
}
