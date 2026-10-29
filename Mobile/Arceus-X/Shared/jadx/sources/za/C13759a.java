package za;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: za.a */
/* JADX INFO: loaded from: classes.dex */
public class C13759a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f48326a;

    /* JADX INFO: renamed from: b */
    public final String f48327b = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public C13759a(IBinder iBinder, String str) {
        this.f48326a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f48326a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m50170r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f48327b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m50171s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f48326a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
