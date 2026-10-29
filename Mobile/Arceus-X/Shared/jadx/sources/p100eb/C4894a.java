package p100eb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: eb.a */
/* JADX INFO: loaded from: classes.dex */
public class C4894a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f19623a;

    /* JADX INFO: renamed from: b */
    public final String f19624b;

    public C4894a(IBinder iBinder, String str) {
        this.f19623a = iBinder;
        this.f19624b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19623a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m23545r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f19624b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m23546s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f19623a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
