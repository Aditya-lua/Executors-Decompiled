package p125fb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: fb.a */
/* JADX INFO: loaded from: classes.dex */
public class C5496a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f21258a;

    /* JADX INFO: renamed from: b */
    public final String f21259b;

    public C5496a(IBinder iBinder, String str) {
        this.f21258a = iBinder;
        this.f21259b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21258a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m25149r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f21259b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m25150s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f21258a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
