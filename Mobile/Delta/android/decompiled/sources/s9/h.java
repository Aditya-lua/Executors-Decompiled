package s9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;

/* JADX INFO: loaded from: classes.dex */
public final class h extends bb.a implements IInterface {
    public h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void u2(g gVar, ApiFeatureRequest apiFeatureRequest) {
        Parcel parcelR2 = r2();
        bb.c.d(parcelR2, gVar);
        bb.c.c(parcelR2, apiFeatureRequest);
        s2(1, parcelR2);
    }

    public final void v2(g gVar, ApiFeatureRequest apiFeatureRequest, j jVar) {
        Parcel parcelR2 = r2();
        bb.c.d(parcelR2, gVar);
        bb.c.c(parcelR2, apiFeatureRequest);
        bb.c.d(parcelR2, jVar);
        s2(2, parcelR2);
    }

    public final void w2(l9.g gVar, j jVar) {
        Parcel parcelR2 = r2();
        bb.c.d(parcelR2, gVar);
        bb.c.d(parcelR2, jVar);
        s2(6, parcelR2);
    }
}
