package p543xd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: xd.a */
/* JADX INFO: loaded from: classes2.dex */
public class C12780a implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f45516a;

    /* JADX INFO: renamed from: b */
    public final String f45517b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    public C12780a(IBinder iBinder, String str) {
        this.f45516a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45516a;
    }

    /* JADX INFO: renamed from: r2 */
    public final Parcel m47644r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f45517b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m47645s2(int i10, Parcel parcel) {
        try {
            this.f45516a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
