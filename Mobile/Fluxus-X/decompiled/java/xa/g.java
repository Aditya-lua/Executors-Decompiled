package xa;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void t2(y8.d dVar, f fVar) {
        Parcel parcelR2 = r2();
        c.b(parcelR2, dVar);
        c.c(parcelR2, fVar);
        s2(1, parcelR2);
    }
}
