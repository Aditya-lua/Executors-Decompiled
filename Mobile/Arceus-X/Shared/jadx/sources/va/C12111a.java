package va;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: va.a */
/* JADX INFO: loaded from: classes.dex */
public class C12111a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f42729a;

    /* JADX INFO: renamed from: b */
    public final String f42730b;

    public C12111a(IBinder iBinder, String str) {
        this.f42729a = iBinder;
        this.f42730b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f42729a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m44948r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f42730b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final Parcel m44949s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f42729a.transact(8, parcel, parcelObtain, 0);
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

    /* JADX INFO: renamed from: t2 */
    public final void m44950t2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f42729a.transact(7, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
