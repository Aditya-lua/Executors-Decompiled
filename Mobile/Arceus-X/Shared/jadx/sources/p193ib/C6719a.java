package p193ib;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ib.a */
/* JADX INFO: loaded from: classes.dex */
public class C6719a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f25825a;

    /* JADX INFO: renamed from: b */
    public final String f25826b;

    public C6719a(IBinder iBinder, String str) {
        this.f25825a = iBinder;
        this.f25826b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25825a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m28812r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f25826b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m28813s2(int i10, Parcel parcel) {
        try {
            this.f25825a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
