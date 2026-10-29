package ua;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ua.a */
/* JADX INFO: loaded from: classes.dex */
public class C11831a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f41591a;

    /* JADX INFO: renamed from: b */
    public final String f41592b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public C11831a(IBinder iBinder, String str) {
        this.f41591a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f41591a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m44217r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f41592b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final Parcel m44218s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f41591a.transact(i10, parcel, parcelObtain, 0);
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
