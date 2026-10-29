package be;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: be.g1 */
/* JADX INFO: loaded from: classes2.dex */
public class C1325g1 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f5370a;

    /* JADX INFO: renamed from: b */
    public final String f5371b = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService";

    public C1325g1(IBinder iBinder, String str) {
        this.f5370a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5370a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m7165r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f5371b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m7166s2(int i10, Parcel parcel) {
        try {
            this.f5370a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
