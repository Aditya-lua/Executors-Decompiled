package p572ya;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ya.a */
/* JADX INFO: loaded from: classes.dex */
public class C13136a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f46391a;

    /* JADX INFO: renamed from: b */
    public final String f46392b;

    public C13136a(IBinder iBinder, String str) {
        this.f46391a = iBinder;
        this.f46392b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f46391a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m48744r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f46392b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m48745s2(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f46391a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
