package o9;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends eb.a implements z0 {
    public x0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // o9.z0
    public final k9.h0 N1(k9.f0 f0Var) {
        Parcel parcelS2 = s2();
        eb.o.c(parcelS2, f0Var);
        Parcel parcelR2 = r2(8, parcelS2);
        k9.h0 h0Var = (k9.h0) eb.o.b(parcelR2, k9.h0.CREATOR);
        parcelR2.recycle();
        return h0Var;
    }

    @Override // o9.z0
    public final boolean Q1(k9.j0 j0Var, z9.a aVar) {
        Parcel parcelS2 = s2();
        eb.o.c(parcelS2, j0Var);
        eb.o.d(parcelS2, aVar);
        Parcel parcelR2 = r2(5, parcelS2);
        boolean zA = eb.o.a(parcelR2);
        parcelR2.recycle();
        return zA;
    }

    @Override // o9.z0
    public final boolean c() {
        Parcel parcelR2 = r2(7, s2());
        boolean zA = eb.o.a(parcelR2);
        parcelR2.recycle();
        return zA;
    }

    @Override // o9.z0
    public final k9.h0 l2(k9.f0 f0Var) {
        Parcel parcelS2 = s2();
        eb.o.c(parcelS2, f0Var);
        Parcel parcelR2 = r2(6, parcelS2);
        k9.h0 h0Var = (k9.h0) eb.o.b(parcelR2, k9.h0.CREATOR);
        parcelR2.recycle();
        return h0Var;
    }
}
