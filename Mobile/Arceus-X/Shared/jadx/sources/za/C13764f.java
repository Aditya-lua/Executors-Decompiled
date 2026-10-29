package za;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: za.f */
/* JADX INFO: loaded from: classes.dex */
public final class C13764f extends C13759a implements IInterface {
    public C13764f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    /* JADX INFO: renamed from: t2 */
    public final void m50176t2(InterfaceC13766h interfaceC13766h) {
        Parcel parcelM50170r2 = m50170r2();
        C13763e.m50175c(parcelM50170r2, interfaceC13766h);
        m50171s2(1, parcelM50170r2);
    }
}
