package be;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class g1 implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f4009a;
    public final String b = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService";

    public g1(IBinder iBinder, String str) {
        this.f4009a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4009a;
    }

    public final Parcel r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    public final void s2(int i10, Parcel parcel) {
        try {
            this.f4009a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
