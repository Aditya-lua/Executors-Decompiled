package ib;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a implements f {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // ib.f
    public final void D1(a0 a0Var) {
        Parcel parcelR2 = r2();
        v.c(parcelR2, a0Var);
        s2(75, parcelR2);
    }

    @Override // ib.f
    public final void k2(r rVar) {
        Parcel parcelR2 = r2();
        v.c(parcelR2, rVar);
        s2(59, parcelR2);
    }

    @Override // ib.f
    public final void q2(boolean z10) {
        Parcel parcelR2 = r2();
        v.a(parcelR2, z10);
        s2(12, parcelR2);
    }
}
