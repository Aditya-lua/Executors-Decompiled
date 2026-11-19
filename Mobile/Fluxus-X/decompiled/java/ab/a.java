package ab;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f388a;
    public final String b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public a(IBinder iBinder, String str) {
        this.f388a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f388a;
    }

    public final Parcel r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    public final void s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f388a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
