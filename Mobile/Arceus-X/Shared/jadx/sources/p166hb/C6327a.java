package p166hb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: hb.a */
/* JADX INFO: loaded from: classes.dex */
public class C6327a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f24070a;

    /* JADX INFO: renamed from: b */
    public final String f24071b;

    public C6327a(IBinder iBinder, String str) {
        this.f24070a = iBinder;
        this.f24071b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f24070a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m27636r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f24071b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m27637s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f24070a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
