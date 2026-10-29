package bb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: bb.a */
/* JADX INFO: loaded from: classes.dex */
public class C1293a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f5331a;

    /* JADX INFO: renamed from: b */
    public final String f5332b;

    public C1293a(IBinder iBinder, String str) {
        this.f5331a = iBinder;
        this.f5332b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5331a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m7086r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f5332b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m7087s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f5331a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: t2 */
    public final void m7088t2(int i10, Parcel parcel) {
        try {
            this.f5331a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
