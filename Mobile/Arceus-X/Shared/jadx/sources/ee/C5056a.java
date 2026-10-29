package ee;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ee.a */
/* JADX INFO: loaded from: classes2.dex */
public class C5056a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f19876a;

    /* JADX INFO: renamed from: b */
    public final String f19877b;

    public C5056a(IBinder iBinder, String str) {
        this.f19876a = iBinder;
        this.f19877b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19876a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m23766r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f19877b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m23767s2(int i10, Parcel parcel) {
        try {
            this.f19876a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
