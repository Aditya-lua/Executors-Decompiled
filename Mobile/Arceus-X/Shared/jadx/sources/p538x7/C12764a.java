package p538x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: x7.a */
/* JADX INFO: loaded from: classes.dex */
public class C12764a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f45501a;

    /* JADX INFO: renamed from: b */
    public final String f45502b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public C12764a(IBinder iBinder) {
        this.f45501a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45501a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m47632r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f45502b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final Parcel m47633s2(Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f45501a.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } catch (Throwable th2) {
            parcel.recycle();
            throw th2;
        }
    }
}
