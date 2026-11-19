package k9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import o9.x1;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends p9.a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f21264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21266i;

    public j0(String str, z zVar, boolean z10, boolean z11) {
        this.f21263f = str;
        this.f21264g = zVar;
        this.f21265h = z10;
        this.f21266i = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f21263f;
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, str, false);
        z zVar = this.f21264g;
        if (zVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zVar = null;
        }
        p9.c.m(parcel, 2, zVar, false);
        p9.c.c(parcel, 3, this.f21265h);
        p9.c.c(parcel, 4, this.f21266i);
        p9.c.b(parcel, iA);
    }

    public j0(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f21263f = str;
        a0 a0Var = null;
        if (iBinder != null) {
            try {
                z9.a aVarZzd = x1.s2(iBinder).zzd();
                byte[] bArr = aVarZzd == null ? null : (byte[]) z9.b.t2(aVarZzd);
                if (bArr != null) {
                    a0Var = new a0(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f21264g = a0Var;
        this.f21265h = z10;
        this.f21266i = z11;
    }
}
