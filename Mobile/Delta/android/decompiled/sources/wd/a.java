package wd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f34164a;
    public final String b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    public a(IBinder iBinder, String str) {
        this.f34164a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34164a;
    }

    public final Parcel r2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.b);
        return parcelObtain;
    }

    public final void s2(int i10, Parcel parcel) {
        try {
            this.f34164a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
