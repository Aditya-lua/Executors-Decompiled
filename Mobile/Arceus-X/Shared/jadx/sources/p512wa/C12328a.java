package p512wa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: wa.a */
/* JADX INFO: loaded from: classes.dex */
public class C12328a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f44185a;

    /* JADX INFO: renamed from: b */
    public final String f44186b = "com.google.android.gms.appset.internal.IAppSetService";

    public C12328a(IBinder iBinder, String str) {
        this.f44185a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f44185a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m46183r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f44186b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m46184s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f44185a.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
