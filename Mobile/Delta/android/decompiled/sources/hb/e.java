package hb;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.location.zzbc;
import com.google.android.gms.internal.location.zzl;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a implements f {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // hb.f
    public final void W(zzl zzlVar) {
        Parcel parcelR2 = r2();
        t.c(parcelR2, zzlVar);
        s2(75, parcelR2);
    }

    @Override // hb.f
    public final void q2(boolean z10) {
        Parcel parcelR2 = r2();
        t.a(parcelR2, z10);
        s2(12, parcelR2);
    }

    @Override // hb.f
    public final void w(zzbc zzbcVar) {
        Parcel parcelR2 = r2();
        t.c(parcelR2, zzbcVar);
        s2(59, parcelR2);
    }
}
