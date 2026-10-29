package gb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: gb.a */
/* JADX INFO: loaded from: classes.dex */
public class C6081a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f23381a;

    /* JADX INFO: renamed from: b */
    public final String f23382b;

    public C6081a(IBinder iBinder, String str) {
        this.f23381a = iBinder;
        this.f23382b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f23381a;
    }

    /* JADX INFO: renamed from: r2 */
    public Parcel m26944r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f23382b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public void m26945s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f23381a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
